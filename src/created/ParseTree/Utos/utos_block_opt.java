package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_block_opt extends created.iNode 
{
    public utos_block_opt(int ln)
    {
        super(ln);
    }
    
    public static class utosBlockOpt extends utos_block_opt
    {
        public block_content b;
        
        public utosBlockOpt(int ln)
        {
            super(ln);
            this.b = null;
        }
        
        public utosBlockOpt(int ln, block_content b)
        {
            super(ln);
            this.b = b;
        }
        
        public String toString()
        {
            if(b != null)
                return b.toString();
            else
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(b instanceof block_content.blockContent)
            {
                ((block_content.blockContent) b).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(b instanceof block_content.blockContent)
            {
                ((block_content.blockContent) b).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(b instanceof block_content.blockContent)
            {
                ((block_content.blockContent) b).preInterpret(sl);
            }
        }
        
        public int evaluate(SymList sl, int call, int inAFunction)
        {
            if(b instanceof block_content.blockContent)
            {
                return ((block_content.blockContent) b).evaluate(sl, call, inAFunction);
            }
            
            return 0;
        }
    }
}