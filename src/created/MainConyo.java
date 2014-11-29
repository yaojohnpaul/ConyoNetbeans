package created;

import static created.MainFrame.input;
import generated.*;
import error.*;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

class MainConyo {

    private final static JFrame file_frame = new JFrame("JFileChooser Demo");
    private final static JFileChooser fc = new JFileChooser();
    private static File currentFile;

    private static ConyoLexer s = null;
//
//    /*Which test case to use.*/
//    private static String test_file = "simple";
//
//    public static void main(String argv[]) {
//
//    }

    public static void execute() {
        try {
            long start;
            long end;
            int duration;

            start = System.nanoTime();
            Conyogram c = parse(false);

            if (c != null) {
                c.setSymList();
                c.checkContext();
                if (ErrorReport.semanticErrorsCount() == 0) {
                    c.preInterpret();
                    c.evaluate();
                }
                ErrorReport.printError();
            }

            end = System.nanoTime();
            duration = (int) Math.round((end - start) / 1000000000);
            
            try {
                c.errorExist();
                
                if(ErrorReport.semanticErrorsCount() == 0 && !c.errorExist())
                {
                    OutGen.addOut("Execution successful (total time: " + duration + " seconds)");
                }
                else
                {
                    OutGen.addOut("Unsuccessful execution (total time: " + duration + " seconds)");
                }
                ErrorReport.resetErrors();
            } catch (NullPointerException n) {
                ErrorReport.error(-2, "Fatal Syntax Error");
                ErrorReport.printError();
                OutGen.addOut("Unsuccessful execution (total time: " + duration + " seconds)");
                ErrorReport.resetErrors();
            }
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
    }

    public static Conyogram parse(Boolean printOut) {
        long start;
        long end;
        int duration;

        start = System.nanoTime();
//                java.io.FileInputStream stream = new java.io.FileInputStream("src/test_cases_ext/" + test_file + ".txt");
//                java.io.Reader reader = new java.io.InputStreamReader(stream, "UTF-8");
//                s = new ConyoLexer(reader);
        s = new ConyoLexer(new StringReader(input.getText()));
        Parser p = new Parser(s);

        Conyogram c = null;

        try {
            c = (Conyogram) p.parse().value;
        } catch (Exception e) {
            System.out.println(e);
        }

        end = System.nanoTime();
        duration = (int) Math.round((end - start) / 1000000000);
        if (printOut) {
            OutGen.addOut("Parsing successful (total time: " + duration + " seconds)");
        }

        return c;
    }

    public static File getCurrentFile() {
        return currentFile;
    }

    public static boolean open_file() {
        int choice;
        BufferedReader reader = null;

        fc.setMultiSelectionEnabled(false);
        fc.setFileFilter(new javax.swing.filechooser.FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                return f.getName().endsWith(".cnyo");
            }

            @Override
            public String getDescription() {
                return "Conyo File";
            }
        });
        fc.setCurrentDirectory(new File("C:\\tmp"));

        choice = fc.showDialog(file_frame, "Open File");

        if (choice == JFileChooser.APPROVE_OPTION) {
            currentFile = fc.getSelectedFile();

            if (currentFile.canRead()) {
                StringBuilder text = new StringBuilder();
                String temp = null;

                try {
                    reader = new BufferedReader(new FileReader(currentFile));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainConyo.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    while ((temp = reader.readLine()) != null) {
                        text.append(temp + "\n");
                    }
                    
                    MainFrame.input.setText(text.toString());

                    return true;
                } catch (IOException ex) {
                    Logger.getLogger(MainConyo.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        return false;
    }

    public static void new_file() {
        currentFile = null;
    }
    
    public static boolean save_file() {
        BufferedWriter out = null; 
        
        if(currentFile != null) {
            try {
                out = new BufferedWriter(new FileWriter(currentFile));
                out.write(MainFrame.input.getText());
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(MainConyo.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(MainConyo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else {
            int choice;

            fc.setMultiSelectionEnabled(false);
            fc.setFileFilter(new javax.swing.filechooser.FileFilter() {

                @Override
                public boolean accept(File f) {
                    if (f.isDirectory()) {
                        return true;
                    }
                    return f.getName().endsWith(".cnyo");
                }

                @Override
                public String getDescription() {
                    return "Conyo File";
                }
            });
            fc.setCurrentDirectory(new File("C:\\tmp"));

            choice = fc.showDialog(file_frame, "Save File");

            if (choice == JFileChooser.APPROVE_OPTION) {
                currentFile = fc.getSelectedFile();
                
                if(currentFile.exists()) {
                    choice = JOptionPane.showConfirmDialog(file_frame, "File exists. Overwrite the file?", "Conyo IDE", JOptionPane.YES_NO_OPTION);
            
                    if(choice == JOptionPane.YES_OPTION){
                        try {
                            out = new BufferedWriter(new FileWriter(currentFile));
                            out.write(MainFrame.input.getText());
                            out.close();
                            
                            return true;
                        } catch (IOException ex) {
                            Logger.getLogger(MainConyo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }else {
                    try {
                        out = new BufferedWriter(new FileWriter(currentFile));
                        out.write(MainFrame.input.getText());
                        out.close();
                        
                        return true;
                    } catch (IOException ex) {
                        Logger.getLogger(MainConyo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }  
        
        return false;
    }
}
