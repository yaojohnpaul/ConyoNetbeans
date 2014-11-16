package created.ParseTree.Arte;

import created.ParseTree.Array.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class arte_assign implements created.iNode 
{
    public static class arteAssign extends arte_assign
    {
        public arte_init i; 
        
        public arteAssign()
        {
            this.i = null;
        }
        
        public arteAssign(arte_init i)
        {
            this.i = i;
        }
        
        public String toString()
        {
            if(i != null)
                return i.toString();
            else
                return "";
        }
    }
}