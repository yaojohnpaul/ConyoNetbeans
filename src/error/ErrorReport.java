
package error;

/**
 * Class for reporting errors.
 */
public class ErrorReport 
{
    private static int semanticErrorsCount = 0;
    private static StringBuilder sb = new StringBuilder();
        
    public static void error(String err)
    {
        sb.append("Error: Line ? - " + err + "\n");
        semanticErrorsCount++;
    }
    
    public static void printError()
    {
        if(sb.length() > 0)
        {
            System.out.println(sb);
        }
    }
    
    public static int semanticErrorsCount()
    {
        return semanticErrorsCount;
    }
}
