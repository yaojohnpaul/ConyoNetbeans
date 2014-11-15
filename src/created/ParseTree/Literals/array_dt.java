package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class array_dt implements created.iNode
{
    
    public static class arrayPrimitive extends array_dt
    {
        public brackets b;
        public primitive_dt p;
        
        public arrayPrimitive(primitive_dt p, brackets b)
        {
            this.b = b;
            this.p = p;
        }
        
        public String toString()
        {
            return p.toString() + b.toString();
        }
        
    }
    
    public static class arrayName extends array_dt
    {
        public brackets b;
        public valid_name vn;
        
        public arrayName(valid_name p, brackets b)
        {
            this.b = b;
            this.vn = vn;
        }
        
        public String toString()
        {
            return vn.toString() + b.toString();
        }
        
        
    }
}


/*
array_dt ::= primitive_dt:p brackets:b {: RESULT = new arrayPrimitive(p, b); :}
			| valid_name:vn brackets:b {: RESULT = new arrayName(vn, b); :};
*/