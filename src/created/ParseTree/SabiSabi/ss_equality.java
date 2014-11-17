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

public abstract class ss_equality implements created.iNode
{
    public static class ssEqualityExpansion extends ss_equality
    {
        public ss_comparison c;
        public equality eq;
        public ss_equality e;
        
        public ssEqualityExpansion(ss_comparison c, equality eq, ss_equality e)
        {
            this.c = c;
            this.eq = eq;
            this.e = e;
        }
        
        public String toString(){
            return c.toString() + " " + eq.toString() + " " + e.toString();
        }
        
        // public boolean evaluate(){
        //     switch(eq.evaluate()){
        //         case "!=" : return c.evaluate() != e.evaluate();
        //         case "==" : return c.evaluate() == e.evaluate();
        //     }
        // }
        
        public void setSymList(SymList sl)
        {
            if(c instanceof ss_comparison.ssComparison)
            {
                ((ss_comparison.ssComparison) c).setSymList(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                ((ss_comparison.ssComparisonExpansion) c).setSymList(sl);
            }
            
            if(eq instanceof equality.equal)
            {
                ((equality.equal) eq).setSymList(sl);
            }

            if(e instanceof ss_equality.ssEquality)
            {
                ((ss_equality.ssEquality) e).setSymList(sl);
            }
            else if(e instanceof ss_equality.ssEqualityExpansion)
            {
                ((ss_equality.ssEqualityExpansion) e).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String equal = "1";
            String compare = "2";
            if(c instanceof ss_comparison.ssComparison)
            {
                compare = ((ss_comparison.ssComparison) c).checkContext(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                compare = ((ss_comparison.ssComparisonExpansion) c).checkContext(sl);
            }
            
            if(eq instanceof equality.equal)
            {
                ((equality.equal) eq).checkContext(sl);
            }

            if(e instanceof ss_equality.ssEquality)
            {
                equal = ((ss_equality.ssEquality) e).checkContext(sl);
            }
            else if(e instanceof ss_equality.ssEqualityExpansion)
            {
                equal = ((ss_equality.ssEqualityExpansion) e).checkContext(sl);
        }
            if(equal.equals("stringy"))
            {
                switch(compare)
                {
                    case "stringy"  :
                    case "booly"    :
                    case "null"     :
                    case "inty"     :
                    case "floaty"   :
                    case "chary"    : return "booly";
                    default         : ErrorReport.error("Datatype Mismatch");
                                        
                }
            }
            else if(compare.equals("stringy"))
            {
                switch(equal)
                {
                    case "stringy"  :
                    case "booly"    :
                    case "null"     :
                    case "inty"     :
                    case "floaty"   :
                    case "chary"    : return "booly";
                    default         : ErrorReport.error("Datatype Mismatch");
                                        return "";
                }
            }
            switch(compare){
                case "booly" : break;
                case "floaty" : break;
                case "inty" : break;
                default : ErrorReport.error("Datatype Not Allowed");
                            return "";
            }
            if(compare.equals(equal))
                return "booly";
                
            ErrorReport.error("Datatype Mismatch");
            
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            Object o1 = null;
            Object o2 = null;
            
            if(c instanceof ss_comparison.ssComparison)
            {
                o1 = ((ss_comparison.ssComparison) c).evaluate(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                o1 = ((ss_comparison.ssComparisonExpansion) c).evaluate(sl);
            }
            
            if(e instanceof ss_equality.ssEquality)
            {
                o2 = ((ss_equality.ssEquality) e).evaluate(sl);
            }
            else if(e instanceof ss_equality.ssEqualityExpansion)
            {
                o2 = ((ss_equality.ssEqualityExpansion) e).evaluate(sl);
            }
            
            if(eq instanceof equality.equal)
            {
                switch(((equality.equal) eq).evaluate())
                {
                    case "==":  return o1 == o2; 
                    case "<>":  return o1 != o2;
                }
            }
            
            return null;
        }
    }
    
    public static class ssEquality extends ss_equality
    {
        public ss_comparison c;
        
        public ssEquality(ss_comparison c)
        {
            this.c = c;
        }
        
        public String toString(){
            return c.toString();
        }
        
        /*public boolean evaluate(){
            c.evaluate();
        }*/
        
        public void setSymList(SymList sl)
        {
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
            if(c instanceof ss_comparison.ssComparison)
            {
                return ((ss_comparison.ssComparison) c).checkContext(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                return ((ss_comparison.ssComparisonExpansion) c).checkContext(sl);
            }
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            if(c instanceof ss_comparison.ssComparison)
            {
                return ((ss_comparison.ssComparison) c).evaluate(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                return ((ss_comparison.ssComparisonExpansion) c).evaluate(sl);
            }
            
            return null;
        }
    }
}


//ss_equality ::= ss_comparison:c equality:eq ss_equality:e {: RESULT = new ssEqualityExpansion(c, eq, e); :}
//			| ss_comparison:c {: RESULT = new ssEquality(c); :};

