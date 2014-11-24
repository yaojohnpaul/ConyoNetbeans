package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class OMG_dec extends created.iNode 
{
    public OMG_dec(int ln)
    {
        super(ln);
    }
    
    public static class OMG extends OMG_dec
    {
        data_type dt; //Data type
        String id; //Constant name
        literal l; //value of constant
        
        public OMG(int ln, data_type dt, String id, literal l)
        {
            super(ln);
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
                ErrorReport.error(ln(), "Duplicate constant!: " + id);
            }
        }
        
        public String checkContext(SymList sl)
        {
            String constant = "";
            String literal = "";
            
            if(dt instanceof data_type.datatypePrimitive)
            {
                constant = ((data_type.datatypePrimitive) dt).checkContext(sl);
            }
            else if(dt instanceof data_type.datatypeReference)
            {
                constant = ((data_type.datatypeReference) dt).checkContext(sl);
            }
            
            if(l instanceof literal.Inty)
            {
                literal = ((literal.Inty) l).checkContext(sl);
            }
            else if(l instanceof literal.Floaty)
            {
                literal = ((literal.Floaty) l).checkContext(sl);
            }
            else if(l instanceof literal.Stringy)
            {
                literal = ((literal.Stringy) l).checkContext(sl);
            }
            else if(l instanceof literal.Chary)
            {
                literal = ((literal.Floaty) l).checkContext(sl);
            }
            else if(l instanceof literal.Booly)
            {
                literal = ((literal.Floaty) l).checkContext(sl);
            }
            else if(l instanceof literal.Waley)
            {
                literal = ((literal.Waley) l).checkContext(sl);
            }
            
            //check if equal
            if(!literal.equals("waley"))
            {
                if(constant.equals(literal))
                {
                    return constant;
                }
                else
                {
                    if(constant.isEmpty() || literal.isEmpty())
                        ErrorReport.error(ln(), "Datatype Mismatch in " + id);
                    else
                        ErrorReport.error(ln(), "Datatype Mismatch in " + id + ": " + constant + " and " + literal);
                    return "";
                }
            }
            else
            {
                return constant;
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