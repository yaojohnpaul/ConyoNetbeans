package created.parseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

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
    }
}