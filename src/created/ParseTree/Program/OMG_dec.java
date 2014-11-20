package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
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
        literal l; //value of constant
        
        public OMG(data_type dt, String id, literal l)
        {
            this.dt = dt;
            this.id = id;
            this.l = l;
        }
    
        public String toString()
        {
            return id;
        }
        
        /**
         * Get the value of the constant.
         * @return Constant value.
         */
        public literal getValue()
        {
            return l;
        }
        
        public void setSymList(SymList sl)
        { 
            Boolean avail = sl.addToList(id, new SymConst(id, l, dt));
            if(!avail)
            {
                ErrorReport.error("Duplicate constant!: " + id);
            }
        }
        
        SymConst dec;
        
        public void preInterpret(SymList sl)
        { 
            dec = (SymConst) sl.getSymbol(id);
        }
        
        public void evaluate(SymList sl)
        {
            //Object result = ss.evaluate(sl);
        }
    }
}