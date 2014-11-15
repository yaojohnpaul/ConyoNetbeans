package created.ParseTree.Program;

abstract class yaya_list implements created.iNode 
{
    public static class yayaList extends yaya_list
    {
        public yaya y;
        public yaya_list l;
        
        public yayaList(yaya y)
        {
            this.y = y;
            this.l = l;
        }
        
        public yayaList(yaya y, yaya_list l)
        {
            this.y = y;
            this.l = l;
        }
        
        public String toString()
        {
            return y.toString() + "\n" + l.toString();
        }
    }
    
}