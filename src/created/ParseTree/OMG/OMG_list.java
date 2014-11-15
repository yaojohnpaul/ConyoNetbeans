abstract class OMG_list implements iNode 
{
    public static class OMGlist extends OMG_list
    {
        public OMG_dec o; 
        public OMG_list l;
        
        public OMGlist()
        {
            this.o = null;
            this.l = null;
        }
        
        public OMGlist(OMG_dec o)
        {
            this.o = o;
            this.l = null;
        }
        
        public OMGlist(OMG_dec o, OMG_list l)
        {
            this.o = o;
            this.l = l;
        }
        
        public String toString()
        {
            return o.toString;
        }
    }
}