package created.ParseTree.Array;

abstract class arte_init_list implements created.iNode 
{
    public static class arteInitList extends arte_init_list
    {
        public arte_init_opt o; 
        
        public arteInitList()
        {
            this.o = null;
        }
        
        public arteInitList(arte_init_opt o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            return o.toString();
        }
    }
}