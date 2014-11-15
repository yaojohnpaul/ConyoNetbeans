package created.ParseTree.Arte;

import created.ParseTree.Array.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class arte_dec implements created.iNode 
{
    public static class arteDec extends arte_dec
    {
        public data_type dt; 
        public String id;
        public arte_assign a;
        
        public arteDec(data_type dt, String id, arte_assign a)
        {
            this.dt = dt;
            this.id = id;
            this.a = a;
        }
        
        public String toString()
        {
            return dt.toString() + " " + id.toString() + " " + a.toString();
        }
    }
}