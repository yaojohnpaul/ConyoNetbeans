package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_dec implements created.iNode 
{
    public static class utosDecDB extends utos_dec
    {
        public utos_dec_db ud;
        
        public utosDecDB(utos_dec_db ud)
        {
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
    }
    
    public static class utosDecVal extends utos_dec
    {
        public utos_dec_val uv;
        
        public utosDecVal(utos_dec_val uv)
        {
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
    }
    
    public static class utosDecNoDB extends utos_dec
    {
        public utos_dec_nodb un;
        
        public utosDecNoDB(utos_dec_nodb un)
        {
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
    }
    
    public static class utosDecSabiSabi extends utos_dec
    {
        public utos_sabisabi us;
        
        public utosDecSabiSabi(utos_sabisabi us)
        {
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
    }
}