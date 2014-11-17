package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

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
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).checkContext(sl);
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
    }
}