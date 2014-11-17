package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

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
        
        private SymList sl;
        
        public void setSymList(SymList sl)
        {   
            Boolean avail = sl.addToList(id, new SymClass(id, sl));
            if(!avail)
            {
                ErrorReport.error("Duplicate class defined!: " + id);
            }
            
            this.sl = new SymList();
            if(body instanceof sy_body.SubYayaBodyList)
            {
                ((sy_body.SubYayaBodyList) body).setSymList(this.sl);   
            }
        }
        
        public void checkContext(SymList sl)
        { 
            if(body instanceof sy_body.SubYayaBodyList)
            {
                ((sy_body.SubYayaBodyList) body).checkContext(this.sl);   
            }
        }
        
    }
    
}

//MAKE_UTUSAN IDENTIFIER:id sy_body:body {: RESULT = new SubYaya(id, body); :};