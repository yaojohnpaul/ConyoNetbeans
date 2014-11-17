package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import error.*;
import created.Sym.*;

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
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            SymEntry ste = s.getSymbol(id); 
            
            if(ste == null)
            {
                ErrorReport.error("Not yet declared!: " + id);
                return "";
            }
                
            return ste.type().toString();
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
        
        public String checkContext(SymList sl)
        {
            // if(vn instanceof valid_name.validName)
            // {
            //     return ((valid_name.validName) vn).checkContext(sl);
            // }
            // else if(vn instanceof valid_name.identifier)
            // {
            //     return ((valid_name.identifier) vn).checkContext(sl);
            // }
        }
            
    }
    
}

// package created.ParseTree.Literals;

// import created.ParseTree.Array.*;
// import created.ParseTree.Arte.*;
// import created.ParseTree.Program.*;
// import created.ParseTree.SabiSabi.*;
// import created.ParseTree.SubYaya.*;
// import created.ParseTree.Utos.*;
// import created.ParseTree.Yaya.*;
// import error.*;
// import created.Sym.*;

// public abstract class valid_name implements created.iNode
// {
    
//     public static class identifier extends valid_name
//     {
//         public String id;
        
//         public identifier(String identity)
//         {
//             this.id = identity;
//         }
        
//         public String toString()
//         {
//             return id;
//         }
        
//         public String checkContext(SymList sl) 
//         { // for sabi sabi plng
//             SymEntry ste = s.getSymbol(id); 
            
//             if(ste == null)
//             {
//                 ErrorReport.error("Not yet declared!: " + id);
//                 return "";
//             }
                
//             return ste.type().toString();
//         } 
        
//     }
    
//     public static class validName extends valid_name
//     {
//         public valid_name vn;
//         public String id;
        
//         public validName(valid_name vn, String identity)
//         {
//             this.vn = vn;
//             this.id = identity;
//         }
        
//         public String toString()
//         {
//             return vn.toString() + ":" + id;
//         }
            
//     }
    
// }