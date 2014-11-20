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
        
        public void setSymList(SymList sl)
        {
            if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).setSymList(sl);
            }
            
            if(l instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) l).setSymList(sl);
            } 
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            String ret = "";
            
            if(vn instanceof valid_name.identifier)
            {
                ret = ((valid_name.identifier) vn).checkContext(sl);

                SymEntry ste = sl.getSymbol (((valid_name.identifier) vn).toString()); 
            
                if(ste.symType() != 103)
                {
                    ErrorReport.error("Not a function used as a function!: " + ((valid_name.identifier) vn).toString());
                    return "";
                }
                
                return ret;
                
            }
            
            if(l instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) l).checkContext(sl);
            }
            
            return ret;
        }
        
        public void preInterpret(SymList sl)
        {
            if(vn instanceof valid_name.identifier)
            {
                ((valid_name.identifier) vn).preInterpret(sl);
            }
            
            if(l instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) l).preInterpret(sl);
            } 
        }
    }
}