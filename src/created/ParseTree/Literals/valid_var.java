package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
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
            if(vn instanceof valid_name.validName)
            {
                ((valid_name.validName) vn).setSymList(sl);
            }
            else if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            if(vn instanceof valid_name.validName)
            {
                return ((valid_name.validName) vn).checkContext(sl);
            }
            else if(vn instanceof valid_name.identifier)
            {
                return ((valid_name.identifier) vn).checkContext(sl);
            }
            
            return "";
        } 
        
        public void preInterpret(SymList sl) 
        { 
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
            if(vn instanceof valid_name.validName)
            {
                ((valid_name.validName) vn).setSymList(sl);
            }
            else if(vn instanceof valid_name.identifier)
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
            
            if(vn instanceof valid_name.validName)
            {
                return ((valid_name.validName) vn).checkContext(sl);
            }
            else if(vn instanceof valid_name.identifier)
            {
                return ((valid_name.identifier) vn).checkContext(sl);
            }
            
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(vn instanceof valid_name.validName)
            {
                ((valid_name.validName) vn).preInterpret(sl);
            }
            else if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).preInterpret(sl);
            }
            
            if(rb instanceof ref_brackets.refBrackets)
            {
                ((ref_brackets.refBrackets) rb).preInterpret(sl);
            }
        }
    }
    
}