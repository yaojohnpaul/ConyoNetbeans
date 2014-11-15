package created.ParseTree.Program;

abstract class OMG_section implements created.iNode 
{
    public static class OMGSection extends OMG_section
    {
        public OMG_list o;
        
        public OMGSection(OMG_list o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            return o.toString();
        }
    }
    
}