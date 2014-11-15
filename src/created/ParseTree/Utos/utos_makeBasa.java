package created.parseTree.Utos;

abstract class utos_makeBasa implements created.iNode  
{
    public static class makeBasa extends utos_makeBasa
    {
        public data_type d; 
        
        public makeBasa(data_type d)
        {
            this.d = d;
        }
        
        public String toString()
        {
            return "makeBasa(" + d.toString() + "";
        }
    }
}