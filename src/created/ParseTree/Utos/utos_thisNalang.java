package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_thisNalang implements created.iNode  
{
    public static class thisNalang extends utos_thisNalang
    {
        public utos_block b; 
        
        public thisNalang()
        {
            this.b = null;
        }
        
        public thisNalang(utos_block b)
        {
            this.b = b;
        }
        
        public String toString()
        {
            if(b != null)
                return "thisNalang\n" + b.toString();
            else
                return "";
        }
    }
    
    public static class thisNalangKapag extends utos_thisNalang
    {
        public sabi_sabi s;
        public utos_block b;
        public utos_thisNalang t;
        
        public thisNalangKapag(sabi_sabi s, utos_block b, utos_thisNalang t)
        {
            this.s = s;
            this.b = b;
            this.t = t;
        }
        
        public String toString()
        {
            return "thisNalangKapag(" + s.toString() + ")\n" + b.toString() + "\n" + t.toString();
        }
    }
}