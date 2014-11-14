
package error;

/**
 * Class for reporting errors.
 */
public class ErrorReport 
{
    private static int errorNo = 1;
        
    public static void error(String err)
    {
        System.out.println("Error " + errorNo++ + ": " + err);
    }
}
