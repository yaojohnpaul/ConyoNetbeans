package created.ParseTree.Array;

import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class arte_init_opt implements created.iNode 
{
    public static class arteInitOpt extends arte_init_opt
    {
        public arte_init i; 
        public arte_init_opt o;
        
        public arteInitOpt(arte_init i)
        {
            this.i = i;
            this.o = null;
        }
        
        public arteInitOpt(arte_init i, arte_init_opt o)
        {
            this.i = i;
            this.o = o;
        }
        
        public String toString()
        {
            if(o != null)
                return i.toString() + "\n" + o.toString();
            else
                return i.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(i instanceof arte_init.arrayInit)
            {
                ((arte_init.arrayInit) i).setSymList(sl);
            }
            else if(i instanceof arte_init.syInit)
            {
                ((arte_init.syInit) i).setSymList(sl);
            }
            else if(i instanceof arte_init.sabiInit)
            {
                ((arte_init.sabiInit) i).setSymList(sl);
            }
            
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                ((arte_init_opt.arteInitOpt) o).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl)
        {
            if(i instanceof arte_init.arrayInit)
            {
                ((arte_init.arrayInit) i).checkContext(sl);
            }
            else if(i instanceof arte_init.syInit)
            {
                ((arte_init.syInit) i).checkContext(sl);
            }
            else if(i instanceof arte_init.sabiInit)
            {
                ((arte_init.sabiInit) i).checkContext(sl);
            }
            
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                ((arte_init_opt.arteInitOpt) o).checkContext(sl);
            }
            
            return "";
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
            
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                ((arte_init_opt.arteInitOpt) o).preInterpret(sl);
            }
        }
    }
}