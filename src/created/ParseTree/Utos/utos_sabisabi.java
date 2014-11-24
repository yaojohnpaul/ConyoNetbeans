package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.ErrorReport;

public abstract class utos_sabisabi extends created.iNode 
{
    public utos_sabisabi(int ln)
    {
        super(ln);
    }
    
    public static class utosSabiSabiFront extends utos_sabisabi
    {
        public valid_var vv;
        public String kind;
        
        public utosSabiSabiFront(int ln, valid_var vv, String s)
        {
            super(ln);
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
            SymVar sv = (SymVar) sl.getSymbol(vv.toString());
            if(vv instanceof valid_var.validVar)
            {
                ((valid_var.validVar) vv).checkContext(sl);
            }
            else if(vv instanceof valid_var.validVarRB)
            {
                ((valid_var.validVarRB) vv).checkContext(sl);
            }
            switch(sv.dataType().toString())
            {
                case "inty":
                case "floaty": break;
                default: 
                    if(kind.equals("++"))
                    {
                        ErrorReport.error(ln(), "Invalid datatype for increment operator");
                    }
                    else if(kind.equals("--"))
                    {
                        ErrorReport.error(ln(), "Invalid datatype for decrement operator");
                    }
                    break;
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
        
        public void evaluate(SymList sl){
            SymVar sv = (SymVar) sl.getSymbol(vv.toString());
            switch(kind){
                case "++" :
                    if(sv.value() instanceof Integer)
                    {
                        sv.setValue(((Integer) sv.value()) + 1);
                    }
                    else if(sv.value() instanceof Float)
                    {
                        sv.setValue(((Float) sv.value()) + 1);
                    }
                    break;
                case "--" :
                    if(sv.value() instanceof Integer)
                    {
                        sv.setValue(((Integer) sv.value()) - 1);
                    }
                    else if(sv.value() instanceof Float)
                    {
                        sv.setValue(((Float) sv.value()) - 1);
                    }
                    break;
            }
            sl.editSymbol(vv.toString(), sv);
        }
    }
    
    public static class utosSabiSabiBack extends utos_sabisabi
    {
        public valid_var vv;
        public String kind;
        
        public utosSabiSabiBack(int ln, valid_var vv, String s)
        {
            super(ln);
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
            SymVar sv = (SymVar) sl.getSymbol(vv.toString());
            if(vv instanceof valid_var.validVar)
            {
                ((valid_var.validVar) vv).checkContext(sl);
            }
            else if(vv instanceof valid_var.validVarRB)
            {
                ((valid_var.validVarRB) vv).checkContext(sl);
            }
            switch(sv.dataType().toString())
            {
                case "inty":
                case "floaty": break;
                default: 
                    if(kind.equals("++"))
                    {
                        ErrorReport.error(ln(), "Invalid datatype for increment operator");
                    }
                    else if(kind.equals("--"))
                    {
                        ErrorReport.error(ln(), "Invalid datatype for decrement operator");
                    }
                    break;
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
        
        public void evaluate(SymList sl)
        {
            SymVar sv = (SymVar) sl.getSymbol(vv.toString());
            switch(kind){
                case "++" :
                    if(sv.value() instanceof Integer)
                    {
                        sv.setValue(((Integer) sv.value()) + 1);
                    }
                    else if(sv.value() instanceof Float)
                    {
                        sv.setValue(((Float) sv.value()) + 1);
                    }
                    break;
                case "--" :
                    if(sv.value() instanceof Integer)
                    {
                        sv.setValue(((Integer) sv.value()) - 1);
                    }
                    else if(sv.value() instanceof Float)
                    {
                        sv.setValue(((Float) sv.value()) - 1);
                    }
                    break;
            }
            sl.editSymbol(vv.toString(), sv);
        }
    }
    
    
}