package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class arithmetic_2 implements created.iNode
{
    public static class arithmetic2 extends arithmetic_2
    {
        public String kind; // will contain either /, * or % 
        
        public arithmetic1(String type)
        {
            kind = type;
        }
        
        public String toString()
        {
            return kind;
        }
    }
}