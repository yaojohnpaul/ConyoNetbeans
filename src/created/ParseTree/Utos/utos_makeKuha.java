package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class utos_makeKuha implements created.iNode  
{
    public static class makeKuha extends utos_makeKuha
    {
        public valid_var vv; 
        public arte_assign a;
        
        public makeKuha(valid_var vv, arte_assign a)
        {
            this.vv = vv;
            this.a = a;
        }
        
        public String toString()
        {
            return vv.toString() + " " + a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(vv instanceof valid_var.validVar)
            {
                ((valid_var.validVar) vv).setSymList(sl);
            }
            else if(vv instanceof valid_var.validVarRB)
            {
                ((valid_var.validVarRB) vv).setSymList(sl);
            }
            
            if(a instanceof arte_assign.arteAssign)
            {
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String var = "";
            String assign = "";
            
            if(vv instanceof valid_var.validVar)
            {
                var = ((valid_var.validVar) vv).checkContext(sl);
            }
            else if(vv instanceof valid_var.validVarRB)
            {
                var = ((valid_var.validVarRB) vv).checkContext(sl);
            }
            
            
            if(a instanceof arte_assign.arteAssign)
            {
                assign = ((arte_assign.arteAssign) a).checkContext(sl);
            }
            
            
            if(var.equals(assign))
            {
                return var;
            }
            
            ErrorReport.error("Datatype Mismatch");
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(vv instanceof valid_var.validVar)
            {
                ((valid_var.validVar) vv).preInterpret(sl);
            }
            else if(vv instanceof valid_var.validVarRB)
            {
                ((valid_var.validVarRB) vv).preInterpret(sl);
            }
            
            if(a instanceof arte_assign.arteAssign)
            {
                ((arte_assign.arteAssign) a).preInterpret(sl);
            }
        }
    }
}