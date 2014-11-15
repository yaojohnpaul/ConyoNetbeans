package created.ParseTree.Arte;

abstract class arte_assign implements created.iNode 
{
    public static class arteAssign extends arte_assign
    {
        public arte_init i; 
        
        public arteAssign()
        {
            this.i = null;
        }
        
        public arteAssign(arte_init i)
        {
            this.i = i;
        }
        
        public String toString()
        {
            return i.toString();
        }
    }
}