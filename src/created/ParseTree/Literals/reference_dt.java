package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class reference_dt implements created.iNode
{
    public static class referenceValidName extends reference_dt
    {
        public valid_name vn;
        
        public referenceValidName(valid_name vn)
        {
            this.vn = vn;
        }
        
        public String toString()
        {
            return vn.toString();
        }
        
        public String checkContext(SymList sl)
        {
            if(vn instanceof valid_name.validName)
            {
                return ((valid_name.validName) vn).checkContext(sl);
            }
            else if(vn instanceof valid_name.identifier)
            {
                return ((valid_name.identifier) vn).checkContext(sl);
            }
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            
        }
    }
    
    public static class referenceArray extends reference_dt
    {
        public array_dt array;
        
        public referenceArray(array_dt array)
        {
            this.array = array;
        }
        
        public String toString()
        {
            return array.toString();
        }
        
        public String checkContext(SymList sl)
        {
            if(array instanceof array_dt.arrayName)
            {
                return ((array_dt.arrayName) array).checkContext(sl);
            }
            else if(array instanceof array_dt.arrayPrimitive)
            {
                return ((array_dt.arrayPrimitive) array).checkContext(sl);
            }
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            
        }
    }
}

/*
reference_dt ::= valid_name:vn {: RESULT = new referenceValidName(vn); :} 
				| array_dt:a {: RESULT = new referenceArray(a); :};
*/