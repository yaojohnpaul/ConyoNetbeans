package created.ParseTree.Literals;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import error.*;
import created.Sym.*;

public abstract class valid_name implements created.iNode
{
    
    public static class identifier extends valid_name
    {
        public String id;
        
        public identifier(String identity)
        {
            this.id = identity;
        }
        
        public String toString()
        {
            return id;
        }
        
        public void setSymList(SymList sl){
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            SymEntry ste = null;
            if(sl.getSymbol(id) instanceof SymVar)
                ste = (SymVar) sl.getSymbol(id);
            else if(sl.getSymbol(id) instanceof SymFunc)
                ste = (SymFunc) sl.getSymbol(id);
            else if(sl.getSymbol(id) instanceof SymConst)
                ste = (SymConst) sl.getSymbol(id);
            
            if(ste == null)
            {
                ErrorReport.error("Not yet declared!: " + id);
                return "";
            }
                
            if(ste.type() instanceof data_type.datatypeReference)
                return ((data_type.datatypeReference) ste.type()).checkContext(sl);
            else if (ste.type() instanceof data_type.datatypePrimitive)
                return ((data_type.datatypePrimitive) ste.type()).checkContext(sl);
                
            if(ste.type() == null)
                return "poor";
                
            return ste.type().toString();
        } 
        
        public void preInterpret(SymList sl)
        {
            
        }
        
        public Object evaluate(SymList sl)
        {
            if(sl.getSymbol(id) instanceof SymVar)
            {
                SymVar sv = (SymVar) sl.getSymbol(id);
                return sv.value();
            }
            else if(sl.getSymbol(id) instanceof SymConst)
            {
                SymConst sc = (SymConst) sl.getSymbol(id);
                if(sc.getLiteral() instanceof literal.Booly)
                {
                    return ((literal.Booly) sc.getLiteral()).evaluate();
                }
                else if(sc.getLiteral() instanceof literal.Chary)
                {
                    return ((literal.Chary) sc.getLiteral()).evaluate();
                }
                else if(sc.getLiteral() instanceof literal.Floaty)
                {
                    return ((literal.Floaty) sc.getLiteral()).evaluate();
                }
                else if(sc.getLiteral() instanceof literal.Inty)
                {
                    return ((literal.Inty) sc.getLiteral()).evaluate();
                }
                else if(sc.getLiteral() instanceof literal.Stringy)
                {
                    return ((literal.Stringy) sc.getLiteral()).evaluate();
                }
                else
                {
                    return null;
                }
            }
            return null;
        }
    }
}

// package created.ParseTree.Literals;

// import created.ParseTree.Array.*;
// import created.ParseTree.Arte.*;
// import created.ParseTree.Progra