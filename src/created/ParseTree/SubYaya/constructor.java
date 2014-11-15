package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class constructor implements created.iNode 
{
    public static class mSimula extends constructor
    {
        public String id;
        public utos_block u;
        
        public mSimula()
        {
            this.id = id;
            this.u = u;
        }
        
        public String toString()
        {
            return "makeSimula" + id + u.toString();
        }
    }
    
}

//constructor ::= MAKE_SIMULA IDENTIFIER:id utos_block:u {: RESULT = new mSimula(id, u); :};