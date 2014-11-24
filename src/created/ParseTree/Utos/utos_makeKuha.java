package created.ParseTree.Utos;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class utos_makeKuha extends created.iNode  
{
    public utos_makeKuha(int ln)
    {
        super(ln);
    }
    
    public static class makeKuha extends utos_makeKuha
    {
        public valid_var vv; 
        public arte_assign a;
        
        public makeKuha(int ln, valid_var vv, arte_assign a)
        {
            super(ln);
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
                ((arte_assign.arteAssign) a).setSymList(vv.toString(), sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            //check if variable
            if(sl.getSymbol(vv.toString()) instanceof SymConst)
            {
                ErrorReport.error(ln(), "Trying to assign value to a constant: " + vv.toString());
            }
            else if(sl.getSymbol(vv.toString()) instanceof SymFunc)
            {
                ErrorReport.error(ln(), "Trying to assign value to a function: " + vv.toString());
            }
            
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
            
            if(var.isEmpty() || assign.isEmpty())
                ErrorReport.error(ln(), "Datatype Mismatch in " + vv.toString());
            else
                ErrorReport.error(ln(), "Datatype Mismatch in " + vv.toString() + ": " + var + " and " + assign);
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
        
        public void evaluate(SymList sl)
        {
            String validVar = vv.toString();
            int index = 0;
            if(validVar.contains("["))
            {
                int a = validVar.indexOf("[");
                validVar = validVar.substring(0, a);
                if(vv instanceof valid_var.validVarRB)
                {
                    index = (int)((sabi_sabi.SabiSabi)((ref_brackets.refBrackets)((valid_var.validVarRB) vv).rb).s).evaluate(sl);
                }
            }

            SymVar sv = (SymVar) sl.getSymbol(validVar);
            if(a instanceof arte_assign.arteAssign)
            {
                arte_assign.arteAssign a1 = (arte_assign.arteAssign) a;
                if(sv.value() instanceof ArrayList && vv instanceof valid_var.validVarRB)
                {
                    arte_init.sabiInit a2 = null;
                    sabi_sabi.SabiSabi a3 = null;
                    if(a1.i instanceof arte_init.sabiInit)
                    {
                        a2 = (arte_init.sabiInit) a1.i;
                        if(a2.s instanceof sabi_sabi.SabiSabi)
                        {
                            a3 = (sabi_sabi.SabiSabi) a2.s;
                        }
                    }

                    ArrayList<Object> ao = (ArrayList) sv.value();
                    ao.set(index, a3.evaluate(sl));
                    sv.setValue(ao);
                }
                else
                {
                    if(a1.i instanceof arte_init.arrayInit)
                    {
                        sv.setValue(((arte_init.arrayInit) a1.i).evaluate(sl));
                    }
                    else if(a1.i instanceof arte_init.sabiInit)
                    {
                        sv.setValue(((arte_init.sabiInit) a1.i).evaluate(sl));
                    }
                }
            }
            sl.editSymbol(vv.toString(), sv);
        }
    }
}