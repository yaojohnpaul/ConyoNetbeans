package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_dec_val extends created.iNode  
{
    public utos_dec_val(int ln)
    {
        super(ln);
    }
    
    public static class utosMakeTawag extends utos_dec_val
    {
        public utos_makeTawag ut; 
        
        public utosMakeTawag(int ln, utos_makeTawag ut)
        {
            super(ln);
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
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(ut instanceof utos_makeTawag.makeTawag)
            {
                return ((utos_makeTawag.makeTawag) ut).checkContext(sl);
            }
            
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(ut instanceof utos_makeTawag.makeTawag)
            {
                ((utos_makeTawag.makeTawag) ut).preInterpret(sl);
            }
        }
        
        public Object evaluate(SymList sl, int call, int inAFunction)
        {
            if(ut instanceof utos_makeTawag.makeTawag)
            {
                return ((utos_makeTawag.makeTawag) ut).evaluate(sl, call, inAFunction);
            }
            return null;
        }
    }
    
    public static class utosMakeBasa extends utos_dec_val
    {
        public utos_makeBasa ub; 
        
        public utosMakeBasa(int ln, utos_makeBasa ub)
        {
            super(ln);
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
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(ub instanceof utos_makeBasa.makeBasa)
            {
                return ((utos_makeBasa.makeBasa) ub).checkContext(sl);
            }
            
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(ub instanceof utos_makeBasa.makeBasa)
            {
                ((utos_makeBasa.makeBasa) ub).preInterpret(sl);
            }
        }
        
        public Object evaluate(SymList sl, int call, int inAFunction)
        {
            if(ub instanceof utos_makeBasa.makeBasa)
            {
                return ((utos_makeBasa.makeBasa) ub).evaluate(sl, call, inAFunction);
            }
            return null;
        }
    }
}