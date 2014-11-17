package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_sabisabi implements created.iNode 
{
    public static class utosSabiSabiFront extends utos_sabisabi
    {
        public valid_var vv;
        public String kind;
        
        public utosSabiSabiFront(valid_var vv, String s)
        {
            this.vv = vv;
            kind = s;
        }
        
        public String toString()
        {
            return kind + vv.toString();
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
        }
        
        public void checkContext(SymList sl)
        {
            if(vv instanceof valid_var.validVar)
            {
                ((valid_var.validVar) vv).checkContext(sl);
            }
            else if(vv instanceof valid_var.validVarRB)
            {
                ((valid_var.validVarRB) vv).checkContext(sl);
            }
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
        }
        
        public void evaluate(){
            /*switch(kind){
                case "++" : ++vv.evaluate();
                case "--" : --vv.evaluate();
            }*/
        }
    }
    
    public static class utosSabiSabiBack extends utos_sabisabi
    {
        public valid_var vv;
        public String kind;
        
        public utosSabiSabiBack(valid_var vv, String s)
        {
            this.vv = vv;
            kind = s;
        }
        
        public String toString()
        {
            return vv.toString() + kind;
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
        }
        
        public void checkContext(SymList sl)
        {
            if(vv instanceof valid_var.validVar)
            {
                ((valid_var.validVar) vv).checkContext(sl);
            }
            else if(vv instanceof valid_var.validVarRB)
            {
                ((valid_var.validVarRB) vv).checkContext(sl);
            }
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
        }
        
        public void evaluate()
        {
            /*switch(kind){
                case "++" : vv.evaluate()++;
                case "--" : vv.evaluate()--;
            }*/
        }
    }
    
    
}