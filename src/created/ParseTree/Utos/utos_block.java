package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_block extends created.iNode 
{
    public utos_block(int ln)
    {
        super(ln);
    }
    
    public static class utosBlock extends utos_block
    {
        public utos_block_opt uo;
        
        public utosBlock(int ln)
        {
            super(ln);
            this.uo = null;
        }
        
        public utosBlock(int ln, utos_block_opt uo)
        {
            super(ln);
            this.uo = uo;
        }
        
        public String toString()
        {
            if(uo != null)
                return "$\n" + uo.toString() + "\n$";
            else
                return "$$";
        }
        
        public void setSymList(SymList sl)
        {
            if(uo instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) uo).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(uo instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) uo).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(uo instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) uo).preInterpret(sl);
            }
        }
        
        public int evaluate(SymList sl, int call, int inAFunction)
        {
            if(uo instanceof utos_block_opt.utosBlockOpt)
            {
                return ((utos_block_opt.utosBlockOpt) uo).evaluate(sl, call, inAFunction);
            }
            
            return 0;
        }
    }
}