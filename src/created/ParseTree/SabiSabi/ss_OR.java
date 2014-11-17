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

public abstract class ss_OR implements created.iNode
{
    public static class ssORExpansion extends ss_OR
    {
        public ss_AND a;
        public ss_OR o;
        
        public ssORExpansion(ss_AND a, ss_OR o)
        {
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
                
            ErrorReport.error("Datatype Mismatch");
            return "";
        } 
    }
    
    public static class ssOR extends ss_OR
    {
        public ss_AND a;
        
        public ssOR(ss_AND a)
        {
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
    }
    
}
//ss_OR ::= ss_AND:a OR OR ss_OR:o {: RESULT = new ssORExpansion(a, o); :}
//		| ss_AND:a {: RESULT = new ssOR(a); :};