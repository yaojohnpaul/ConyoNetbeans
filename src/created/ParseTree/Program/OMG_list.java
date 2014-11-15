abstract class OMG_list implements iNode 
{
    public static class OMGdec extends OMG_list
    {
        public OMG_dec o; 
        public OMG_list l;
        
        public OMGdec()
        {
            this.o = null;
            this.l = null;
        }
        
        public OMGdec(OMG_dec o)
        {
            this.o = o;
            this.l = null;
        }
        
        public OMGdec(OMG_dec o, OMG_list l)
        {
            this.o = o;
            this.l = l;
        }
        
        public String toString()
        {
            return o.toString() + "\n" + l.toString();
        }
    }
}