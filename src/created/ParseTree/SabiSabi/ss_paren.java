package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class ss_paren implements created.iNode
{
    public static class ssParen extends ss_paren
    {
        public ss_paren p;
        
        public ssParen(ss_paren p){
            this.p = p;
        }
        
        public String toString(){
            return "(" + p.toString() + ")";
        }
    }
    
    public static class ssParenEnd extends ss_paren
    {
        public sabi_sabi_end e;
        
        public ssParenEnd(sabi_sabi_end e)
        {
            this.e = e;
        }
        
        public String toString()
        {
            return e.toString();
        }
    }
}

//ss_paren ::= LEFT_PAREN ss_paren:p RIGHT_PAREN {: RESULT = new ssParen(p); :}
//			| sabi_sabi_end:e {: RESULT = new ssParenEnd(e); :};