package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class comparison implements created.iNode
{
    public static class compare extends comparison
    {
        public String kind; // will contain either <, <=, >= or >
        
        public compare(String type)
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
    }
}
