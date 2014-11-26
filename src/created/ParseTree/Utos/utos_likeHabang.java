package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class utos_likeHabang extends created.iNode  
{
    public utos_likeHabang(int ln)
    {
        super(ln);
    }
    
    public static class likeHabang extends utos_likeHabang
    {
        public sabi_sabi s; 
        public utos_block u;
        
        public likeHabang(int ln, sabi_sabi s)
        {
            super(ln);
            this.s = s;
            this.u = null;
        }
        
        public likeHabang(int ln, sabi_sabi s, utos_block u)
        {
            super(ln);
            this.s = s;
            this.u = u;
        }
        
        public String toString()
        {
            if(u != null)
                return "likeHabang(" + s.toString() + ")\n" + u.toString(); 
            else
                return "likeHabang(" + s.toString() + ")\n";
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            String type = "";
            if(s instanceof sabi_sabi.SabiSabi)
            {
                type = ((sabi_sabi.SabiSabi) s).checkContext(sl);
                if(!type.equals("booly"))
                {
                    ErrorReport.error(ln(), "Condition for while statement is not Boolean");
                }
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).preInterpret(sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            boolean a = false;
            int utosType = 0;
            
            if(s instanceof sabi_sabi.SabiSabi)
            {
                a = (boolean)((sabi_sabi.SabiSabi) s).evaluate(sl);
            }
            
            while(a)
            {
                if(u instanceof utos_block.utosBlock)
                {
                    utosType = ((utos_block.utosBlock) u).evaluate(sl);
                }
                
                if(utosType == 1)
                    break;
                
                if(s instanceof sabi_sabi.SabiSabi)
                {
                    a = (boolean)((sabi_sabi.SabiSabi) s).evaluate(sl);
                }
            }
        }
    }
}