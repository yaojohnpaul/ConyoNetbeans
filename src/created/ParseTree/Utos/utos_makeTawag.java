package created.parseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_makeTawag implements created.iNode  
{
    public static class makeTawag extends utos_makeTawag
    {
        public valid_name vn; 
        public arte_init_list l;
        
        public makeTawag(valid_name vn, arte_init_list l)
        {
            this.vn = vn;
            this.l = l;
        }
        
        public String toString()
        {
            return "makeTawag " + vn.toString() + " (" + l.toString() + "";
        }
    }
}