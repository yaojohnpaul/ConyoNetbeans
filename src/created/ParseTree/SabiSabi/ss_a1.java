package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class ss_a1 implements created.iNode
{
    public static class ssA1Expansion extends ss_a1
    {
        public ss_a2 a2;
        public arithmetic_1 ar;
        public ss_a1 a1;
        
        public ssA1Expansion(ss_a2 a2, arithmetic_1 ar, ss_a1 a1)
        {
            this.a1 = a1;
            this.ar = ar;
            this.a2 = a2;
        }
        
        public String toString(){
            return a2.toString() + " " + ar.toString() + " " + a1.toString();
        }
        
//        public double evaluate(){
//            switch(ar.evaluate())
//            {
//                case "+" : return a2.evaluate() + a1.evaluate();
//                case "-" : return a2.evaluate() - a1.evaluate();
//            }
//        }
        
    }
    
    public static class ssA1 extends  ss_a1
    {
        public ss_a2 a2;
        
        public ssA1(ss_a2 a2)
        {
            this.a2 = a2;
        }
        
        public String toString(){
            return a2.toString();
        }
        
//        public double evaluate(){
//            return a2.evaluate();
//        }
    }
}

//ss_a1 ::= ss_a2:a2 arithmetic_1:ar ss_a1:a1 {: RESULT = new ssA1(a2, ar, a1); :}
//		| ss_a2:a2 {: RESULT = new ssA1(a2); :};