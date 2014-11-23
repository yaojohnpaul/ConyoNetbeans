package created.ParseTree.Program;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class yaya_list implements created.iNode 
{
    public static class yayaList extends yaya_list
    {
        public yaya y;
        public yaya_list l;
        
        public yayaList(yaya y)
        {
            this.y = y;
            this.l = null;
        }
        
        public yayaList(yaya y, yaya_list l)
        {
            this.y = y;
            this.l = l;
        }
        
        public String toString()
        {
            if(l != null)
                return y.toString() + "\n" + l.toString();
            else
                return y.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(y instanceof yaya.addYaya)
            {
                ((yaya.addYaya) y).setSymList(sl);
            }
            
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(y instanceof yaya.addYaya)
            {
                ((yaya.addYaya) y).checkContext(sl);
            }
            
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(y instanceof yaya.addYaya)
            {
                ((yaya.addYaya) y).preInterpret(sl);
            }
            
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            if(y instanceof yaya.addYaya)
            {
                ((yaya.addYaya) y).evaluate(sl);
            }
            
            if(l instanceof yaya_list.yayaList)
            {
                ((yaya_list.yayaList) l).evaluate(sl);
            }
        }
    }
    
}