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
        public ss_a1 a;
        
        public ssParen(ss_a1 a){
            this.a = a;
        }
        
        public String toString(){
            return "(" + a.toString() + ")";
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