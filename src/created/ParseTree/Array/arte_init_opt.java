package created.ParseTree.Array;

import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class arte_init_opt implements created.iNode 
{
    public static class arteInitOpt extends arte_init_opt
    {
        public arte_init i; 
        public arte_init_opt o;
        
        public arteInitOpt(arte_init i)
        {
            this.i = i;
            this.o = null;
        }
        
        public arteInitOpt(arte_init i, arte_init_opt o)
        {
            this.i = i;
            this.o = o;
        }
        
        public String toString()
        {
            return i.toString() + " " + o.toString();
        }
    }
}