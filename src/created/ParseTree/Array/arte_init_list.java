package created.ParseTree.Array;

import java.util.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class arte_init_list implements created.iNode 
{
    public static class arteInitList extends arte_init_list
    {
        public arte_init_opt o; 
        
        public arteInitList()
        {
            this.o = null;
        }
        
        public arteInitList(arte_init_opt o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            if(o != null)
                return o.toString();
            else
                return "";
        }
        
        public int getCount()
        {
            if(o == null)
            {
                return 0;
            }
            else
            {
                if(o instanceof arte_init_opt.arteInitOpt)
                {
                    return ((arte_init_opt.arteInitOpt) o).getCount();
                }
                return 0;
            }
        }
        
        public ArrayList<sabi_sabi> getContents()
        {
            if(o == null)
            {
                return new ArrayList<>();
            }
            else
            {
                if(o instanceof arte_init_opt.arteInitOpt)
                {
                    return ((arte_init_opt.arteInitOpt) o).getContents();
                }
                return new ArrayList<>();
            }
        }
        
        public void setSymList(SymList sl)
        {
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                ((arte_init_opt.arteInitOpt) o).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl)
        {
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                return ((arte_init_opt.arteInitOpt) o).checkContext(sl);
            }
            
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                ((arte_init_opt.arteInitOpt) o).preInterpret(sl);
            }
        }
        
        public ArrayList<Object> evaluate(SymList sl)
        {
            ArrayList<Object> alo = new ArrayList<>();
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                alo = ((arte_init_opt.arteInitOpt) o).evaluate(sl);
            }
            return alo;
        }
    }
}