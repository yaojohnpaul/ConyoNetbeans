package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class utos_makeGawaHabang implements created.iNode  
{
    public static class makeGawaHabang extends utos_makeGawaHabang
    {
        public utos_block u; 
        public sabi_sabi s;
        
        public makeGawaHabang(utos_block u, sabi_sabi s)
        {
            this.u = u;
            this.s = s;
        }
        
        public String toString()
        {
            return "makeGawa\n" + u.toString() + "\nlikeHabang(" + s.toString() + ")";
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
                    ErrorReport.error("Condition for do-while statement is not Boolean");
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
            
            do
            {
                if(u instanceof utos_block.utosBlock)
                {
                    ((utos_block.utosBlock) u).evaluate(sl);
                }
                
                if(s instanceof sabi_sabi.SabiSabi)
                {
                    a = (boolean)((sabi_sabi.SabiSabi) s).evaluate(sl);
                }
            } while(a);
        }
    }
}