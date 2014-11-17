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

public abstract class ss_comparison implements created.iNode
{
    public static class ssComparisonExpansion extends ss_comparison
    {
        public ss_a1 a;
        public comparison co;
        public ss_comparison c;
        
        public ssComparisonExpansion(ss_a1 a, comparison co, ss_comparison c)
        {
            this.a = a;
            this.co = co;
            this.c = c;
        }
        
        public String toString(){
            return a.toString() + " " + co.toString() + " " + c.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof ss_a1.ssA1)
            {
                ((ss_a1.ssA1) a).setSymList(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                ((ss_a1.ssA1Expansion) a).setSymList(sl);
            }
            
            if(co instanceof comparison.compare)
            {
                ((comparison.compare) co).setSymList(sl);
            }

            if(c instanceof ss_comparison.ssComparison)
            {
                ((ss_comparison.ssComparison) c).setSymList(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                ((ss_comparison.ssComparisonExpansion) c).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String arith = "";
            String compare = "";
            if(a instanceof ss_a1.ssA1)
            {
                arith = ((ss_a1.ssA1) a).checkContext(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                arith = ((ss_a1.ssA1Expansion) a).checkContext(sl);
            }
            
            if(co instanceof comparison.compare)
            {
                ((comparison.compare) co).checkContext(sl);
            }

            if(c instanceof ss_comparison.ssComparison)
            {
                compare = ((ss_comparison.ssComparison) c).checkContext(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                compare = ((ss_comparison.ssComparisonExpansion) c).checkContext(sl);
            }
            
            switch(arith){
                case "booly" : break;
                case "floaty" : break;
                case "inty" : break;
                default : ErrorReport.error("Datatype Not Allowed");
            }
            if(arith.equals(compare))
                return "booly";
                
            ErrorReport.error("Datatype Mismatch");
            return null;
        } 
        
//        public boolean evaluate(){
//            switch(co.evaluate()){
//                case "<" : return a.evaluate() <= e.evaluate();
//                case "<=" : return a.evaluate() <= e.evaluate();
//                case ">" : return a.evaluate() > e.evaluate();
//                case ">=" : return a.evaluate() >= e.evaluate();
//            }
//        }
        
    }
    
    public static class ssComparison extends  ss_comparison
    {
        public ss_a1 a;
        
        public ssComparison(ss_a1 a)
        {
            this.a = a;
        }
        
        public String toString(){
            return a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof ss_a1.ssA1)
            {
                ((ss_a1.ssA1) a).setSymList(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                ((ss_a1.ssA1Expansion) a).setSymList(sl);
            }
        }
        
        public String checkContext(SymList s) 
        { // for sabi sabi plng
            //other context here
            if(a instanceof ss_a1.ssA1)
            {
                return ((ss_a1.ssA1) a).checkContext(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                return ((ss_a1.ssA1Expansion) a).checkContext(sl);
            }
            return null;
        } 
        
//        public double evaluate(){
//            return a.evaluate();
//        }
        
    }
}

//ss_comparison ::= ss_a1:a comparison:co ss_comparison:c {: RESULT = new ssComparisonExpansion(a, co, c); :}
//            	|	ss_a1:a {: RESULT = new ssComparison(a); :};
