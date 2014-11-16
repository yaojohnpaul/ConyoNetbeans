package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class yaya_list implements created.iNode 
{
    public static class yayaList extends yaya_list
    {
        public yaya y;
        public yaya_list l;
        
        public yayaList(yaya y)
        {
            this.y = y;
            this.l = null;
        }
        
        public yayaList(yaya y, yaya_list l)
        {
            this.y = y;
            this.l = l;
        }
        
        public String toString()
        {
            if(l != null)
                return y.toString() + "\n" + l.toString();
            else
                return y.toString();
        }
    }
    
}