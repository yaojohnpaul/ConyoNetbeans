package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class constructor implements created.iNode 
{
    public static class mSimula extends constructor
    {
        public String id;
        public utos_block u;
        
        public mSimula(String id, utos_block u)
        {
            this.id = id;
            this.u = u;
        }
        
        public String toString()
        {
            return "makeSimula" + id + u.toString();
        }
        
        public void setSymList(SymList sl)
        {
            Boolean avail = sl.addToList(id, new SymConstructor(id, this));
            if(!avail)
            {
                ErrorReport.error("Constructor name taken! Replacing with constructor..");
                sl.editSymbol(id, new SymConstructor(id, this));
            }
        }
        
        public void checkContext(SymList sl)
        {
            
        }
    }
    
}

//constructor ::= MAKE_SIMULA IDENTIFIER:id utos_block:u {: RESULT = new mSimula(id, u); :};