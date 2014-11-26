package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class ss_AND extends created.iNode
{
    public ss_AND(int ln)
    {
        super(ln);
    }
    
    public static class ssANDExpansion extends ss_AND
    {
        public ss_AND a;
        public ss_equality e;
        
        public ssANDExpansion(int ln, ss_equality e, ss_AND a)
        {
            super(ln);
            this.a = a;
            this.e = e;
        }
        
        public String toString()
        {
            return e.toString() + " && " + a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(e instanceof ss_equality.ssEquality)
            {
                ((ss_equality.ssEquality) e).setSymList(sl);
            }
            else if(e instanceof ss_equality.ssEqualityExpansion)
            {
                ((ss_equality.ssEqualityExpansion) e).setSymList(sl);
            }
            if(a instanceof ss_AND.ssAND)
            {
                ((ss_AND.ssAND) a).setSymList(sl);
            }
            else if(a instanceof ss_AND.ssANDExpansion)
            {
                ((ss_AND.ssANDExpansion) a).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String equal = "1";
            String and = "2";
            if(e instanceof ss_equality.ssEquality)
            {
                equal = ((ss_equality.ssEquality) e).checkContext(sl);
            }
            else if(e instanceof ss_equality.ssEqualityExpansion)
            {
                equal = ((ss_equality.ssEqualityExpansion) e).checkContext(sl);
            }
            if(a instanceof ss_AND.ssAND)
            {
                and = ((ss_AND.ssAND) a).checkContext(sl);
            }
            else if(a instanceof ss_AND.ssANDExpansion)
            {
                and = ((ss_AND.ssANDExpansion) a).checkContext(sl);
            }
            
            if(equal.equals(and))
                return "booly";
                
            ErrorReport.error(ln(), "Datatype Mismatch in AND operator. One or more non-boolean members.");
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            Object o1 = null;
            Object o2 = null;
            
            if(a instanceof ss_AND.ssAND)
            {
                o1 = ((ss_AND.ssAND) a).evaluate(sl);
            }
            else if(a instanceof ss_AND.ssANDExpansion)
            {
                o1 = ((ss_AND.ssANDExpansion) a).evaluate(sl);
            }
            if(e instanceof ss_equality.ssEquality)
            {
                o2 = ((ss_equality.ssEquality) e).evaluate(sl);
            }
            else if(e instanceof ss_equality.ssEqualityExpansion)
            {
                o2 = ((ss_equality.ssEqualityExpansion) e).evaluate(sl);
            }
            
            return (Boolean)o1 && (Boolean)o2;
        }
    }
    
    public static class ssAND extends ss_AND
    {
        public ss_equality e;
        
        public ssAND(int ln, ss_equality e)
        {
            super(ln);
            this.e = e;
        }
        
        public String toString()
        {
            return e.toString();
        }
        
        public void setSymList(SymList sl)
        {
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
            if(e instanceof ss_equality.ssEquality)
            {
                return ((ss_equality.ssEquality) e).checkContext(sl);
            }
            else if(e instanceof ss_equality.ssEqualityExpansion)
            {
                return ((ss_equality.ssEqualityExpansion) e).checkContext(sl);
            }
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            if(e instanceof ss_equality.ssEquality)
            {
                return ((ss_equality.ssEquality) e).evaluate(sl);
            }
            else if(e instanceof ss_equality.ssEqualityExpansion)
            {
                return ((ss_equality.ssEqualityExpansion) e).evaluate(sl);
            }
            
            return null;
        }
    }
    
}


//ss_AND ::= ss_equality:e AND AND ss_AND:a {: RESULT = new ssANDExpansion(e, a); :}
//		| ss_equality:e {: RESULT = new ssAND(e); :};