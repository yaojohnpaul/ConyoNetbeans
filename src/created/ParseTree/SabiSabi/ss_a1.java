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
            else if(a1 instanceof ss_a1.ssA1Expansion)
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
                {
                    case "stringy"  :
                    case "booly"    :
                    case "null"     :
                    case "inty"     :
                    case "floaty"   :
                    case "chary"    : return "stringy";
                    default         : ErrorReport.error("Datatype Mismatch");
                                    
                }
            }
            else if(arith2.equals("stringy") && operator.equals("+") )
            {
                switch(arith1)
                {
                case "stringy"  :
                case "booly"    :
                case "null"     :
                case "inty"     :
                case "floaty"   :
                case "chary"    : return "stringy";
                default         : ErrorReport.error("Datatype Mismatch");
                                return "";
                }
            }
            switch(arith2){
                case "booly" : break;
                case "floaty" : break;
                case "inty" : break;
                default : ErrorReport.error("Datatype Not Allowed");
                            return "";
            }
            if(arith2.equals(arith1))
                return arith2;
                
            ErrorReport.error("Datatype Mismatch");
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            Object o1 = null;
            Object o2 = null;
            
            if(a2 instanceof ss_a2.ssA2)
            {
                o2 = ((ss_a2.ssA2) a2).evaluate(sl);
            }
            else if(a2 instanceof ss_a2.ssA2Expansion)
            {
                o2 = ((ss_a2.ssA2Expansion) a2).evaluate(sl);
            }
            
            if(a1 instanceof ss_a1.ssA1)
            {
                o1 = ((ss_a1.ssA1) a1).evaluate(sl);
            }
            else if(a1 instanceof ss_a1.ssA1Expansion)
            {
                o1 = ((ss_a1.ssA1Expansion) a1).evaluate(sl);
            }
            
            if(ar instanceof arithmetic_1.arithmetic1)
            {
                switch(((arithmetic_1.arithmetic1) ar).evaluate())
                {
                    case "+":   if(o1 instanceof Integer) 
                                    return (int)o1 + (int)o2;
                                else if(o1 instanceof Float) 
                                    return (float)o1 + (float)o2;
                                else if(o1 instanceof String)
                                {
                                    if(o2 instanceof Boolean) 
                                        return (String)o1 + (boolean)o2;
                                    else if(o2 instanceof Integer) 
                                        return (String)o1 + (int)o2;
                                    else if(o2 instanceof Float) 
                                        return (String)o1 + (float)o2;
                                    else if(o2 instanceof Character) 
                                        return (String)o1 + (char)o2;
                                    else if(o2 instanceof String)
                                        return (String)o1 + (String)o2;
                                }
                                else if(o2 instanceof String)
                                {
                                    if(o1 instanceof Boolean) 
                                        return (boolean)o1 + (String)o2;
                                    else if(o1 instanceof Integer) 
                                        return (int)o1 + (String)o2;
                                    else if(o1 instanceof Float) 
                                        return (float)o1 + (String)o2;
                                    else if(o1 instanceof Character) 
                                        return (char)o1 + (String)o2;
                                }
                     case "-":  if(o1 instanceof Integer) 
                                    return (int)o1 - (int)o2;
                                else if(o1 instanceof Float) 
                                    return (float)o1 - (float)o2;
                }
            }
            
            return null;
        }
        
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
        
        public Object evaluate(SymList sl)
        {
            if(a2 instanceof ss_a2.ssA2)
            {
                return ((ss_a2.ssA2) a2).evaluate(sl);
            }
            else if(a2 instanceof ss_a2.ssA2Expansion)
            {
                return ((ss_a2.ssA2Expansion) a2).evaluate(sl);
            }
            
            return null;
        }
    }
}

//ss_a1 ::= ss_a2:a2 arithmetic_1:ar ss_a1:a1 {: RESULT = new ssA1(a2, ar, a1); :}
//		| ss_a2:a2 {: RESULT = new ssA1(a2); :};