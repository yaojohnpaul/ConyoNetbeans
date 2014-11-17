package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class sub_yaya_list implements created.iNode 
{
    public static class subYayaList extends sub_yaya_list
    {
        public sub_yaya s;
        public sub_yaya_list l;
        
        public subYayaList(sub_yaya s)
        {
            this.s = s;
            this.l = null;
        }
        
        public subYayaList(sub_yaya s, sub_yaya_list l)
        {
            this.s = s;
            this.l = l;
        }
        
        public String toString()
        {
            if(l != null)
                return s.toString() + "\n" + l.toString();
            else
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sub_yaya.SubYaya)
            {
                ((sub_yaya.SubYaya) s).setSymList(sl);
            }
            
            if(l instanceof sub_yaya_list.subYayaList)
            {
                ((sub_yaya_list.subYayaList) l).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(s instanceof sub_yaya.SubYaya)
            {
                ((sub_yaya.SubYaya) s).c(sl);
            }
            
            if(l instanceof sub_yaya_list.subYayaList)
            {
                ((sub_yaya_list.subYayaList) l).setSymList(sl);
            }
        }
    }
    
}