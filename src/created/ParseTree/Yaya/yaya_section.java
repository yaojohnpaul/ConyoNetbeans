package created.parseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;

public abstract class yaya_section implements created.iNode  
{
    public static class yayaSection extends yaya_section
    {
        public yaya_list yl;
        
        public yayaSection()
        {
            this.yl = null;   
        }
        
        public yayaSection(yaya_list yl)
        {
            this.yl = yl;
        }
        
        public String toString()
        {
            return yl.toString();
        }
    }
    
}