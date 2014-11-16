package created.ParseTree.Program;

import created.*;

public abstract class OMG_section implements created.iNode 
{
    public static class OMGSection extends OMG_section
    {
        public OMG_list o;
        
        public OMGSection(OMG_list o)
        {
            this.o = o;
        }
        
        public OMGSection()
        {
            this.o = null;
        }
        
        public String toString()
        {
            if(o != null)
                return o.toString();
            else
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            System.out.println("IT WORKS");
        }
    }
    
}