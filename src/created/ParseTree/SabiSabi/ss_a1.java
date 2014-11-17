package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

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
        
        public void setSymList(SymList sl)
        {
            if(a2 instanceof ss_a2.ssA2)
            {
                ((ss_a2.ssA2) a2).setSymList(sl);
            }
            else if(a2 instanceof ss_a2.ssA2Expansion)
            {
                ((ss_a2.ssA2Expansion) a2).setSymList(sl);
            }
            
            if(ar instanceof arithmetic_1.arithmetic1)
            {
                ((arithmetic_1.arithmetic1) ar).setSymList(sl);
            }
            
            if(a1 instanceof ss_a1.ssA1)
            {
                ((ss_a1.ssA1) a1).setSymList(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                ((ss_a1.ssA1Expansion) a1).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String arith1 = "";
            String arith2 = "";
            String operator = "";
            if(a2 instanceof ss_a2.ssA2)
            {
                arith2 = ((ss_a2.ssA2) a2).checkContext(sl);
            }
            else if(a2 instanceof ss_a2.ssA2Expansion)
            {
                arith2 = ((ss_a2.ssA2Expansion) a2).checkContext(sl);
            }
            
            if(ar instanceof arithmetic_1.arithmetic1)
            {
                operator = ((arithmetic_1.arithmetic1) ar).checkContext(sl);
            }
            
            if(a1 instanceof ss_a1.ssA1)
            {
                arith1 = ((ss_a1.ssA1) a1).checkContext(sl);
            }
            else if(a1 instanceof ss_a1.ssA1Expansion)
            {
                arith1 = ((ss_a1.ssA1Expansion) a1).checkContext(sl);
            }
            
            if(arith1.equals("stringy") &&  operator.equals("+"))
            {
                switch(arith2)
                case "stringy"  :
                case "booly"    :
                case "null"     :
                case "inty"     :
                case "floaty"   :
                case "chary"    : return "stringy"
                default         : ErrorReport.error("Datatype Mismatch");
            }
            else if(arith2.equals("stringy") && operator.equals("+") )
            {
                switch(arith1)
                case "stringy"  :
                case "booly"    :
                case "null"     :
                case "inty"     :
                case "floaty"   :
                case "chary"    : return "stringy"
                default         : ErrorReport.error("Datatype Mismatch");
            }
            switch(arith2){
                case "booly" : break;
                case "floaty" : break;
                case "inty" : break;
                default : ErrorReport.error("Datatype Not Allowed");
            }
            if(arith2.equals(arith1))
                return arith2;
                
            ErrorReport.error("Datatype Mismatch");
            return "";
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
        
        public void setSymList(SymList sl)
        {
            if(a2 instanceof ss_a2.ssA2)
            {
                ((ss_a2.ssA2) a2).setSymList(sl);
            }
            else if(a2 instanceof ss_a2.ssA2Expansion)
            {
                ((ss_a2.ssA2Expansion) a2).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(a2 instanceof ss_a2.ssA2)
            {
                return ((ss_a2.ssA2) a2).checkContext(sl);
            }
            else if(a2 instanceof ss_a2.ssA2Expansion)
            {
                return ((ss_a2.ssA2Expansion) a2).checkContext(sl);
            }
            return "";
        } 
        
//        public double evaluate(){
//            return a2.evaluate();
//        }
    }
}

//ss_a1 ::= ss_a2:a2 arithmetic_1:ar ss_a1:a1 {: RESULT = new ssA1(a2, ar, a1); :}
//		| ss_a2:a2 {: RESULT = new ssA1(a2); :};