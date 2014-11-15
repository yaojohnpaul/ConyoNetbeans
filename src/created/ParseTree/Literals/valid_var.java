package created.ParseTree.Literals;

abstract class valid_var implements created.iNode
{
    
    public static class validVar extends valid_var
    {
        public valid_name vn;
        
        public validVar(valid_name vn)
        { 
            this.vn = vn;;
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
        
        public validVar(valid_name vn, ref_brackets rb)
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