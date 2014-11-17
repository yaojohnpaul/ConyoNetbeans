package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_dec_val implements created.iNode  
{
    public static class utosMakeTawag extends utos_dec_val
    {
        public utos_makeTawag ut; 
        
        public utosMakeTawag(utos_makeTawag ut)
        {
            this.ut = ut;
        }
        
        public String toString()
        {
            return ut.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(ut instanceof utos_makeTawag.makeTawag)
            {
                ((utos_makeTawag.makeTawag) ut).setSymList(sl);
            }
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            if(ut instanceof utos_makeTawag.makeTawag)
            {
                return ((utos_makeTawag.makeTawag) ut).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(ut instanceof utos_makeTawag.makeTawag)
            {
                ((utos_makeTawag.makeTawag) ut).preInterpret(sl);
            }
        }
    }
    
    public static class utosMakeBasa extends utos_dec_val
    {
        public utos_makeBasa ub; 
        
        public utosMakeBasa(utos_makeBasa ub)
        {
            this.ub = ub;
        }
        
        public String toString()
        {
            return ub.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(ub instanceof utos_makeBasa.makeBasa)
            {
                ((utos_makeBasa.makeBasa) ub).setSymList(sl);
            }
        }
        
        public String checkContext(SymList st) 
        { // for sabi sabi plng
            //other context here
            if(ub instanceof utos_makeBasa.makeBasa)
            {
                return ((utos_makeBasa.makeBasa) ub).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(ub instanceof utos_makeBasa.makeBasa)
            {
                ((utos_makeBasa.makeBasa) ub).preInterpret(sl);
            }
        }
    }
}