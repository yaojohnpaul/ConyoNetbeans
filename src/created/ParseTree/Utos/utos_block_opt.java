package created.parseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

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
            return b.toString();
        }
    }
}