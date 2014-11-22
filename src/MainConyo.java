
import generated.*;
import created.*;
import error.*;

class MainConyo 
{
	public static ConyoLexer s = null;
        
        /*Which test case to use.*/
        private static String test_file = "simple";

	public static void main(String argv[]) 
        {
            try 
            {
                java.io.FileInputStream stream = new java.io.FileInputStream("src/test_cases_ext/" + test_file + ".txt");
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
                //c.printSymList();
                c.checkContext();
                if(ErrorReport.semanticErrorsCount() == 0)
                {
                    c.preInterpret();
                    c.evaluate();
                }
                else
                {
                    ErrorReport.printError();
                }
            }
            catch (Exception e) 
            {
                  e.printStackTrace(System.out);
                  System.exit(1);
            }
	}
}