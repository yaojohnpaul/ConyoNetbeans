
class MainConyo 
{
	public static ConyoLexer s = null;
        
        /*Which test case to use.*/
        private static String test_file = "test";

	public static void main(String argv[]) {
            try 
            {
                  java.io.FileInputStream stream = new java.io.FileInputStream("src/test_cases/" + test_file + ".txt");
                  java.io.Reader reader = new java.io.InputStreamReader(stream, "UTF-8");
                  s = new ConyoLexer(reader);
                  Parser p = new Parser(s);
                  p.parse();
            }
            catch (Exception e) 
            {
                  e.printStackTrace(System.out);
                  System.exit(1);
            }
	}
}