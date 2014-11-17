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

public abstract class ss_AND implements created.iNode
{
    public static class ssANDExpansion extends ss_AND
    {
        public ss_AND a;
        public ss_equality e;
        
        public ssANDExpansion(ss_equality e, ss_AND a)
        {
            this.a = a;
            this.e = e;
        }
        
        public String toString()
        {
            return e.toString() + " && " + a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof ss_AND.ssAND)
            {
                ((ss_AND.ssAND) a).setSymList(sl);
            }
            else if(a instanceof ss_OR.ssORExpansion)
            {
                ((ss_AND.ssANDExpansion) a).setSymList(sl);
            }
            if(e instanceof ss_equality.ssEquality)
            {
                ((ss_equality.ssEquality) e).setSymList(sl);
            }
            else if(e instanceof ss_OR.ssORExpansion)
            {
                ((ss_equality.ssEqualityExpansion) e).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String equal = "1";
            String and = "2";
            if(a instanceof ss_AND.ssAND)
            {
                and = ((ss_AND.ssAND) a).checkContext(sl);
            }
            else if(a instanceof ss_OR.ssORExpansion)
            {
                and = ((ss_AND.ssANDExpansion) a).checkContext(sl);
            }
            if(e instanceof ss_equality.ssEquality)
            {
                equal = ((ss_equality.ssEquality) e).checkContext(sl);
            }
            else if(e instanceof ss_OR.ssORExpansion)
            {
                equal = ((ss_equality.ssEqualityExpansion) e).checkContext(sl);
            }
            if(equal.equals(and))
                return "booly";
                
            ErrorReport.error("Datatype Mismatch");
            return "error";
        } 
    }
    
    public static class ssAND extends ss_AND
    {
        public ss_equality e;
        
        public ssAND(ss_equality e)
        {
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
            else if(e instanceof ss_OR.ssORExpansion)
            {
                ((ss_equality.ssEqualityExpansion) e).setSymList(sl);
            }
        }
        
        public String checkContext(SymList s) 
        { // for sabi sabi plng
            //other context here
            if(e instanceof ss_equality.ssEquality)
            {
                return ((ss_equality.ssEquality) e).checkContext(sl);
            }
            else if(e instanceof ss_OR.ssORExpansion)
            {
                return ((ss_equality.ssEqualityExpansion) e).checkContext(sl);
            }
            return "";
        } 
    }
    
}


//ss_AND ::= ss_equality:e AND AND ss_AND:a {: RESULT = new ssANDExpansion(e, a); :}
//		| ss_equality:e {: RESULT = new ssAND(e); :};