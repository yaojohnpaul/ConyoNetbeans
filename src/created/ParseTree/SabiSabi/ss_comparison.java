package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
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
                default : 
                    if(arith.isEmpty())
                        ErrorReport.error("Datatype Not Allowed with Comparison Operator");
                    else
                        ErrorReport.error("Datatype Not Allowed with Comparison Operator: " + arith);
                            return "";
            }
            if(arith.equals(compare) || arith.equals("floaty") && compare.equals("inty") || arith.equals("inty") && compare.equals("floaty"))
                return "booly";
                
            if(arith.isEmpty() || compare.isEmpty())
                ErrorReport.error("Datatype Mismatch in comparison operator");
            else
                ErrorReport.error("Datatype Mismatch in comparison operator: " + arith + " and " + compare);
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            Object arith = "";
            Object compare = "";
            if(a instanceof ss_a1.ssA1)
            {
                arith = ((ss_a1.ssA1) a).evaluate(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                arith = ((ss_a1.ssA1Expansion) a).evaluate(sl);
            }
            
            if(c instanceof ss_comparison.ssComparison)
            {
                compare = ((ss_comparison.ssComparison) c).evaluate(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                compare = ((ss_comparison.ssComparisonExpansion) c).evaluate(sl);
            }
            
            if(co instanceof comparison.compare)
            {
                switch(((comparison.compare) co).checkContext(sl))
                {
                    case "<" :  if (arith instanceof Float)
                                {
                                    if(compare instanceof Float)
                                        return (float)arith < (float)compare;
                                    else if(compare instanceof Integer)
                                        return (float)arith < (int)compare;
                                }
                                else if (arith instanceof Integer)
                                {
                                    if(compare instanceof Float)
                                        return (int)arith < (float)compare;
                                    else if(compare instanceof Integer)
                                        return (int)arith < (int)compare;
                                }
                    case "<=" : if (arith instanceof Float)
                                {
                                    if(compare instanceof Float)
                                        return (float)arith <= (float)compare;
                                    else if(compare instanceof Integer)
                                        return (float)arith <= (int)compare;
                                }
                                else if (arith instanceof Integer)
                                {
                                    if(compare instanceof Float)
                                        return (int)arith <= (float)compare;
                                    else if(compare instanceof Integer)
                                        return (int)arith <= (int)compare;
                                }
                    case ">" :  if (arith instanceof Float)
                                {
                                    if(compare instanceof Float)
                                        return (float)arith > (float)compare;
                                    else if(compare instanceof Integer)
                                        return (float)arith > (int)compare;
                                }
                                else if (arith instanceof Integer)
                                {
                                    if(compare instanceof Float)
                                        return (int)arith > (float)compare;
                                    else if(compare instanceof Integer)
                                        return (int)arith > (int)compare;
                                }
                    case ">=" : if (arith instanceof Float)
                                {
                                    if(compare instanceof Float)
                                        return (float)arith >= (float)compare;
                                    else if(compare instanceof Integer)
                                        return (float)arith >= (int)compare;
                                }
                                else if (arith instanceof Integer)
                                {
                                    if(compare instanceof Float)
                                        return (int)arith >= (float)compare;
                                    else if(compare instanceof Integer)
                                        return (int)arith >= (int)compare;
                                }
                    default   : return null;
                }
            }
            
            return null;
        }
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
        
        public String checkContext(SymList sl) 
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
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            if(a instanceof ss_a1.ssA1)
            {
                return ((ss_a1.ssA1) a).evaluate(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                return ((ss_a1.ssA1Expansion) a).evaluate(sl);
            }
            
            return null;
        }
    }
}

//ss_comparison ::= ss_a1:a comparison:co ss_comparison:c {: RESULT = new ssComparisonExpansion(a, co, c); :}
//            	|	ss_a1:a {: RESULT = new ssComparison(a); :};
