package created;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import generated.*;
import created.*;
import error.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
        input.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        input.setCodeFoldingEnabled(true);
        input.setAntiAliasingEnabled(true);
        input.setTabSize(4);

        // Colors and formatting
//        hsb = Color.RGBtoHSB(30, 30, 30, null);
//        input.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
//        hsb = Color.RGBtoHSB(240, 240, 240, null);
//        input.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
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
        CompletionProvider provider = createCompletionProvider();
        AutoCompletion ac = new AutoCompletion(provider);
        ac.install(input);

        /**
         * Output text area
         */
        output = new JTextArea(10, 100);

        // Behaviors
        output.setText("Result(s):\n");
        output.setEditable(false);

        // Colors and formatting
//        hsb = Color.RGBtoHSB(51, 51, 51, null);
//        output.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
//        hsb = Color.RGBtoHSB(240, 240, 240, null);
//        output.setForeground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        output.setFont(new Font("Liberation Mono", Font.PLAIN, 12));

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
            //method
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
        MainConyo.execute();
    }

    public void parse() {
        OutGen.clear();
        MainConyo.parse(true);
    }
    
     private CompletionProvider createCompletionProvider() {
        DefaultCompletionProvider provider = new DefaultCompletionProvider();

        provider.addCompletion(new BasicCompletion(provider, "OMG"));
        provider.addCompletion(new BasicCompletion(provider, "hireYaya"));
        provider.addCompletion(new BasicCompletion(provider, "bayad"));
        provider.addCompletion(new BasicCompletion(provider, "makeBalik"));
        provider.addCompletion(new BasicCompletion(provider, "superYaya"));
        provider.addCompletion(new BasicCompletion(provider, "makeArte"));
        provider.addCompletion(new BasicCompletion(provider, "breakup"));
        provider.addCompletion(new BasicCompletion(provider, "makeup"));
        provider.addCompletion(new BasicCompletion(provider, "makeTawag"));
        provider.addCompletion(new BasicCompletion(provider, "makeSulat"));
        provider.addCompletion(new BasicCompletion(provider, "makeBasa"));
        provider.addCompletion(new BasicCompletion(provider, "likeKapag"));
        provider.addCompletion(new BasicCompletion(provider, "thisNalang"));
        provider.addCompletion(new BasicCompletion(provider, "thisNalangKapag"));
        provider.addCompletion(new BasicCompletion(provider, "makePalit"));
        provider.addCompletion(new BasicCompletion(provider, "MRW"));
        provider.addCompletion(new BasicCompletion(provider, "MDR"));
        provider.addCompletion(new BasicCompletion(provider, "likeHabang"));
        provider.addCompletion(new BasicCompletion(provider, "makeGawa"));
        provider.addCompletion(new BasicCompletion(provider, "makeUlit"));
        provider.addCompletion(new BasicCompletion(provider, "inty"));
        provider.addCompletion(new BasicCompletion(provider, "floaty"));
        provider.addCompletion(new BasicCompletion(provider, "chary"));
        provider.addCompletion(new BasicCompletion(provider, "stringy"));
        provider.addCompletion(new BasicCompletion(provider, "booly"));
        provider.addCompletion(new BasicCompletion(provider, "yuhh"));
        provider.addCompletion(new BasicCompletion(provider, "nuhh"));
        provider.addCompletion(new BasicCompletion(provider, "poor"));
        provider.addCompletion(new BasicCompletion(provider, "waley"));
        provider.addCompletion(new BasicCompletion(provider, "makeKuha"));

        provider.addCompletion(new ShorthandCompletion(provider, "msulat",
              "makeSulat(", "makeSulat("));
        provider.addCompletion(new ShorthandCompletion(provider, "syaya",
              "superYaya\n$\n\n$", "superYaya\n$\n\n$"));

        return provider;
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
