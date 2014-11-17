package created.ParseTree.Arte;

import created.ParseTree.Array.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class arte_assign implements created.iNode 
{
    public static class arteAssign extends arte_assign
    {
        public arte_init i; 
        
        public arteAssign()
        {
            this.i = null;
        }
        
        public arteAssign(arte_init i)
        {
            this.i = i;
        }
        
        public String toString()
        {
            if(i != null)
                return i.toString();
            else
                return "";
        }
        
        public void setSymList(String id, SymList sl)
        {
            SymVar temp = (SymVar) sl.getSymbol(id);
            sl.editSymbol(id, new SymVar(id, temp.dataType(), i));
        }
        
        public String checkContext(SymList sl)
        {
            if(i instanceof arte_init.arrayInit)
            {
                return ((arte_init.arrayInit) i).checkContext(sl);
            }
            else if(i instanceof arte_init.syInit)
            {
                return ((arte_init.syInit) i).checkContext(sl);
            }
            else if(i instanceof arte_init.sabiInit)
            {
                return ((arte_init.sabiInit) i).checkContext(sl);
            }
            return ;
        }
        
        public void preInterpret(SymList sl)
        {
            if(i instanceof arte_init.arrayInit)
            {
                ((arte_init.arrayInit) i).preInterpret(sl);
            }
            else if(i instanceof arte_init.syInit)
            {
                ((arte_init.syInit) i).preInterpret(sl);
            }
            else if(i instanceof arte_init.sabiInit)
            {
                ((arte_init.sabiInit) i).preInterpret(sl);
            }
        }
    }
}