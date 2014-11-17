package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class sy_cont_list implements created.iNode 
{
    public static class SubYayaContList extends sy_cont_list
    {
        public sy_cont c;
        public sy_cont_list l;
        
        public SubYayaContList(sy_cont c, sy_cont_list l)
        {
            this.c = c;
            this.l = l;
        }
        
         public SubYayaContList(sy_cont c)
        {
            this.c = c;
            this.l = null;
        }
        
        public String toString()
        {
            if(l != null)
                return c.toString() + l.toString();
            else
                return c.toString();
            
        }
        
        public void setSymList(SymList sl)
        {
            if(c instanceof sy_cont.SubYayaContArte)
            {
                ((sy_cont.SubYayaContArte) c).setSymList(sl);
            }
            else if(c instanceof sy_cont.SubYayaContYaya)
            {
                ((sy_cont.SubYayaContYaya) c).setSymList(sl);
            }
            else if(c instanceof sy_cont.SubYayaContConstructor)
            {
                ((sy_cont.SubYayaContConstructor) c).setSymList(sl);
            }
            
            //list
            if(l instanceof sy_cont_list.SubYayaContList)
            {
                ((sy_cont_list.SubYayaContList) l).setSymList(var, func);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(c instanceof sy_cont.SubYayaContArte)
            {
                ((sy_cont.SubYayaContArte) c).checkContext(sl);
            }
            else if(c instanceof sy_cont.SubYayaContYaya)
            {
                ((sy_cont.SubYayaContYaya) c).checkContext(sl);
            }
            else if(c instanceof sy_cont.SubYayaContConstructor)
            {
                ((sy_cont.SubYayaContConstructor) c).checkContext(sl);
            }
            
            //list
            if(l instanceof sy_cont_list.SubYayaContList)
            {
                ((sy_cont_list.SubYayaContList) l).checkContext(var, func);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(c instanceof sy_cont.SubYayaContArte)
            {
                ((sy_cont.SubYayaContArte) c).preInterpret(sl);
            }
            else if(c instanceof sy_cont.SubYayaContYaya)
            {
                ((sy_cont.SubYayaContYaya) c).preInterpret(sl);
            }
            else if(c instanceof sy_cont.SubYayaContConstructor)
            {
                ((sy_cont.SubYayaContConstructor) c).preInterpret(sl);
            }
            
            //list
            if(l instanceof sy_cont_list.SubYayaContList)
            {
                ((sy_cont_list.SubYayaContList) l).preInterpret(var, func);
            }
        }
    }
    
}
