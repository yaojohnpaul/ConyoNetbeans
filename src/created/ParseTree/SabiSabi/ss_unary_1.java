package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class ss_unary_1 implements created.iNode
{
    public static class ssU1Not extends ss_unary_1
    {
        public ss_unary_1 u;
        
        public ssU1Not(ss_unary_1 u)
        {
            this.u = u;
        }
        
        public String toString()
        {
            return "!" + u.toString();
        }
    }
    
    public static class ssU1 extends ss_unary_1
    {
        public ss_paren p;
        
        public ssU1(ss_paren p)
        {
            this.p = p;
        }
        
        public String toString()
        {
            return p.toString();
        }
    }
}

/*
ss_unary_1 ::= NOT ss_unary_1:u {: RESULT = new ssU1Not(u); :}
			| PLUS PLUS ss_unary_1:u {: RESULT = new ssU1PlusPlus(u); :}
			| MINUS MINUS ss_unary_1:u {: RESULT = new ssU1MinusMinus(u); :}
			| ss_unary_2:u {: RESULT = new ssU1(u); :};
*/