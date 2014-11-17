package created;

/**
 * Class for showing output.
 */
public class ErrorReport 
{
    private static StringBuilder sb = new StringBuilder();
        
    public static void addOut(String out)
    {
        sb.append(out + "\n");
    }
    
    public static void printResult()
    {
        if(sb.length() > 0)
			System.out.println(sb);
    }
}