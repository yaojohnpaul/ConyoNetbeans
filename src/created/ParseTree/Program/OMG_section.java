abstract class OMG_section implements iNode 
{
    public static class OMGlist extends OMG_section
    {
        public OMG_list o;
        
        public OMGlist(OMG_list o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            return o.toString();
        }
    }
    
}