package created.ParseTree.Array;

abstract class array_init implements created.iNode 
{
    public static class arrayInit extends array_init
    {
        public arte_init_list l; 
        
        public arrayInit(arte_init_list l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString();
        }
    }
}