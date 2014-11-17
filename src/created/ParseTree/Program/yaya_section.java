package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

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
            if(l != null)
                return l.toString();
            else
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).setSymList(sl);
            }
        }
            
        public void checkContext(SymList sl)
        {
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
        }
        
        public void evaluate(SymList sl)
        {
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).evaluate(sl);
            }
        }
    }
    
}