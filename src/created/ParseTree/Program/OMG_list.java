package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class OMG_list implements created.iNode 
{
    public static class OMGList extends OMG_list
    {
        public OMG_dec o; 
        public OMG_list l;
        
        public OMGList()
        {
            this.o = null;
            this.l = null;
        }
        
        public OMGList(OMG_dec o)
        {
            this.o = o;
            this.l = null;
        }
        
        public OMGList(OMG_dec o, OMG_list l)
        {
            this.o = o;
            this.l = l;
        }
        
        public String toString()
        {
            return o.toString() + "\n" + l.toString();
        }
    }
}