package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class ss_a2 extends created.iNode
{
    public ss_a2(int ln)
    {
        super(ln);
    }
    
    public static class ssA2Expansion extends ss_a2
    {
        public ss_unary_1 u;
        public arithmetic_2 ar;
        public ss_a2 a;
        
        public ssA2Expansion(int ln, ss_unary_1 u, arithmetic_2 ar, ss_a2 a)
        {
            super(ln);
            this.u = u;
            this.ar = ar;
            this.a = a;
        }
        
        public String toString(){
            return u.toString() + " " + ar.toString() + " " + a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(u instanceof ss_unary_1.ssU1)
            {
                ((ss_unary_1.ssU1) u).setSymList(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                ((ss_unary_1.ssU1Not) u).setSymList(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Neg)
            {
                ((ss_unary_1.ssU1Neg) u).setSymList(sl);
            }
            
            if(ar instanceof arithmetic_2.arithmetic2)
            {
                ((arithmetic_2.arithmetic2) ar).setSymList(sl);
            }
            
            if(a instanceof ss_a2.ssA2)
            {
                ((ss_a2.ssA2) a).setSymList(sl);
            }
            else if(a instanceof ss_a2.ssA2Expansion)
            {
                ((ss_a2.ssA2Expansion) a).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String unary = "";
            String arith = "";
            String a2 = "";
            
            if(a instanceof ss_a2.ssA2)
            {
                a2 = ((ss_a2.ssA2) a).checkContext(sl);
            }
            else if(a instanceof ss_a2.ssA2Expansion)
            {
                a2 = ((ss_a2.ssA2Expansion) a).checkContext(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Neg)
            {
                unary = ((ss_unary_1.ssU1Neg) u).checkContext(sl);
            }
            
            
            if(ar instanceof arithmetic_2.arithmetic2)
            {
                arith = ((arithmetic_2.arithmetic2) ar).checkContext(sl);
            }
            
            if(u instanceof ss_unary_1.ssU1)
            {
                unary = ((ss_unary_1.ssU1) u).checkContext(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                unary = ((ss_unary_1.ssU1Not) u).checkContext(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Neg)
            {
                unary = ((ss_unary_1.ssU1Neg) u).checkContext(sl);
            }
            switch(unary){
                case "booly" : break;
                case "floaty" : break;
                case "inty" : break;
                default : 
                    if(unary.isEmpty())
                        ErrorReport.error(ln(), "Datatype Not Allowed in " + arith + " operator");
                    else
                        ErrorReport.error(ln(), "Datatype Not Allowed in " + arith + " operator: " + unary);
                    return "";
            }
            if(unary.equals("inty")){
                switch(a2)
                {
                    case "inty" : return "inty";
                    case "floaty" : return "floaty";
                    default         : 
                        if(unary.isEmpty() || a2.isEmpty())
                            ErrorReport.error(ln(), "Datatype Mismatch in " + arith + " operator");
                        else
                            ErrorReport.error(ln(), "Datatype Mismatch in " + arith + " operator: " + unary + " and " + a2);
                        return "";
                }
            }
            else if(unary.equals("floaty")){
                switch(a2)
                {
                    case "inty" : 
                    case "floaty" : return "floaty";
                    default         : 
                        if(unary.isEmpty() || a2.isEmpty())
                            ErrorReport.error(ln(), "Datatype Mismatch in " + arith + " operator");
                        else
                            ErrorReport.error(ln(), "Datatype Mismatch in " + arith + " operator: " + unary + " and " + a2);
                                return "";
                }
            }
            else if(unary.equals(a2))
                return unary;
               
            if(unary.isEmpty() || a2.isEmpty())
                ErrorReport.error(ln(), "Datatype Mismatch in " + arith + " operator");
            else
                ErrorReport.error(ln(), "Datatype Mismatch in " + arith + " operator: " + unary + " and " + a2);
            return "";
        } 
        
        
        
        public Object evaluate(SymList sl)
        {
            Object o1 = null;
            Object o2 = null;
            
            if(a instanceof ss_a2.ssA2)
            {
                o1 = ((ss_a2.ssA2) a).evaluate(sl);
            }
            else if(a instanceof ss_a2.ssA2Expansion)
            {
                o1 = ((ss_a2.ssA2Expansion) a).evaluate(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Neg)
            {
                o1 = ((ss_unary_1.ssU1Neg) u).evaluate(sl);
            }
            
            if(u instanceof ss_unary_1.ssU1)
            {
                o2 = ((ss_unary_1.ssU1) u).evaluate(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                o2 = ((ss_unary_1.ssU1Not) u).evaluate(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Neg)
            {
                o2 = ((ss_unary_1.ssU1Neg) u).evaluate(sl);
            }
            
            
            
            if(ar instanceof arithmetic_2.arithmetic2)
            {
                switch(((arithmetic_2.arithmetic2) ar).evaluate())
                {
                    case "*" : if (o1 instanceof Float)
                                {
                                    if(o2 instanceof Float)
                                        return (float)o1 * (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (float)o1 * (int)o2;
                                }
                                else if (o1 instanceof Integer)
                                {
                                    if(o2 instanceof Float)
                                        return (int)o1 * (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (int)o1 * (int)o2;
                                }
                    case "/" : if (o1 instanceof Float)
                                {
                                    if(o2 instanceof Float)
                                        if((float)o2 != 0)
                                            return (float)o1 / (float)o2;
                                        else
                                        {
                                            ErrorReport.error(ln(), "Equation Invalid. Division by 0 is not allowed. Disregarded the division by 0 instead.");
                                            return (float)o1;
                                        }
                                    else if(o2 instanceof Integer)
                                        if((int)o2 != 0)
                                            return (float)o1 / (int)o2;
                                        else
                                        {
                                            ErrorReport.error(ln(), "Equation Invalid. Division by 0 is not allowed. Disregarded the division by 0 instead.");
                                            return (float)o1;
                                        }
                                }
                                else if (o1 instanceof Integer)
                                {
                                    if(o2 instanceof Float)
                                        if((float)o2 != 0)
                                            return (int)o1 / (float)o2;
                                        else
                                        {
                                            ErrorReport.error(ln(), "Equation Invalid. Division by 0 is not allowed. Disregarded the division by 0 instead.");
                                            return (int)o1;
                                        }
                                    else if(o2 instanceof Integer)
                                    {
                                        if((int)o2 != 0)
                                        {
                                            if(((int) o1 % (int) o2) == 0)
                                                return (int) o1 / (int) o2;
                                            else
                                                return Float.intBitsToFloat((int)o1) / Float.intBitsToFloat((int)o2);
                                        }
                                        else
                                        {
                                            ErrorReport.error(ln(), "Equation Invalid. Division by 0 is not allowed. Disregarded the division by 0 instead.");
                                            return (int)o1;
                                        }
                                    }
                                }
                    case "%" : if (o1 instanceof Float)
                                {
                                    if(o2 instanceof Float)
                                        return (float)o1 % (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (float)o1 % (int)o2;
                                }
                                else if (o1 instanceof Integer)
                                {
                                    if(o2 instanceof Float)
                                        return (int)o1 % (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (int)o1 % (int)o2;
                                }
                }
            }
            
            return (float) 0.0;
        }
        
    }
    
    public static class ssA2 extends  ss_a2
    {
        public ss_unary_1 u;
        
        public ssA2(int ln, ss_unary_1 u)
        {
            super(ln);
            this.u = u;
        }
        
        public String toString()
        {
            return u.toString();
        }   
        
        public void setSymList(SymList sl)
        {
            if(u instanceof ss_unary_1.ssU1)
            {
                ((ss_unary_1.ssU1) u).setSymList(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                ((ss_unary_1.ssU1Not) u).setSymList(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Neg)
            {
                ((ss_unary_1.ssU1Neg) u).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            if(u instanceof ss_unary_1.ssU1)
            {
                return ((ss_unary_1.ssU1) u).checkContext(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                return ((ss_unary_1.ssU1Not) u).checkContext(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Neg)
            {
                return ((ss_unary_1.ssU1Neg) u).checkContext(sl);
            }
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            if(u instanceof ss_unary_1.ssU1)
            {
                return ((ss_unary_1.ssU1) u).evaluate(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                return ((ss_unary_1.ssU1Not) u).evaluate(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Neg)
            {
                return ((ss_unary_1.ssU1Neg) u).evaluate(sl);
            }
            
            return null;
        }
    }
    
    
}

//ss_a2 ::= ss_unary_1:u arithmetic_2:ar ss_a2:a {: RESULT = new ssA2Expansion(u, ar, a); :}
//		| ss_unary_1:u {: RESULT = new ssA2(u); :};