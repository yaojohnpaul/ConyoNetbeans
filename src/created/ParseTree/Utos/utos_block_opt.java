package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_block_opt implements created.iNode 
{
    public static class utosBlockOpt extends utos_block_opt
    {
        public block_content b;
        
        public utosBlockOpt()
        {
            this.b = null;
        }
        
        public utosBlockOpt(block_content b)
        {
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
    }
}