package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class yaya_section implements created.iNode 
{
    public static class yayaSection extends yaya_section
    {
        public yaya_list l;
        
        public yayaSection()
        {
            this.l = null;
        }
        
        public yayaSection(yaya_list l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString();
        }
    }
    
}