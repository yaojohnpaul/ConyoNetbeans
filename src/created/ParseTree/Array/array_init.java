package created.ParseTree.Array;

import java.util.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class array_init implements created.iNode 
{
    public static class arrayInit extends array_init
    {
        public arte_init_list l; 
        
        public arrayInit(arte_init_list l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(l instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) l).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl)
        {
            if(l instanceof arte_init_list.arteInitList)
            {
                return ((arte_init_list.arteInitList) l).checkContext(sl);
            }
            
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(l instanceof arte_init_list.arteInitList)
            {
                ((arte_init_list.arteInitList) l).preInterpret(sl);
            } 
        }
        
        public ArrayList<Object> evaluate(SymList sl)
        {
            ArrayList<Object> alo = new ArrayList<>();
            if(l instanceof arte_init_list.arteInitList)
            {
                alo = ((arte_init_list.arteInitList) l).evaluate(sl);
            }
            return alo;
        }
    }
}