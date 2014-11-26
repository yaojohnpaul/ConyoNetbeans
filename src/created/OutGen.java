package created;

import static created.MainFrame.output;

/**
 * Class for showing output.
 */
public class OutGen 
{    
    public static void addOut(String out)
    {
        MainFrame.output.setText(output.getText() + out + "\n");
        System.out.print(out + "\n");
    }
    
    public static void clear() 
    {
        MainFrame.output.setText("Result(s):\n");
    }
}