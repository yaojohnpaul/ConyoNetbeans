package created.parseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_makeGawaHabang implements created.iNode  
{
    public static class makeGawaHabang extends utos_makeGawaHabang
    {
        public utos_block u; 
        public sabi_sabi s;
        
        public makeGawaHabang(utos_block u, sabi_sabi s)
        {
            this.u = u;
            this.s = s;
        }
        
        public String toString()
        {
            return "makeGawa\n" + u.toString() + "\nlikeHabang(" + s.toString() + ")";
        }
    }
}