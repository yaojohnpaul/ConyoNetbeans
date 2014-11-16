package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_likeHabang implements created.iNode  
{
    public static class likeHabang extends utos_likeHabang
    {
        public sabi_sabi s; 
        public utos_block u;
        
        public likeHabang(sabi_sabi s)
        {
            this.s = s;
            this.u = null;
        }
        
        public likeHabang(sabi_sabi s, utos_block u)
        {
            this.s = s;
            this.u = u;
        }
        
        public String toString()
        {
            if(u != null)
                return "likeHabang(" + s.toString() + ")\n" + u.toString(); 
            else
                return "likeHabang(" + s.toString() + ")\n";
        }
    }
}