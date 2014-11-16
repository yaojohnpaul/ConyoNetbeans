package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_makePalit implements created.iNode  
{
    public static class makePalit extends utos_makePalit
    {
        public sabi_sabi s; 
        public makePalit_MRW m;
        
        public makePalit(sabi_sabi s, makePalit_MRW m)
        {
            this.s = s;
            this.m = m;
        }
        
        public String toString()
        {
            return "makePalit(" + s.toString() + ")\n$\n" + m.toString() + "\n$"; 
        }
    }
}