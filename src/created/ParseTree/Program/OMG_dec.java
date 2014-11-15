package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class OMG_dec implements created.iNode 
{
    public static class OMG extends OMG_dec
    {
        String id; //Constant name
        sabi_sabi ss; //Expression, value of constant
        
        public OMG(String id, sabi_sabi ss)
        {
            this.id = id;
            this.ss = ss;
        }
    
        public String toString()
        {
            return id;
        }
        
        /**
         * Get the value of the constant.
         * @return Constant value.
         */
        public sabi_sabi getValue()
        {
            return ss;
        }
    }
}