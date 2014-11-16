package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_makeBasa implements created.iNode  
{
    public static class makeBasa extends utos_makeBasa
    {
        public data_type d; 
        
        public makeBasa(data_type d)
        {
            this.d = d;
        }
        
        public String toString()
        {
            return "makeBasa(" + d.toString() + "";
        }
    }
}