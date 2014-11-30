package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_dec extends created.iNode 
{
    public utos_dec(int ln)
    {
        super(ln);
    }
    
    public static class utosDecDB extends utos_dec
    {
        public utos_dec_db ud;
        
        public utosDecDB(int ln, utos_dec_db ud)
        {
            super(ln);
            this.ud = ud;
        }
        
        public String toString()
        {
            return ud.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(ud instanceof utos_dec_db.utosMakeKuha)
            {
                ((utos_dec_db.utosMakeKuha) ud).setSymList(sl);
            }
            else if(ud instanceof utos_dec_db.utosMakeSulat)
            {
                ((utos_dec_db.utosMakeSulat) ud).setSymList(sl);
            }
            else if(ud instanceof utos_dec_db.breakup)
            {
                // ((utos_dec_db.breakup) ud).setSymList(sl);
            }
            else if(ud instanceof utos_dec_db.makeup)
            {
                // ((utos_dec_db.makeup) ud).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(ud instanceof utos_dec_db.utosMakeKuha)
            {
                ((utos_dec_db.utosMakeKuha) ud).checkContext(sl);
            }
            else if(ud instanceof utos_dec_db.utosMakeSulat)
            {
                ((utos_dec_db.utosMakeSulat) ud).checkContext(sl);
            }
            else if(ud instanceof utos_dec_db.breakup)
            {
                // ((utos_dec_db.breakup) ud).checkContext(sl);
            }
            else if(ud instanceof utos_dec_db.makeup)
            {
                // ((utos_dec_db.makeup) ud).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(ud instanceof utos_dec_db.utosMakeKuha)
            {
                ((utos_dec_db.utosMakeKuha) ud).preInterpret(sl);
            }
            else if(ud instanceof utos_dec_db.utosMakeSulat)
            {
                ((utos_dec_db.utosMakeSulat) ud).preInterpret(sl);
            }
            else if(ud instanceof utos_dec_db.breakup)
            {
                // ((utos_dec_db.breakup) ud).preInterpret(sl);
            }
            else if(ud instanceof utos_dec_db.makeup)
            {
                // ((utos_dec_db.makeup) ud).preInterpret(sl);
            }
        }
        
        public int evaluate(SymList sl, int call, int inAFunction)
        {
            if(ud instanceof utos_dec_db.utosMakeKuha)
            {
                ((utos_dec_db.utosMakeKuha) ud).evaluate(sl, call, inAFunction);
            }
            else if(ud instanceof utos_dec_db.utosMakeSulat)
            {
                ((utos_dec_db.utosMakeSulat) ud).evaluate(sl, call, inAFunction);
            }
            else if(ud instanceof utos_dec_db.breakup)
            {
                return ((utos_dec_db.breakup) ud).evaluate(sl, call, inAFunction);
            }
            else if(ud instanceof utos_dec_db.makeup)
            {
                return ((utos_dec_db.makeup) ud).evaluate(sl, call, inAFunction);
            }
            
            return 0;
        }
    }
    
    public static class utosDecVal extends utos_dec
    {
        public utos_dec_val uv;
        
        public utosDecVal(int ln, utos_dec_val uv)
        {
            super(ln);
            this.uv = uv;
        }
        
        public String toString()
        {
            return uv.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(uv instanceof utos_dec_val.utosMakeTawag)
            {
                ((utos_dec_val.utosMakeTawag) uv).setSymList(sl);
            }
            else if(uv instanceof utos_dec_val.utosMakeBasa)
            {
                ((utos_dec_val.utosMakeBasa) uv).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(uv instanceof utos_dec_val.utosMakeTawag)
            {
                ((utos_dec_val.utosMakeTawag) uv).checkContext(sl);
            }
            else if(uv instanceof utos_dec_val.utosMakeBasa)
            {
                ((utos_dec_val.utosMakeBasa) uv).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(uv instanceof utos_dec_val.utosMakeTawag)
            {
                ((utos_dec_val.utosMakeTawag) uv).preInterpret(sl);
            }
            else if(uv instanceof utos_dec_val.utosMakeBasa)
            {
                ((utos_dec_val.utosMakeBasa) uv).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(uv instanceof utos_dec_val.utosMakeTawag)
            {
                ((utos_dec_val.utosMakeTawag) uv).evaluate(sl, call, inAFunction);
            }
            else if(uv instanceof utos_dec_val.utosMakeBasa)
            {
                ((utos_dec_val.utosMakeBasa) uv).evaluate(sl, call, inAFunction);
            }
        }
    }
    
    public static class utosDecNoDB extends utos_dec
    {
        public utos_dec_nodb un;
        
        public utosDecNoDB(int ln, utos_dec_nodb un)
        {
            super(ln);
            this.un = un;
        }
        
        public String toString()
        {
            return un.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(un instanceof utos_dec_nodb.utosLikeKapag)
            {
                ((utos_dec_nodb.utosLikeKapag) un).setSymList(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakePalit)
            {
                ((utos_dec_nodb.utosMakePalit) un).setSymList(sl);
            }
            else if(un instanceof utos_dec_nodb.utosLikeHabang)
            {
                ((utos_dec_nodb.utosLikeHabang) un).setSymList(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakeGawaHabang)
            {
                ((utos_dec_nodb.utosMakeGawaHabang) un).setSymList(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakeArte)
            {
                ((utos_dec_nodb.utosMakeArte) un).setSymList(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakeUlit)
            {
                ((utos_dec_nodb.utosMakeUlit) un).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(un instanceof utos_dec_nodb.utosLikeKapag)
            {
                ((utos_dec_nodb.utosLikeKapag) un).checkContext(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakePalit)
            {
                ((utos_dec_nodb.utosMakePalit) un).checkContext(sl);
            }
            else if(un instanceof utos_dec_nodb.utosLikeHabang)
            {
                ((utos_dec_nodb.utosLikeHabang) un).checkContext(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakeGawaHabang)
            {
                ((utos_dec_nodb.utosMakeGawaHabang) un).checkContext(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakeArte)
            {
                ((utos_dec_nodb.utosMakeArte) un).checkContext(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakeUlit)
            {
                ((utos_dec_nodb.utosMakeUlit) un).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(un instanceof utos_dec_nodb.utosLikeKapag)
            {
                ((utos_dec_nodb.utosLikeKapag) un).preInterpret(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakePalit)
            {
                ((utos_dec_nodb.utosMakePalit) un).preInterpret(sl);
            }
            else if(un instanceof utos_dec_nodb.utosLikeHabang)
            {
                ((utos_dec_nodb.utosLikeHabang) un).preInterpret(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakeGawaHabang)
            {
                ((utos_dec_nodb.utosMakeGawaHabang) un).preInterpret(sl);
            }
            else if(un instanceof utos_dec_nodb.utosMakeArte)
            {
                ((utos_dec_nodb.utosMakeArte) un).preInterpret(sl);
            }
        }
        
        public int evaluate(SymList sl, int call, int inAFunction)
        {
            if(un instanceof utos_dec_nodb.utosLikeKapag)
            {
                return ((utos_dec_nodb.utosLikeKapag) un).evaluate(sl, call, inAFunction);
            }
            else if(un instanceof utos_dec_nodb.utosMakePalit)
            {
                ((utos_dec_nodb.utosMakePalit) un).evaluate(sl, call, inAFunction);
            }
            else if(un instanceof utos_dec_nodb.utosLikeHabang)
            {
                ((utos_dec_nodb.utosLikeHabang) un).evaluate(sl, call, inAFunction);
            }
            else if(un instanceof utos_dec_nodb.utosMakeGawaHabang)
            {
                ((utos_dec_nodb.utosMakeGawaHabang) un).evaluate(sl, call, inAFunction);
            }
            else if(un instanceof utos_dec_nodb.utosMakeArte)
            {
                ((utos_dec_nodb.utosMakeArte) un).evaluate(sl, call, inAFunction);
            }
            else if(un instanceof utos_dec_nodb.utosMakeUlit)
            {
                ((utos_dec_nodb.utosMakeUlit) un).evaluate(sl, call, inAFunction);
            }
            
            return 0;
        }
    }
    
    public static class utosDecSabiSabi extends utos_dec
    {
        public utos_sabisabi us;
        
        public utosDecSabiSabi(int ln, utos_sabisabi us)
        {
            super(ln);
            this.us = us;
        }
        
        public String toString()
        {
            return us.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(us instanceof utos_sabisabi.utosSabiSabiFront)
            {
                ((utos_sabisabi.utosSabiSabiFront) us).setSymList(sl);
            }
            else if(us instanceof utos_sabisabi.utosSabiSabiBack)
            {
                ((utos_sabisabi.utosSabiSabiBack) us).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(us instanceof utos_sabisabi.utosSabiSabiFront)
            {
                ((utos_sabisabi.utosSabiSabiFront) us).checkContext(sl);
            }
            else if(us instanceof utos_sabisabi.utosSabiSabiBack)
            {
                ((utos_sabisabi.utosSabiSabiBack) us).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(us instanceof utos_sabisabi.utosSabiSabiFront)
            {
                ((utos_sabisabi.utosSabiSabiFront) us).preInterpret(sl);
            }
            else if(us instanceof utos_sabisabi.utosSabiSabiBack)
            {
                ((utos_sabisabi.utosSabiSabiBack) us).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(us instanceof utos_sabisabi.utosSabiSabiFront)
            {
                ((utos_sabisabi.utosSabiSabiFront) us).evaluate(sl, call, inAFunction);
            }
            else if(us instanceof utos_sabisabi.utosSabiSabiBack)
            {
                ((utos_sabisabi.utosSabiSabiBack) us).evaluate(sl, call, inAFunction);
            }
        }
    }
}