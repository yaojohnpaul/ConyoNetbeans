package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class OMG_dec implements created.iNode 
{
    public static class OMG extends OMG_dec
    {
        data_type dt; //Data type
        String id; //Constant name
        sabi_sabi ss; //Expression, value of constant
        
        public OMG(data_type dt, String id, sabi_sabi ss)
        {
            this.dt = dt;
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
        
        public void setSymList(SymList sl)
        { 
            Boolean avail = sl.addToList(id, new SymConst(id, ss, dt));
            if(!avail)
            {
                ErrorReport.error("Duplicate constant!: " + id);
            }
        }
        
        SymEntry dec;
        
        public void preInterpret(SymList sl)
        { 
            dec = sl.getSymbol(id);
        }
        
        public void evaluate(SymList sl)
        {
        }
    }
}