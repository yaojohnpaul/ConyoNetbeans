package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import created.*;

public abstract class utos_makeSulat implements created.iNode  
{
    public static class makeSulat extends utos_makeSulat
    {
        public sabi_sabi s; 
        
        public makeSulat(sabi_sabi s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return "makeSulat(" + s.toString() + ")";
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).preInterpret(sl);
            }
        }
        
        public void evaluate()
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                //Change evaluate() to String if ever return type of evaluate changes
                OutGen.addOut(((sabi_sabi.SabiSabi) s).evaluate());
            }
        }
    }
}