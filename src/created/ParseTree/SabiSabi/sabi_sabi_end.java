package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class sabi_sabi_end implements created.iNode
{
    
    public static class ssEndValidVar extends sabi_sabi_end
    {
        public valid_var v;
        
        public ssEndValidVar(valid_var v)
        {
            this.v = v;
        }
        
        public String toString()
        {
            return v.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(v instanceof valid_var.validVar)
            {
                ((valid_var.validVar) v).setSymList(sl);
            }
            else if(v instanceof valid_var.validVarRB)
            {
                ((valid_var.validVarRB) v).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            if(v instanceof valid_var.validVar)
            {
                return ((valid_var.validVar) v).checkContext(sl);
            }
            else if(v instanceof valid_var.validVarRB)
            {
                return ((valid_var.validVarRB) v).checkContext(sl);
            }
            return "";
        }
        
        public Object evaluate(SymList sl)
        {
            if(v instanceof valid_var.validVar)
            {
                return ((valid_var.validVar) v).evaluate(sl);
            }
            else if(v instanceof valid_var.validVarRB)
            {
                return ((valid_var.validVarRB) v).evaluate(sl);
            }
            return null;
        }
    }
    
    public static class ssEndUtos extends sabi_sabi_end
    {
        public utos_dec_val u;
        
        public ssEndUtos(utos_dec_val u)
        {
            this.u = u;
        }
        
        public String toString()
        {
            return u.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(u instanceof utos_dec_val.utosMakeBasa)
            {
                ((utos_dec_val.utosMakeBasa) u).setSymList(sl);
            }
            else if(u instanceof utos_dec_val.utosMakeTawag)
            {
                ((utos_dec_val.utosMakeTawag) u).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            if(u instanceof utos_dec_val.utosMakeBasa)
            {
                return ((utos_dec_val.utosMakeBasa) u).checkContext(sl);
            }
            else if(u instanceof utos_dec_val.utosMakeTawag)
            {
                String fndt = "";
                fndt = ((utos_dec_val.utosMakeTawag) u).checkContext(sl);
                if(fndt.equals("poor"))
                {
                    ErrorReport.error("Void function used in expression.: " + 
                    ((valid_name.identifier)((utos_makeTawag.makeTawag)((utos_dec_val.utosMakeTawag) u).ut).vn).toString());
                    return "";
                }
                else
                {
                    return fndt;
                }
            }
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            if(u instanceof utos_dec_val.utosMakeBasa)
            {
                return ((utos_dec_val.utosMakeBasa) u).evaluate(sl);
            }
            else if(u instanceof utos_dec_val.utosMakeTawag)
            {
                return ((utos_dec_val.utosMakeTawag) u).evaluate(sl);
            }
            return null;
        }
    }
    
    public static class ssEndLiteral extends sabi_sabi_end
    {
        public literal l;
        
        public ssEndLiteral(literal l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString();
        }
        
        public void setSymList(SymList sl)
        {
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(l instanceof literal.Booly)
            {
                return ((literal.Booly) l).checkContext(sl);
            }
            else if(l instanceof literal.Waley)
            {
                return ((literal.Waley) l).checkContext(sl);
            }
            else if(l instanceof literal.Chary)
            {
                return ((literal.Chary) l).checkContext(sl);
            }
            else if(l instanceof literal.Stringy)
            {
                return ((literal.Stringy) l).checkContext(sl);
            }
            else if(l instanceof literal.Floaty)
            {
                return ((literal.Floaty) l).checkContext(sl);
            }
            else if(l instanceof literal.Inty)
            {
                return ((literal.Inty) l).checkContext(sl);
            }
            return "";
        }
        
        public Object evaluate(SymList sl) 
        { // for sabi sabi plng
            //other context here
            
            if(l instanceof literal.Booly)
            {
                if((((literal.Booly) l).value).equals("yuhh"))
                    return true;
                else
                    return false;
            }
            else if(l instanceof literal.Waley)
            {
                return null;
            }
            else if(l instanceof literal.Chary)
            {
                return (((literal.Chary) l).value).charAt(0);
            }
            else if(l instanceof literal.Stringy)
            {
                return ((literal.Stringy) l).value;
            }
            else if(l instanceof literal.Floaty)
            {
                return Float.valueOf(((literal.Floaty) l).value);
            }
            else if(l instanceof literal.Inty)
            {
                return Integer.valueOf(((literal.Inty) l).value);
            }
            return "";
        }
    }
    
}
/*
sabi_sabi_end ::= valid_var:v {: RESULT = new ssEndValidVar(v); :}
				| utos_dec_val:u {: RESULT = new ssEndUtos(u); :}
				| literal:l {: RESULT = new ssEndLiteral(l); :};
*/