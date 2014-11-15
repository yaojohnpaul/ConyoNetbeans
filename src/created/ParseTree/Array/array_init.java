abstract class array_init implements iNode 
{
    public static class arrayInit extends array_init
    {
        public arte_init_list l; 
        
        public arrayInit(PLACEHOLDER_VARTYPE l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString;
        }
    }
}