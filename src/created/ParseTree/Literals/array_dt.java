package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

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
        
        public void setSymList(SymList sl)
        {
            if(p instanceof primitive_dt.intType)
            {
                
            }
            else if(p instanceof primitive_dt.floatType)
            {
                
            }
            else if(p instanceof primitive_dt.stringType)
            {
                
            }
            else if(p instanceof primitive_dt.charType)
            {
                
            }
            else if(p instanceof primitive_dt.booleanType)
            {
                
            }
        }
        
        public String checkContext(SymList sl)
        {
            if(p instanceof primitive_dt.intType)
            {
                return "inty";
            }
            else if(p instanceof primitive_dt.floatType)
            {
                return "floaty";
            }
            else if(p instanceof primitive_dt.stringType)
            {
                return "stringy";
            }
            else if(p instanceof primitive_dt.charType)
            {
                return "chary";
            }
            else if(p instanceof primitive_dt.booleanType)
            {
                return "booly";
            }
            
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(p instanceof primitive_dt.intType)
            {
                
            }
            else if(p instanceof primitive_dt.floatType)
            {
                
            }
            else if(p instanceof primitive_dt.stringType)
            {
                
            }
            else if(p instanceof primitive_dt.charType)
            {
                
            }
            else if(p instanceof primitive_dt.booleanType)
            {
                
            }
        }
    }
}


/*
array_dt ::= primitive_dt:p brackets:b {: RESULT = new arrayPrimitive(p, b); :}
			| valid_name:vn brackets:b {: RESULT = new arrayName(vn, b); :};
*/