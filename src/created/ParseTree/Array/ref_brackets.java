package created.ParseTree.Array;

import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class ref_brackets implements created.iNode 
{
    public static class refBrackets extends ref_brackets
    {
        public sabi_sabi s; 
        
        public refBrackets(sabi_sabi s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return s.toString();
        }
    }
}