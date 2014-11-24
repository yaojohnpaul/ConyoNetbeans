package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class ss_OR extends created.iNode
{
    public ss_OR(int ln)
    {
        super(ln);
    }
    
    public static class ssORExpansion extends ss_OR
    {
        public ss_AND a;
        public ss_OR o;
        
        public ssORExpansion(int ln, ss_AND a, ss_OR o)
        {
            super(ln);
            this.a = a;
            this.o = o;
        }
        
        public String toString()
        {
            return a.toString() + " || " + o.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof ss_AND.ssAND)
            {
                ((ss_AND.ssAND) a).setSymList(sl);
            }
            else if(a instanceof ss_AND.ssANDExpansion)
            {
                ((ss_AND.ssANDExpansion) a).setSymList(sl);
            }
            if(o instanceof ss_OR.ssOR)
            {
                ((ss_OR.ssOR) o).setSymList(sl);
            }
            else if(o instanceof ss_OR.ssORExpansion)
            {
                ((ss_OR.ssORExpansion) o).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String or = "";
            String and = "";
            if(a instanceof ss_AND.ssAND)
            {
                and = ((ss_AND.ssAND) a).checkContext(sl);
            }
            else if(a instanceof ss_AND.ssANDExpansion)
            {
                and = ((ss_AND.ssANDExpansion) a).checkContext(sl);
            }
            if(o instanceof ss_OR.ssOR)
            {
                or = ((ss_OR.ssOR) o).checkContext(sl);
            }
            else if(o instanceof ss_OR.ssORExpansion)
            {
                or = ((ss_OR.ssORExpansion) o).checkContext(sl);
            }
            if(and.equals(or))
                return "booly";
                
            ErrorReport.error(ln(), "Datatype Mismatch in OR operator. One or more non-boolean members.");
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
            if(o instanceof ss_OR.ssOR)
            {
                o2 = ((ss_OR.ssOR) o).evaluate(sl);
            }
            else if(o instanceof ss_OR.ssORExpansion)
            {
                o2 = ((ss_OR.ssORExpansion) o).evaluate(sl);
            }   
            
            return (Boolean)o1 || (Boolean)o2;
        }
    }
    
    public static class ssOR extends ss_OR
    {
        public ss_AND a;
        
        public ssOR(int ln, ss_AND a)
        {
            super(ln);
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
        
        public void setSymList(SymList sl)
        {
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
            if(a instanceof ss_AND.ssAND)
            {
                return ((ss_AND.ssAND) a).checkContext(sl);
            }
            else if(a instanceof ss_AND.ssANDExpansion)
            {
                return ((ss_AND.ssANDExpansion) a).checkContext(sl);
            }
            return "";
        }
        
        public Object evaluate(SymList sl)
        {
            if(a instanceof ss_AND.ssAND)
            {
                return ((ss_AND.ssAND) a).evaluate(sl);
            }
            else if(a instanceof ss_AND.ssANDExpansion)
            {
                return ((ss_AND.ssANDExpansion) a).evaluate(sl);
            }
            
            return null;
        }
    }
    
}
//ss_OR ::= ss_AND:a OR OR ss_OR:o {: RESULT = new ssORExpansion(a, o); :}
//		| ss_AND:a {: RESULT = new ssOR(a); :};