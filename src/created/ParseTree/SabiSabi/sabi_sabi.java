package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class sabi_sabi implements created.iNode
{
    public static class SabiSabi extends sabi_sabi
    {
        public ss_OR o;
        
        public SabiSabi(ss_OR o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            return o.toString();
        }
    }
}


//sabi_sabi ::= ss_OR:o {: RESULT = new SabiSabi(o); :};