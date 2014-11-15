package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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
            return array_dt.toString();
        }
    }
}

/*
reference_dt ::= valid_name:vn {: RESULT = new referenceValidName(vn); :} 
				| array_dt:a {: RESULT = new referenceArray(a); :};
*/