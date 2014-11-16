package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

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
    }
    
    public static class utosDecSabiSabi extends utos_dec
    {
        public utos_sabisabi un;
        
        public utosDecSabiSabi(utos_sabisabi un)
        {
            this.un = un;
        }
        
        public String toString()
        {
            return un.toString();
        }
    }
}