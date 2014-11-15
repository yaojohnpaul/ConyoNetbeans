package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class sub_yaya implements created.iNode 
{
    public static class SubYaya extends sub_yaya
    {
        public String id;
        public sy_body body;
        
        public SubYaya(String id, sy_body body)
        {
            this.id = id;
            this.body = body;
        }
        
        public String toString()
        {
            return "makeUtusan" + id.toString() + body.toString();
        }
    }
    
}

//MAKE_UTUSAN IDENTIFIER:id sy_body:body {: RESULT = new SubYaya(id, body); :};