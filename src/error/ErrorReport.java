
package error;

/**
 * Class for reporting errors.
 */
public class ErrorReport 
{
    private static int errorNo = 1;
    private static int semanticErrorsCount = 0;
        
    public static void error(String err)
    {
        System.out.println("Error " + errorNo++ + ": " + err);
        semanticErrorsCount++;
    }
    
    public static int semanticErrorsCount()
    {
        return semanticErrorsCount;
    }
}
