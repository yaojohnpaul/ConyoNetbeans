package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_dec_db implements created.iNode  
{
    public static class utosMakeKuha extends utos_dec_db
    {
        public utos_makeKuha uk; 
        
        public utosMakeKuha(utos_makeKuha uk)
        {
            this.uk = uk;
        }
        
        public String toString()
        {
            return uk.toString() + " db";
        }
        
        public void setSymList(SymList sl)
        {
            if(uk instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) uk).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(uk instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) uk).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(uk instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) uk).preInterpret(sl);
            }
        }
    }
    
    public static class utosMakeSulat extends utos_dec_db
    {
        public utos_makeSulat usu; 
        
        public utosMakeSulat(utos_makeSulat usu)
        {
            this.usu = usu;
        }
        
        public String toString()
        {
            return usu.toString() + " db";
        }
        
        public void setSymList(SymList sl)
        {
            if(usu instanceof utos_makeSulat.makeSulat)
            {
                ((utos_makeSulat.makeSulat) usu).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(usu instanceof utos_makeSulat.makeSulat)
            {
                ((utos_makeSulat.makeSulat) usu).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(usu instanceof utos_makeSulat.makeSulat)
            {
                ((utos_makeSulat.makeSulat) usu).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            if(usu instanceof utos_makeSulat.makeSulat)
            {
                ((utos_makeSulat.makeSulat) usu).evaluate(sl);
            }
        }
    }
    
    public static class breakup extends utos_dec_db
    {
        public breakup()
        {
        }
        
        public String toString()
        {
            return "breakup db";
        }
    }
    
    public static class makeup extends utos_dec_db
    {
        public makeup()
        {
        }
        
        public String toString()
        {
            return "makeup db";
        }
    }
}