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
        
        public String checkContext(SymList s) 
        { // for sabi sabi plng
            //other context here
            String or = o.checkContext();
            String and = a.checkContext();
            if(and.equals(or))
                return "booly";
                
            ErrorReport.error("Datatype Mismatch");
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
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            return a.checkContext();
        } 
    }
    
}
//ss_OR ::= ss_AND:a OR OR ss_OR:o {: RESULT = new ssORExpansion(a, o); :}
//		| ss_AND:a {: RESULT = new ssOR(a); :};