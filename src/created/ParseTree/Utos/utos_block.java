package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_block implements created.iNode 
{
    public static class utosBlock extends utos_block
    {
        public utos_block_opt uo;
        
        public utosBlock()
        {
            this.uo = null;
        }
        
        public utosBlock(utos_block_opt uo)
        {
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
        
        public void evaluate(SymList sl)
        {
            if(uo instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) uo).evaluate(sl);
            }
        }
    }
}