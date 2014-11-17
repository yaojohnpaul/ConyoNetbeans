package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class sub_yaya_section implements created.iNode 
{
    public static class subYayaSection extends sub_yaya_section
    {
        public sub_yaya_list s;
        
        public subYayaSection()
        {
            this.s = null;
        }
        
        public subYayaSection(sub_yaya_list s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            if(s != null)
                return s.toString();
            else
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sub_yaya_list.subYayaList)
            {
                ((sub_yaya_list.subYayaList) s).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(s instanceof sub_yaya_list.subYayaList)
            {
                ((sub_yaya_list.subYayaList) s).c(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
        }
        
        public void evaluate(SymList sl)
        {
            if(s instanceof sub_yaya_list.subYayaList)
            {
                ((sub_yaya_list.subYayaList) s).evaluate(sl);
            }    
        }
    }
    
}