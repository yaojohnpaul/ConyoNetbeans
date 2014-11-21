package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class reference_dt implements created.iNode
{
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
        
        public void setSymList(SymList sl)
        {
            
        }
        
        public String checkContext(SymList sl)
        {
            if(array instanceof array_dt.arrayPrimitive)
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