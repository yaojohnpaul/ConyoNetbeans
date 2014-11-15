package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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
            return e.toString() + " AND " + a.toString();
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
    }
    
}


//ss_AND ::= ss_equality:e AND AND ss_AND:a {: RESULT = new ssANDExpansion(e, a); :}
//		| ss_equality:e {: RESULT = new ssAND(e); :};