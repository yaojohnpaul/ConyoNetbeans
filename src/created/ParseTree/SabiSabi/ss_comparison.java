package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class ss_comparison extends created.iNode
{
    public ss_comparison(int ln)
    {
        super(ln);
    }
    
    public static class ssComparisonExpansion extends ss_comparison
    {
        public ss_a1 a;
        public comparison co;
        public ss_comparison c;
        
        public ssComparisonExpansion(int ln, ss_a1 a, comparison co, ss_comparison c)
        {
            super(ln);
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
                        ErrorReport.error(ln(), "Datatype Not Allowed with Comparison Operator");
                    else
                        ErrorReport.error(ln(), "Datatype Not Allowed with Comparison Operator: " + arith);
                            return "";
            }
            if(arith.equals(compare) || arith.equals("floaty") && compare.equals("inty") || arith.equals("inty") && compare.equals("floaty"))
                return "booly";
                
            if(arith.isEmpty() || compare.isEmpty())
                ErrorReport.error(ln(), "Datatype Mismatch in comparison operator");
            else
                ErrorReport.error(ln(), "Datatype Mismatch in comparison operator: " + arith + " and " + compare);
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            Object o1 = "";
            Object o2 = "";
            
            if(c instanceof ss_comparison.ssComparison)
            {
                o1 = ((ss_comparison.ssComparison) c).evaluate(sl);
            }
            else if(c instanceof ss_comparison.ssComparisonExpansion)
            {
                o1 = ((ss_comparison.ssComparisonExpansion) c).evaluate(sl);
            }
            if(a instanceof ss_a1.ssA1)
            {
                o2 = ((ss_a1.ssA1) a).evaluate(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                o2 = ((ss_a1.ssA1Expansion) a).evaluate(sl);
            }
            
            
        
            if(co instanceof comparison.compare)
            {
                switch(((comparison.compare) co).checkContext(sl))
                {
                    case "<" :  if (o1 instanceof Float)
                                {
                                    if(o2 instanceof Float)
                                        return (float)o1 < (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (float)o1 < (int)o2;
                                }
                                else if (o1 instanceof Integer)
                                {
                                    if(o2 instanceof Float)
                                        return (int)o1 < (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (int)o1 < (int)o2;
                                }
                    case "<=" : if (o1 instanceof Float)
                                {
                                    if(o2 instanceof Float)
                                        return (float)o1 <= (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (float)o1 <= (int)o2;
                                }
                                else if (o1 instanceof Integer)
                                {
                                    if(o2 instanceof Float)
                                        return (int)o1 <= (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (int)o1 <= (int)o2;
                                }
                    case ">" :  if (o1 instanceof Float)
                                {
                                    if(o2 instanceof Float)
                                        return (float)o1 > (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (float)o1 > (int)o2;
                                }
                                else if (o1 instanceof Integer)
                                {
                                    if(o2 instanceof Float)
                                        return (int)o1 > (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (int)o1 > (int)o2;
                                }
                    case ">=" : if (o1 instanceof Float)
                                {
                                    if(o2 instanceof Float)
                                        return (float)o1 >= (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (float)o1 >= (int)o2;
                                }
                                else if (o1 instanceof Integer)
                                {
                                    if(o2 instanceof Float)
                                        return (int)o1 >= (float)o2;
                                    else if(o2 instanceof Integer)
                                        return (int)o1 >= (int)o2;
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
        
        public ssComparison(int ln, ss_a1 a)
        {
            super(ln);
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
