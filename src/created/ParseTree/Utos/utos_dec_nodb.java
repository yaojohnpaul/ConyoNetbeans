package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_dec_nodb extends created.iNode  
{
    public utos_dec_nodb(int ln)
    {
        super(ln);
    }
    
    public static class utosLikeKapag extends utos_dec_nodb
    {
        public utos_likeKapag uk; 
        
        public utosLikeKapag(int ln, utos_likeKapag uk)
        {
            super(ln);
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
        
        public int evaluate(SymList sl, int call, int inAFunction)
        {
            if(uk instanceof utos_likeKapag.likeKapag)
            {
                return ((utos_likeKapag.likeKapag) uk).evaluate(sl, call, inAFunction);
            }
            
            return 0;
        }
    }
    
    public static class utosMakePalit extends utos_dec_nodb
    {
        public utos_makePalit up; 
        
        public utosMakePalit(int ln, utos_makePalit up)
        {
            super(ln);
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
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(up instanceof utos_makePalit.makePalit)
            {
                ((utos_makePalit.makePalit) up).evaluate(sl, call, inAFunction);
            }
        }
    }
    
    public static class utosLikeHabang extends utos_dec_nodb
    {
        public utos_likeHabang uh; 
        
        public utosLikeHabang(int ln, utos_likeHabang uh)
        {
            super(ln);
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
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(uh instanceof utos_likeHabang.likeHabang)
            {
                ((utos_likeHabang.likeHabang) uh).evaluate(sl, call, inAFunction);
            }
        }
    }
    
    public static class utosMakeGawaHabang extends utos_dec_nodb
    {
        public utos_makeGawaHabang ugh; 
        
        public utosMakeGawaHabang(int ln, utos_makeGawaHabang ugh)
        {
            super(ln);
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
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(ugh instanceof utos_makeGawaHabang.makeGawaHabang)
            {
                ((utos_makeGawaHabang.makeGawaHabang) ugh).evaluate(sl, call, inAFunction);
            }
        }
    }
    
    public static class utosMakeUlit extends utos_dec_nodb
    {
        public utos_makeUlit uu; 
        
        public utosMakeUlit(int ln, utos_makeUlit uu)
        {
            super(ln);
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
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(uu instanceof utos_makeUlit.makeUlit)
            {
                ((utos_makeUlit.makeUlit) uu).evaluate(sl, call, inAFunction);
            }
        }
    }
    
    public static class utosMakeArte extends utos_dec_nodb
    {
        public utos_makeArte ua; 
        
        public utosMakeArte(int ln, utos_makeArte ua)
        {
            super(ln);
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
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(ua instanceof utos_makeArte.makeArte)
            {
                ((utos_makeArte.makeArte) ua).evaluate(sl, call, inAFunction);
            }
        }
    }
}