package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class OMG_section implements created.iNode 
{
    public static class OMGSection extends OMG_section
    {
        public OMG_list o;
        
        public OMGSection(OMG_list o)
        {
            this.o = o;
        }
        
        public OMGSection()
        {
            this.o = null;
        }
        
        public String toString()
        {
            return o.toString();
        }
    }
    
}