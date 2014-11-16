package created.ParseTree.Array;

import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class arte_init_list implements created.iNode 
{
    public static class arteInitList extends arte_init_list
    {
        public arte_init_opt o; 
        
        public arteInitList()
        {
            this.o = null;
        }
        
        public arteInitList(arte_init_opt o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            if(o != null)
                return o.toString();
            else
                return "";
        }
    }
}