package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_dec_nodb implements created.iNode  
{
    public static class utosLikeKapag extends utos_dec_nodb
    {
        public utos_likeKapag uk; 
        
        public utosLikeKapag(utos_likeKapag uk)
        {
            this.uk = uk;
        }
        
        public String toString()
        {
            return uk.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(uk instanceof utos_likeKapag.likeKapag)
            {
                ((utos_likeKapag.likeKapag) uk).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(uk instanceof utos_likeKapag.likeKapag)
            {
                ((utos_likeKapag.likeKapag) uk).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(uk instanceof utos_likeKapag.likeKapag)
            {
                ((utos_likeKapag.likeKapag) uk).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            if(uk instanceof utos_likeKapag.likeKapag)
            {
                ((utos_likeKapag.likeKapag) uk).evaluate(sl);
            }
        }
    }
    
    public static class utosMakePalit extends utos_dec_nodb
    {
        public utos_makePalit up; 
        
        public utosMakePalit(utos_makePalit up)
        {
            this.up = up;
        }
        
        public String toString()
        {
            return up.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(up instanceof utos_makePalit.makePalit)
            {
                ((utos_makePalit.makePalit) up).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(up instanceof utos_makePalit.makePalit)
            {
                ((utos_makePalit.makePalit) up).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(up instanceof utos_makePalit.makePalit)
            {
                ((utos_makePalit.makePalit) up).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
        
        }
    }
    
    public static class utosLikeHabang extends utos_dec_nodb
    {
        public utos_likeHabang uh; 
        
        public utosLikeHabang(utos_likeHabang uh)
        {
            this.uh = uh;
        }
        
        public String toString()
        {
            return uh.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(uh instanceof utos_likeHabang.likeHabang)
            {
                ((utos_likeHabang.likeHabang) uh).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(uh instanceof utos_likeHabang.likeHabang)
            {
                ((utos_likeHabang.likeHabang) uh).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(uh instanceof utos_likeHabang.likeHabang)
            {
                ((utos_likeHabang.likeHabang) uh).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
        
        }
    }
    
    public static class utosMakeGawaHabang extends utos_dec_nodb
    {
        public utos_makeGawaHabang ugh; 
        
        public utosMakeGawaHabang(utos_makeGawaHabang ugh)
        {
            this.ugh = ugh;
        }
        
        public String toString()
        {
            return ugh.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(ugh instanceof utos_makeGawaHabang.makeGawaHabang)
            {
                ((utos_makeGawaHabang.makeGawaHabang) ugh).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(ugh instanceof utos_makeGawaHabang.makeGawaHabang)
            {
                ((utos_makeGawaHabang.makeGawaHabang) ugh).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(ugh instanceof utos_makeGawaHabang.makeGawaHabang)
            {
                ((utos_makeGawaHabang.makeGawaHabang) ugh).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
        
        }
    }
    
    public static class utosMakeUlit extends utos_dec_nodb
    {
        public utos_makeUlit uu; 
        
        public utosMakeUlit(utos_makeUlit uu)
        {
            this.uu = uu;
        }
        
        public String toString()
        {
            return uu.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(uu instanceof utos_makeUlit.makeUlit)
            {
                ((utos_makeUlit.makeUlit) uu).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(uu instanceof utos_makeUlit.makeUlit)
            {
                ((utos_makeUlit.makeUlit) uu).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(uu instanceof utos_makeUlit.makeUlit)
            {
                ((utos_makeUlit.makeUlit) uu).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
        
        }
    }
    
    public static class utosMakeArte extends utos_dec_nodb
    {
        public utos_makeArte ua; 
        
        public utosMakeArte(utos_makeArte ua)
        {
            this.ua = ua;
        }
        
        public String toString()
        {
            return ua.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(ua instanceof utos_makeArte.makeArte)
            {
                ((utos_makeArte.makeArte) ua).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(ua instanceof utos_makeArte.makeArte)
            {
                ((utos_makeArte.makeArte) ua).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(ua instanceof utos_makeArte.makeArte)
            {
                ((utos_makeArte.makeArte) ua).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            if(ua instanceof utos_makeArte.makeArte)
            {
                ((utos_makeArte.makeArte) ua).evaluate(sl);
            }
        }
    }
}