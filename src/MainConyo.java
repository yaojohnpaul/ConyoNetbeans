
import generated.*;
import created.*;

class MainConyo 
{
	public static ConyoLexer s = null;
        
        /*Which test case to use.*/
        private static String test_file = "test";

	public static void main(String argv[]) 
        {
            try 
            {
                java.io.FileInputStream stream = new java.io.FileInputStream("src/test_cases/" + test_file + ".txt");
                java.io.Reader reader = new java.io.InputStreamReader(stream, "UTF-8");
                s = new ConyoLexer(reader);
                Parser p = new Parser(s);

                Conyogram c = null;
                try
                {
                    c = (Conyogram) p.parse().value;
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                System.out.println(c.toString());
                c.setSymList();
            }
            catch (Exception e) 
            {
                  e.printStackTrace(System.out);
                  System.exit(1);
            }
	}
}