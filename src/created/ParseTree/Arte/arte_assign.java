package created.ParseTree.Arte;

import created.ParseTree.Array.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
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
            //commented out because arte_init should only be assigned during
            //evaluation since values can change for a variable unlike
            //constants wherein the value does not change thus allowing 
            //the setting of values during the setSymList stage
            /*if(i != null)
            {
                SymVar temp = (SymVar) sl.getSymbol(id);
                sl.editSymbol(id, new SymVar(id, temp.dataType(), i));
            }*/
        }
        
        public String checkContext(SymList sl)
        {
            if(i == null){
                return "not initialized";
            }
            if(i instanceof arte_init.arrayInit)
            {
                return ((arte_init.arrayInit) i).checkContext(sl);
            }
            else if(i instanceof arte_init.sabiInit)
            {
                return ((arte_init.sabiInit) i).checkContext(sl);
            }
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(i instanceof arte_init.arrayInit)
            {
                ((arte_init.arrayInit) i).preInterpret(sl);
            }
            else if(i instanceof arte_init.sabiInit)
            {
                ((arte_init.sabiInit) i).preInterpret(sl);
            }
        }
    }
}