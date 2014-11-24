package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class equality extends created.iNode
{
    public equality(int ln)
    {
        super(ln);
    }
    
    public static class equal extends equality
    {
        public String kind; // will contain either != or == 
        
        public equal(int ln, String type)
        {
            super(ln);
            kind = type;
        }
        
        public String toString()
        {
            return kind;
        }
        
        public void setSymList(SymList sl)
        {
            
        }
        
        public String checkContext(SymList sl) 
        {
            return kind;
        }
        
        public String evaluate()
        {
            return kind;
        }
    }
}
