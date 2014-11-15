package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

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
            return s.toString() + "\n" + l.toString();
        }
    }
    
}