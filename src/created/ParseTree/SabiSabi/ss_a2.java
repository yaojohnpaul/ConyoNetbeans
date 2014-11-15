package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class ss_a2 implements created.iNode
{
    public static class ssA2Expansion extends ss_a2
    {
        public ss_unary_1 u;
        public arithmetic_2 ar;
        public ss_a2 a;
        
        public ssA2Expansion(ss_unary_1 u, arithmetic_2 ar, ss_a2 a)
        {
            this.u = u;
            this.ar = ar;
            this.a = a;
        }
        
        public String toString(){
            return u.toString() + " " + ar.toString() + " " + a.toString();
        }
        
    }
    
    public static class ssA2 extends  ss_a2
    {
        public ss_unary_1 u;
        
        public ssA2(ss_unary_1 u)
        {
            this.u = u;
        }
        
        public String toString(){
            return u.toString();
        }   
    }
    
    
}

//ss_a2 ::= ss_unary_1:u arithmetic_2:ar ss_a2:a {: RESULT = new ssA2Expansion(u, ar, a); :}
//		| ss_unary_1:u {: RESULT = new ssA2(u); :};