package created.ParseTree.Literals;

import java.util.*;
import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class valid_var implements created.iNode
{
    public static class validVar extends valid_var
    {
        public valid_name vn;
        
        public validVar(valid_name vn)
        { 
            this.vn = vn;
        }
        
        public String toString()
        {
            return vn.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plngreturn ((valid_name.validName) vn).checkContext(sl);
            if(vn instanceof valid_name.identifier)
            {
                return ((valid_name.identifier) vn).checkContext(sl);
            }
            
            return "";
        } 
        
        public void preInterpret(SymList sl) 
        { 
        } 
        
        public Object evaluate(SymList sl) 
        {
            if(vn instanceof valid_name.identifier)
            {
                return ((valid_name.identifier) vn).evaluate(sl);
            }
            return null;
        } 
    }
    
    public static class validVarRB extends valid_var
    {
        public valid_name vn;
        public ref_brackets rb;
        
        public validVarRB(valid_name vn, ref_brackets rb)
        { 
            this.vn = vn;
            this.rb = rb;
        }
        
        public String toString()
        {
            return vn.toString() + rb.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).setSymList(sl);
            }
            
            if(rb instanceof ref_brackets.refBrackets)
            {
                ((ref_brackets.refBrackets) rb).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl)
        {
            if(rb instanceof ref_brackets.refBrackets)
            {
                ((ref_brackets.refBrackets) rb).checkContext(sl);
            }
            
            if(vn instanceof valid_name.identifier)
            {
                String toReturn = ((valid_name.identifier) vn).checkContext(sl);
                if(toReturn.contains("[]"))
                {
                    toReturn = toReturn.replace("[]", "");
                }
                return toReturn;
            }
            
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).preInterpret(sl);
            }
            
            if(rb instanceof ref_brackets.refBrackets)
            {
                ((ref_brackets.refBrackets) rb).preInterpret(sl);
            }
        }
        
        public Object evaluate(SymList sl)
        {
            int index = 0;
            SymVar sv = null;
            if(vn instanceof valid_name.identifier)
            {
                sv = (SymVar) sl.getSymbol(((valid_name.identifier) vn).toString());
                if(rb instanceof ref_brackets.refBrackets)
                {
                    index = (int)((sabi_sabi.SabiSabi)((ref_brackets.refBrackets) rb).s).evaluate(sl);
                    arte_init ai = sv.value();
                    if(ai instanceof arte_init.arrayInit)
                    {
                        ArrayList<Object> ao = ((arte_init.arrayInit) ai).evaluate(sl);
                        return ao.get(index);
                    }
                }
            }
            
            return null;
        }
    }
    
}