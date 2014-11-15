package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class sy_body implements created.iNode 
{
    public static class SubYayaBodyList extends sy_body
    {
        public sy_opt opt;
        
        public SubYayaBodyList(sy_opt opt)
        {
            this.opt = opt;
        }
        
        public String toString()
        {
            return "$" + opt.toString() + "$";
        }
    }
    
}

//sy_body ::= DOLLAR_SIGN sy_opt:opt DOLLAR_SIGN {: RESULT = new SubYayaBodyList(opt); :};