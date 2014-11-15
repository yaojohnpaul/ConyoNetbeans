package created.parseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_makeSabi implements created.iNode  
{
    public static class makeSabi extends utos_makeSabi
    {
        public sabi_sabi s; 
        
        public makeSabi(sabi_sabi s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return "makeSabi " + s.toString();
        }
    }
}