package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_makeSabi implements created.iNode  
{
    public static class makeSabi extends utos_makeSabi
    {
        public sabi_sabi s; 
        
        public makeSabi(sabi_sabi s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return "makeSabi " + s.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.sabiSabi)
            {
                ((sabi_sabi.sabiSabi) s).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(s instanceof sabi_sabi.sabiSabi)
            {
                ((sabi_sabi.sabiSabi) s).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.sabiSabi)
            {
                ((sabi_sabi.sabiSabi) s).preInterpret(sl);
            }
        }
    }
}