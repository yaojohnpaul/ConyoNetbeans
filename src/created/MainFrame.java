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
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;

/**
 *
 * @author John Paul
 */
public class MainFrame extends javax.swing.JFrame implements ActionListener {

    public static RSyntaxTextArea input;
    public static JTextArea output;
    public static ConyoLexer s = null;
    private boolean fileChanged = false;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        JPanel cp = new JPanel(new BorderLayout());
        float[] hsb;

        /*
         * Input text area
         */
        input = new RSyntaxTextArea(20, 100);

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
        
        RTextScrollPane input_sp = new RTextScrollPane(input);
        input_sp.setFoldIndicatorEnabled(true);
        cp.add(BorderLayout.CENTER, input_sp);

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
            if(fileChanged) {
                int choice = JOptionPane.showConfirmDialog(rootPane, "Want to save your changes?", "Conyo IDE", JOptionPane.YES_NO_CANCEL_OPTION);

                if(choice == JOptionPane.YES_OPTION){
                    MainConyo.save_file();
                }else if(choice == JOptionPane.NO_OPTION){
                    input.setText("");
                    setTitle("Conyo IDE - New File");
                    MainConyo.new_file();
                }      
            }else {
                input.setText("");
                setTitle("Conyo IDE - New File");
                MainConyo.new_file();
            }
             
            fileChanged = false;
        }else if (command.equals("OpenFile")) {
            if(MainConyo.open_file())
                setTitle("Conyo IDE - " + MainConyo.getCurrentFile().getName());
            fileChanged = false;
        }else if (command.equals("SaveFile")) {
            if(MainConyo.save_file())
                setTitle("Conyo IDE - " + MainConyo.getCurrentFile().getName());
            fileChanged = false;
        }else if (command.equals("Execute")) {
            OutGen.clear();
            MainConyo.execute();
        }else if (command.equals("Parse")) {
            OutGen.clear();
            MainConyo.parse(true);
        }else if (command.equals("WatchAndTrace")) {
            //method
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
