package created;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import generated.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;
import org.fife.ui.autocomplete.*;
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;

/**
 *
 * @author John Paul
 */
public class MainFrame extends javax.swing.JFrame implements KeyListener, ActionListener {

    public static RSyntaxTextArea input;
    public static JTextArea output;
    public static ConyoLexer s = null;
    public static AutoCompletion ac;
    public static String[] defaultCompletions = {"OMG", "hireYaya", "bayad", "makeBalik", "superYaya", "makeArte",
        "breakup", "makeup", "makeTawag", "makeSulat", "likeKapag", "thisNalang",
        "thisNalangKapag", "makePalit", "MRW", "MDR", "likeHabang", "makeGawa",
        "makeUlit", "inty", "floaty", "chary", "stringy", "booly",
        "yuhh", "nuhh", "poor", "waley", "makeKuha"};
    private boolean fileChanged = false;
    private boolean isControlPressed = false;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        JPanel cp = new JPanel(new BorderLayout());
        float[] hsb;

        /*
         * Input text area 
         * (c) Robert Futrell
         * https://github.com/bobbylight/RSyntaxTextArea
         */
        input = new RSyntaxTextArea(20, 100);
        input.setText("superYaya\n$\n\t/*Code here*/\n$");

        // Behaviors
        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/conyo++", "generated.ConyoPlusPlusTokenMaker");
        //input.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        input.setSyntaxEditingStyle("text/conyo++");
        input.setCodeFoldingEnabled(true);
        input.setAntiAliasingEnabled(true);
        input.setTabSize(4);
        
        // Colors and formatting
        SyntaxScheme scheme = input.getSyntaxScheme();
        hsb = Color.RGBtoHSB(72, 107, 154, null);
        scheme.getStyle(Token.RESERVED_WORD).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
        hsb = Color.RGBtoHSB(93, 144, 205, null);
        scheme.getStyle(Token.RESERVED_WORD_2).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
        hsb = Color.RGBtoHSB(70, 70, 70, null);
        scheme.getStyle(Token.IDENTIFIER).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
        
        /*
         * Dark theme
         *
         */
//        hsb = Color.RGBtoHSB(25, 25, 25, null);
//        input.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
//        hsb = Color.RGBtoHSB(146, 146, 146, null);
//        input.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
//        hsb = Color.RGBtoHSB(30, 30, 30, null);
//        input.setCurrentLineHighlightColor(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
//        hsb = Color.RGBtoHSB(146, 146, 146, null);
//        scheme.getStyle(Token.IDENTIFIER).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
//        hsb = Color.RGBtoHSB(70, 76, 69, null);
//        scheme.getStyle(Token.COMMENT_MULTILINE).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
//        hsb = Color.RGBtoHSB(70, 76, 69, null);
//        scheme.getStyle(Token.COMMENT_DOCUMENTATION).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
//        hsb = Color.RGBtoHSB(70, 76, 69, null);
//        scheme.getStyle(Token.COMMENT_EOL).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
//        hsb = Color.RGBtoHSB(70, 76, 69, null);
//        scheme.getStyle(Token.COMMENT_KEYWORD).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
//        hsb = Color.RGBtoHSB(70, 76, 69, null);
//        scheme.getStyle(Token.COMMENT_MARKUP).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
//         hsb = Color.RGBtoHSB(72, 107, 154, null);
//        scheme.getStyle(Token.LITERAL_STRING_DOUBLE_QUOTE).foreground = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
        
        input.setFont(new Font("Liberation Mono", Font.PLAIN, 12));
        input.getDocument().addDocumentListener(new CustomDocumentListener());
        input.addKeyListener(this);

        RTextScrollPane input_sp = new RTextScrollPane(input);
        input_sp.setFoldIndicatorEnabled(true);
        cp.add(BorderLayout.CENTER, input_sp);

        /*
         * Auto-complete
         * (c) Robert Futrell
         * https://github.com/bobbylight/AutoComplete
         */
        DefaultCompletionProvider provider = new DefaultCompletionProvider();
        addDefaultCompletionProviders(provider);
        ac = new AutoCompletion(provider);
        ac.install(input);

        /**
         * Output text area
         */
        output = new JTextArea(10, 100);

        // Behaviors
        output.setText("Result(s):\n");

        // Colors and formatting
//        hsb = Color.RGBtoHSB(50, 50, 50, null);
//        output.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
//        hsb = Color.RGBtoHSB(240, 240, 240, null);
//        output.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        output.setFont(new Font("Liberation Mono", Font.PLAIN, 12));

        output.getInputMap().put(KeyStroke.getKeyStroke("BACK_SPACE"), "none");
        JScrollPane output_sp = new JScrollPane(output);
        cp.add(BorderLayout.SOUTH, output_sp);

        /*
         * Context menu
         */
        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu run = new JMenu("Run");
        JMenu debug = new JMenu("Debug");

        mb.add(file);
        mb.add(run);
        mb.add(debug);

        // File->New File
        JMenuItem new_file = new JMenuItem("New File");
        new_file.setActionCommand("NewFile");
        new_file.addActionListener(this);
        file.add(new_file);

        // File->Open File
        JMenuItem open_file = new JMenuItem("Open File");
        open_file.setActionCommand("OpenFile");
        open_file.addActionListener(this);
        file.add(open_file);

        // File->Save File
        JMenuItem save_file = new JMenuItem("Save File");
        save_file.setActionCommand("SaveFile");
        save_file.addActionListener(this);
        file.add(save_file);

        // Run->Execute
        JMenuItem execute = new JMenuItem("Execute");
        execute.setActionCommand("Execute");
        execute.addActionListener(this);
        run.add(execute);

