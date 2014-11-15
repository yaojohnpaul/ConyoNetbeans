package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class super_yaya implements created.iNode 
{
    public static class superYaya extends super_yaya
    {
        public utos_block u;
        
        public superYaya()
        {
            this.u = u;
        }
        
        public String toString()
        {
            return "superYaya\n" + u.toString();
        }
    }
    
}