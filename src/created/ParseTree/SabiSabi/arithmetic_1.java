package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class arithmetic_1 extends created.iNode
{
    public arithmetic_1(int ln)
    {
        super(ln);
    }
    
    public static class arithmetic1 extends arithmetic_1
    {
        public String kind; // will contain either + or - 
        
        public arithmetic1(int ln, String type)
        {
            super(ln);
            kind = type;
        }
        
        public String toString()
        {
            return kind;
        }
        
        public String evaluate()
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
    }
    
}