        // Run->Parse
        JMenuItem parse = new JMenuItem("Parse");
        parse.setActionCommand("Parse");
        parse.addActionListener(this);
        run.add(parse);

        // Debug->Watch and Trace
        JMenuItem watch_and_trace = new JMenuItem("Watch and Trace");
        watch_and_trace.setActionCommand("WatchAndTrace");
        watch_and_trace.addActionListener(this);
        debug.add(watch_and_trace);

        setJMenuBar(mb);

        setContentPane(cp);
        setTitle("Conyo IDE - New File");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("NewFile")) {
            newFile();
        } else if (command.equals("OpenFile")) {
            openFile();
        } else if (command.equals("SaveFile")) {
            saveFile();
        } else if (command.equals("Execute")) {
            execute();
        } else if (command.equals("Parse")) {
            parse();
        } else if (command.equals("WatchAndTrace")) {
            watchAndTrace();
        }
    }

    public void newFile() {
        if (fileChanged) {
            int choice = JOptionPane.showConfirmDialog(rootPane, "Want to save your changes?", "Conyo IDE", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                MainConyo.save_file();
            } else if (choice == JOptionPane.NO_OPTION) {
                input.setText("");
                setTitle("Conyo IDE - New File");
                MainConyo.new_file();
            }
        } else {
            input.setText("");
            setTitle("Conyo IDE - New File");
            MainConyo.new_file();
        }

        fileChanged = false;
    }

    public void openFile() {
        if (fileChanged) {
            int choice = JOptionPane.showConfirmDialog(rootPane, "Want to save your changes?", "Conyo IDE", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                MainConyo.save_file();
            } else if (choice == JOptionPane.NO_OPTION) {
                if (MainConyo.open_file()) {
                    setTitle("Conyo IDE - " + MainConyo.getCurrentFile().getName());
                }
            }
        } else {
            if (MainConyo.open_file()) {
                setTitle("Conyo IDE - " + MainConyo.getCurrentFile().getName());
            }
        }
    }

    public void saveFile() {
        if (MainConyo.save_file()) {
            setTitle("Conyo IDE - " + MainConyo.getCurrentFile().getName());
        }
        fileChanged = false;
    }

    public void execute() {
        OutGen.clear();
        ExecutionThread t = new ExecutionThread();
        t.start();
    }

    public void parse() {
        OutGen.clear();
        MainConyo.parse(true);
    }

    public void watchAndTrace() {
        OutGen.clear();
        WatchAndTrace.setVersion(1);
        WatchAndTrace window = WatchAndTrace.getInstance();
        window.setVisible(true);
        ExecutionThread t = new ExecutionThread();
        t.start();
    }

    public static String scanInput() throws BadLocationException {
        int offset = output.getLineEndOffset(output.getLineCount() - 1);
        int length = 0;
        
        while (output.getText().charAt(output.getLineEndOffset(output.getLineCount() - 1) - 1) != '\n' || length == 0) {
            if(output.getCaretPosition() < offset)
                output.setCaretPosition(offset);
            System.out.println();
            length = output.getLineEndOffset(output.getLineCount() - 1) - offset;
        }

        return output.getText(offset, length - 1);
    }

    class ExecutionThread extends Thread {

        @Override
        public void run() {
            synchronized (this) {
                MainConyo.execute();
            }
        }
    }

    public static void addDefaultCompletionProviders(DefaultCompletionProvider provider) {
        for (String s : defaultCompletions) {
            provider.addCompletion(new BasicCompletion(provider, s));
        }

        provider.addCompletion(new ShorthandCompletion(provider, "msulat",
                "makeSulat(", "makeSulat("));
        provider.addCompletion(new ShorthandCompletion(provider, "syaya",
                "superYaya\n$\n\n$", "superYaya\n$\n\n$"));
    }

    public static void newCompletion(char[] text, int start, int end) {
        String temp = new String(text);
        String key;
//        Boolean isReservedWord = false;
        DefaultCompletionProvider provider = new DefaultCompletionProvider();
//        ArrayList<String> completions = new ArrayList<>();

        if (!temp.substring(end + 1).trim().isEmpty()) {

            key = temp.substring(start, end + 1);

//            String[] keywords = temp.split("[\n\r\\s\t\b\012]");
//
//            for (String s : keywords) {
//                isReservedWord = false;
//
//                if (s.isEmpty()) {
//                    continue;
//                }
//                if (s.contains("/*") || s.contains("*/")) {
//                    continue;
//                }
//                for (String t : defaultCompletions) {
//                    if (s.equals(t)) {
//                        isReservedWord = true;
//                        break;
//                    }
//                }
//                if (isReservedWord) {
//                    continue;
//                }
//            }
            if (/*!completions.contains(key) &&*/key.length() > 2) {
                ac.uninstall();
                addDefaultCompletionProviders(provider);
                provider.addCompletion(new BasicCompletion(provider, key));
                AutoCompletion ac = new AutoCompletion(provider);
                ac.install(input);
//                completions.add(key);
            }

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
            isControlPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_N && isControlPressed) {
            newFile();
        }
        if (e.getKeyCode() == KeyEvent.VK_O && isControlPressed) {
            openFile();
        }
        if (e.getKeyCode() == KeyEvent.VK_S && isControlPressed) {
            saveFile();
        }
        if (e.getKeyCode() == KeyEvent.VK_F6) {
            execute();
        }
        if (e.getKeyCode() == KeyEvent.VK_F7) {
            watchAndTrace();
        }
        if (e.getKeyCode() == KeyEvent.VK_F9) {
            parse();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
            isControlPressed = false;
        }
    }

    private class CustomDocumentListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            fileChanged = true;
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            fileChanged = true;
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            fileChanged = true;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
