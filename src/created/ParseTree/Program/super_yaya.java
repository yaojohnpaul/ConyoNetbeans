package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class super_yaya implements created.iNode 
{
    public static class superYaya extends super_yaya
    {
        public utos_block u;
        
        public superYaya(utos_block u)
        {
            this.u = u;
        }
        
        public String toString()
        {
            return "superYaya\n" + u.toString();
        }
        
        public void checkContext(SymList sl)
        {
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).setSymList(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).preInterpret(sl);
            }
        }
    }
    
}