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
            String a2 = "";
            if(u instanceof ss_unary_1.ssU1)
            {
                unary = ((ss_unary_1.ssU1) u).checkContext(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                unary = ((ss_unary_1.ssU1Not) u).checkContext(sl);
            }
            
            if(ar instanceof arithmetic_2.arithmetic2)
            {
                ((arithmetic_2.arithmetic2) ar).checkContext(sl);
            }
            
            if(a instanceof ss_a2.ssA2)
            {
                a2 = ((ss_a2.ssA2) a).checkContext(sl);
            }
            else if(a instanceof ss_a2.ssA2Expansion)
            {
                a2 = ((ss_a2.ssA2Expansion) a).checkContext(sl);
            }
            switch(unary){
                case "booly" : break;
                case "floaty" : break;
                case "inty" : break;
                default : ErrorReport.error("Datatype Not Allowed");
            }
            if(unary.equals(a2))
                return unary;
                
            ErrorReport.error("Datatype Mismatch");
                return "";
        } 
        
        
        
        public double evaluate(SymList sl)
        {
            Object o1 = null;
            Object o2 = null;
            
            if(u instanceof ss_unary_1.ssU1)
            {
                o1 = ((ss_unary_1.ssU1) u).evaluate(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                o1 = ((ss_unary_1.ssU1Not) u).evaluate(sl);
            }
            
            if(a instanceof ss_a2.ssA2)
            {
                o2 = ((ss_a2.ssA2) a).evaluate(sl);
            }
            else if(a instanceof ss_a2.ssA2Expansion)
            {
                o2 = ((ss_a2.ssA2Expansion) a).evaluate(sl);
            }
            
            if(ar instanceof arithmetic_2.arithmetic2)
            {
                switch(((arithmetic_2.arithmetic2) ar).evaluate())
                {
                    case "*" : return (double)o1 * (double)o2;
                    case "/" : return (double)o1 / (double)o2;
                    case "%" : return (double)o1 % (double)o2;
                }
            }
            
            return 0.0;
        }
        
    }
    
    public static class ssA2 extends  ss_a2
    {
        public ss_unary_1 u;
        
        public ssA2(ss_unary_1 u)
        {
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
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            if(u instanceof ss_unary_1.ssU1)
            {
                ((ss_unary_1.ssU1) u).evaluate(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                ((ss_unary_1.ssU1Not) u).evaluate(sl);
            }
            
            return null;
        }
    }
    
    
}

//ss_a2 ::= ss_unary_1:u arithmetic_2:ar ss_a2:a {: RESULT = new ssA2Expansion(u, ar, a); :}
//		| ss_unary_1:u {: RESULT = new ssA2(u); :};