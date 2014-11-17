package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class sabi_sabi implements created.iNode
{
    public static class SabiSabi extends sabi_sabi
    {
        public ss_OR o;
        
        public SabiSabi(ss_OR o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            return o.toString();
        }
        
        //To be edited, return type also if needed
        public String evaluate()
        {
            return this.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(o instanceof ss_OR.ssOR)
            {
                ((ss_OR.ssOR) o).setSymList(sl);
            }
            else if(o instanceof ss_OR.ssORExpansion)
            {
                ((ss_OR.ssORExpansion) o).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(o instanceof ss_OR.ssOR)
            {
                return ((ss_OR.ssOR) o).checkContext(sl);
            }
            else if(o instanceof ss_OR.ssORExpansion)
            {
                return ((ss_OR.ssORExpansion) o).checkContext(sl);
            }
            return null;
        }
        
        public void preInterpret(SymList sl)
        {
            
        }
    }
}


//sabi_sabi ::= ss_OR:o {: RESULT = new SabiSabi(o); :};