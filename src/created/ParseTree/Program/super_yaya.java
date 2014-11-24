package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class super_yaya extends created.iNode 
{
    public super_yaya(int ln)
    {
        super(ln);
    }
    
    public static class superYaya extends super_yaya
    {
        public utos_block u;
        
        public superYaya(int ln, utos_block u)
        {
            super(ln);
            this.u = u;
        }
        
        public String toString()
        {
            return "superYaya\n" + u.toString();
        }
        
        private SymList sl;
        
        public void setSymList(SymList sl)
        {
            this.sl = new SymList(sl);
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).setSymList(this.sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            this.sl.setAncestor(sl);
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).checkContext(this.sl);
            }
        }
        
        // public void checkContext(SymList sl)
        // {
        //     this.sl = new SymList(sl);
        //     if(u instanceof utos_block.utosBlock)
        //     {
        //         ((utos_block.utosBlock) u).checkContext(this.sl);
        //     }
        // }
        
        public void preInterpret(SymList sl)
        {
            this.sl.setAncestor(sl);
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).preInterpret(this.sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            this.sl.setAncestor(sl);
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).evaluate(this.sl);
            }
        }
    }
    
}