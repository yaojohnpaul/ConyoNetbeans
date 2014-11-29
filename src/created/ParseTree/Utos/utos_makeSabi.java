package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import created.WatchAndTrace;

public abstract class utos_makeSabi extends created.iNode  
{
    public utos_makeSabi(int ln)
    {
        super(ln);
    }
    
    public static class makeSabi extends utos_makeSabi
    {
        public sabi_sabi s; 
        
        public makeSabi(int ln, sabi_sabi s)
        {
            super(ln);
            this.s = s;
        }
        
        public String toString()
        {
            return "makeSabi " + s.toString();
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
    }
}