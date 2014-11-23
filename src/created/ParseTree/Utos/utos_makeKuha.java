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
                ((arte_assign.arteAssign) a).setSymList(vv.toString(), sl);
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
            
            if(var.isEmpty() || assign.isEmpty())
                ErrorReport.error("Datatype Mismatch in " + vv.toString());
            else
                ErrorReport.error("Datatype Mismatch in " + vv.toString() + ": " + var + " and " + assign);
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
                if(sv.value() instanceof arte_init.arrayInit && vv instanceof valid_var.validVarRB)
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
                    
                    arte_init.arrayInit b1 = (arte_init.arrayInit) sv.value();
                    array_init.arrayInit b2 = null;
                    arte_init_list.arteInitList b3 = null;
                    arte_init_opt.arteInitOpt b4 = null;
                    if(b1.a instanceof array_init.arrayInit)
                    {
                        b2 = (array_init.arrayInit) b1.a;
                        if(b2.l instanceof arte_init_list.arteInitList)
                        {
                            b3 = (arte_init_list.arteInitList) b2.l;
                            if(b3.o instanceof arte_init_opt.arteInitOpt)
                            {
                                b4 = (arte_init_opt.arteInitOpt) b3.o;
                            }
                        }
                    }
                    
                    if(b4 != null)
                    {
                        b4.setSabi(index, a3);
                        b3.o = b4;
                        b2.l = b3;
                        b1.a = b2;
                        sv.setValue(b1);
                    } 
                }
                else
                {
                    sv.setValue(a1.i);
                    
                }
            }
            sl.editSymbol(vv.toString(), sv);
        }
    }
}