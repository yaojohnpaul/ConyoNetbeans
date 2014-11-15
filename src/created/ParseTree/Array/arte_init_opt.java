abstract class arte_init_opt implements iNode 
{
    public static class arteInitOpt extends arte_init_opt
    {
        public arte_init i; 
        public arte_init_opt o;
        
        public arteInitOpt(arte_init i)
        {
            this.i = i;
            this.o = null;
        }
        
        public arteInitOpt(arte_init i, arte_init_opt o)
        {
            this.i = i;
            this.o = o;
        }
        
        public String toString()
        {
            return i.toString + " " + o.toString();
        }
    }
}