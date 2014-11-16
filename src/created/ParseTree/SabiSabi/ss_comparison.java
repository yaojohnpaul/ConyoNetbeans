package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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
        
        public boolean evaluate(){
            switch(co.evaluate()){
                case "<" : return a.evaluate() <= e.evaluate();
                case "<=" : return a.evaluate() <= e.evaluate();
                case ">" : return a.evaluate() > e.evaluate();
                case ">=" : return a.evaluate() >= e.evaluate();
            }
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
        
        public double evaluate(){
            return a.evaluate();
        }
        
    }
}

//ss_comparison ::= ss_a1:a comparison:co ss_comparison:c {: RESULT = new ssComparisonExpansion(a, co, c); :}
//            	|	ss_a1:a {: RESULT = new ssComparison(a); :};
