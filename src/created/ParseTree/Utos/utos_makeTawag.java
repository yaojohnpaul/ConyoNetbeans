package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

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
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(vn instanceof valid_name.validName)
            {
                //((valid_name.validName) vn).setSymList(sl);
                
            }
            if(vn instanceof valid_name.identifier)
            {
                //((valid_name.identifier) vn).setSymList(sl);
                SymEntry ste = sl.getSymbol(vn.id); 
            
                if(ste.symType() != 103)
                {
                    ErrorReport.error("Not a function used as a function!: " + id);
                    return "";
                }
            }
            return vn.checkContext();
        }
    }
}