package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

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
            if(o instanceof OMG_list.OMGList)
            {
                ((OMG_list.OMGList) o).setSymList(sl);
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