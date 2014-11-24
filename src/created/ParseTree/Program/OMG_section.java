package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class OMG_section extends created.iNode 
{
    public OMG_section(int ln)
    {
        super(ln);
    }
    
    public static class OMGSection extends OMG_section
    {
        public OMG_list o;
        
        public OMGSection(int ln, OMG_list o)
        {
            super(ln);
            this.o = o;
        }
        
        public OMGSection(int ln)
        {
            super(ln);
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
            if(o instanceof OMG_list.OMGList)
            {
                ((OMG_list.OMGList) o).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(o instanceof OMG_list.OMGList)
            {
                ((OMG_list.OMGList) o).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(o instanceof OMG_list.OMGList)
            {
                ((OMG_list.OMGList) o).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            if(o instanceof OMG_list.OMGList)
            {
                ((OMG_list.OMGList) o).evaluate(sl);
            }
        }
    }
    
}