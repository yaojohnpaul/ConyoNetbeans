package created.parseTree.Yaya;

abstract class yaya implements created.iNode  
{
    public static class addYaya extends yaya
    {
        public yaya_header h;
        public utos_block u;
        
        public addYaya(yaya_header h, utos_block u)
        {
            this.h = h;
            this.u = u;
        }
        
        public String toString()
        {
            return h.toString() + u.toString();
        }
    }
    
}