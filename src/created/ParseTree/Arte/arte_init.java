package created.ParseTree.Arte;

import created.ParseTree.Array.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class arte_init implements created.iNode 
{
    public static class arrayInit extends arte_init
    {
        public array_init a; 
        
        public arrayInit(array_init a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof array_init.arrayInit)
            {
                ((array_init.arrayInit) a).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl)
        {
            if(a instanceof array_init.arrayInit)
            {
                return ((array_init.arrayInit) a).checkContext(sl);
            }
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(a instanceof array_init.arrayInit)
            {
                ((array_init.arrayInit) a).preInterpret(sl);
            }
        }
    }
    
    public static class sabiInit extends arte_init
    {
        public sabi_sabi s; 
        
        public sabiInit(sabi_sabi s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return s.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                return ((sabi_sabi.SabiSabi) s).checkContext(sl);
            }
            return "";
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).preInterpret(sl);
            }
        }
    }
}