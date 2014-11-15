package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class valid_name implements created.iNode
{
    
    public static class identifier extends valid_name
    {
        public String id;
        
        public identifier(String identity)
        {
            this.id = identity;
        }
        
        public String toString()
        {
            return id;
        }
        
    }
    
    public static class validName extends valid_name
    {
        public valid_name vn;
        public String id;
        
        public validName(valid_name vn, String identity)
        {
            this.vn = vn;
            this.id = identity;
        }
        
        public String toString()
        {
            return vn.toString() + ":" + id;
        }
            
    }
    
}