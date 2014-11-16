package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class makePalit_MRW implements created.iNode  
{
    public static class MRW extends makePalit_MRW
    {
        public sabi_sabi s; 
        public utos_block_opt u;
        public makePalit_MRW m;
        
        public MRW()
        {
            this.s = null;
            this.u = null;
            this.m = null;
        }
        
        public MRW(sabi_sabi s, utos_block_opt u, makePalit_MRW m)
        {
            this.s = s;
            this.u = u;
            this.m = m;
        }
        
        public String toString()
        {
            if(s != null && u != null && m != null)
                return "MRW " + s.toString() + " : " + u.toString() + "\n" + m.toString();
            else    
                return "";
        }
    }
    
    public static class MDR extends makePalit_MRW
    {
        public utos_block_opt o; 
        
        public MDR(utos_block_opt o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            return "MDR: " + o.toString();
        }
    }
}