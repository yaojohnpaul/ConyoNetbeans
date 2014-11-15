package created.parseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_makeArte implements created.iNode  
{
    public static class makeArte extends utos_makeArte
    {
        public arte_dec a; 
        
        public makeArte(arte_dec a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
}