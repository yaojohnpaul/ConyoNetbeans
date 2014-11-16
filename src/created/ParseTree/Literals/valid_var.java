package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class valid_var implements created.iNode
{
    public void evaluate()
    {}
    
    public static class validVar extends valid_var
    {
        public valid_name vn;
        
        public validVar(valid_name vn)
        { 
            this.vn = vn;
        }
        
        public String toString()
        {
            return vn.toString();
        }
        
    }
    
    public static class validVarRB extends valid_var
    {
        public valid_name vn;
        public ref_brackets rb;
        
        public validVarRB(valid_name vn, ref_brackets rb)
        { 
            this.vn = vn;
            this.rb = rb;
        }
        
        public String toString()
        {
            return vn.toString() + rb.toString();
        }
    }
    
}