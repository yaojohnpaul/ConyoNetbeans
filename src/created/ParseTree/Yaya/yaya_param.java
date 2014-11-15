package created.parseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;

public abstract class yaya_param implements created.iNode  
{
    public static class yayaParam extends yaya_param
    {
        public data_type dt;
        public String id;
        
        public yayaParam(data_type dt, String id)
        {
            this.dt = dt;
            this.id = id;
        }
        
        public String toString()
        {
            return dt.toString() + " " + id;
        }
    }
    
}