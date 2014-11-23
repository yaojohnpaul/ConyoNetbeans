package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class arithmetic_2 implements created.iNode
{
    public static class arithmetic2 extends arithmetic_2
    {
        public String kind; // will contain either /, * or % 
        
        public arithmetic2(String type)
        {
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