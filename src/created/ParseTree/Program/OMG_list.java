package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class OMG_list implements created.iNode 
{
    public static class OMGList extends OMG_list
    {
        public OMG_dec o; 
        public OMG_list l;
                
        public OMGList(OMG_dec o)
        {
            this.o = o;
            this.l = null;
        }
        
        public OMGList(OMG_dec o, OMG_list l)
        {
            this.o = o;
            this.l = l;
        }
        
        public String toString()
        {
            if(l != null)
                return o.toString() + "\n" + l.toString();
            else
                return o.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(o instanceof OMG_dec.OMG)
            {
                ((OMG_dec.OMG) o).setSymList(sl);
            }
            
            if(l instanceof OMG_list.OMGList)
            {
                ((OMG_list.OMGList) l).setSymList(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(o instanceof OMG_dec.OMG)
            {
                ((OMG_dec.OMG) o).preInterpret(sl);
            }
            
            if(l instanceof OMG_list.OMGList)
            {
                ((OMG_list.OMGList) l).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            if(o instanceof OMG_dec.OMG)
            {
                ((OMG_dec.OMG) o).evaluate(sl);
            }
            
            if(l instanceof OMG_list.OMGList)
            {
                ((OMG_list.OMGList) l).evaluate(sl);
            }
        }
    }
}