
package error;

/**
 * Class for reporting errors.
 */
public class ErrorReport 
{
    private static int errorNo = 1;
    private static int semanticErrorsCount = 0;
    private static StringBuilder sb = new StringBuilder();
        
    public static void error(String err)
    {
        sb.append("Error " + errorNo++ + ": " + err + "\n");
        semanticErrorsCount++;
    }
    
    public static void printError()
    {
        if(sb.length() > 0)
        {
            System.out.println("\nErrors:");
            System.out.println(sb);
        }
    }
    
    public static int semanticErrorsCount()
    {
        return semanticErrorsCount;
    }
}
