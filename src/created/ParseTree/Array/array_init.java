package created.ParseTree.Array;

import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class array_init implements created.iNode 
{
    public static class arrayInit extends array_init
    {
        public arte_init_list l; 
        
        public arrayInit(arte_init_list l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString();
        }
    }
}