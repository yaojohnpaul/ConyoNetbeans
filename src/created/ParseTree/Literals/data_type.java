package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class data_type implements created.iNode
{
    public static class datatypePrimitive extends data_type
    {
        public primitive_dt p;
        
        public datatypePrimitive(primitive_dt p)
        {
            this.p = p;
        }
        
        public String toString()
        {
            return p.toString();
        }
        
    }
    
    public static class datatypeReference extends data_type
    {
        public reference_dt r;
        
        public datatypeReference(reference_dt r)
        {
            this.r = r;
        }
        
        public String toString()
        {
            return r.toString();
        }
        
    }
}

/*
data_type ::= primitive_dt:p {: RESULT = new datatypePrimitive(p); :}
			| reference_dt:r {: RESULT = new datatypeReference(r); :};
*/