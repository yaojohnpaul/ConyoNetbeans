package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

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
                return "$\n" + uo.toString() + "\n";
            else
                return "";
        }
    }
}