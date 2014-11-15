package created.parseTree.Yaya;

abstract class yaya_list implements created.iNode  
{
    public static class yayaList extends yaya_list
    {
        public yaya y;
        public yaya_list yl;
        
        public yayaList(yaya y)
        {
            this.y = y;
            yl = null;
        }
        
        public yayaList(yaya y, yaya_list yl)
        {
            this.y = y;
            this.yl = yl;
        }
        
        public String toString()
        {
            if(yl == null)
                return y.toString();
            else
                return y.toString() + ", " + yl.toString();
        }
    }
    
}