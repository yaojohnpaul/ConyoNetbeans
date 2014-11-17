package created.ParseTree.Arte;

import created.ParseTree.Array.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
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
        
        public void setSymList()
        {
            if(a instanceof array_init.arrayInit)
            {
                ((array_init.arrayInit) a).setSymList(sl);
            }
        }
        
        public String checkContext()
        {
            if(a instanceof array_init.arrayInit)
            {
                return ((array_init.arrayInit) a).checkContext(sl);
            }
            return null;
        }
        
        public void preInterpret()
        {
            if(a instanceof array_init.arrayInit)
            {
                ((array_init.arrayInit) a).preInterpret(sl);
            }
        }
    }
    
    public static class syInit extends arte_init
    {
        public sy_init sy; 
        
        public syInit(sy_init sy)
        {
            this.sy = sy;
        }
        
        public String toString()
        {
            return sy.toString();
        }
        
        public void setSymList()
        {
            if(sy instanceof sy_init.syInit)
            {
                ((sy_init.syInit) sy).setSymList(sl);
            }
        }
        
        public String checkContext()
        {
            if(sy instanceof sy_init.syInit)
            {
                return ((sy_init.syInit) sy).checkContext(sl);
            }
            return null;
        }
        
        public void preInterpret()
        {
            if(sy instanceof sy_init.syInit)
            {
                ((sy_init.syInit) sy).preInterpret(sl);
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
        
        public void setSymList()
        {
            if(s instanceof sabi_sabi.sabiSabi)
            {
                ((sabi_sabi.sabiSabi) s).setSymList(sl);
            }
        }
        
        public String checkContext()
        {
            if(s instanceof sabi_sabi.sabiSabi)
            {
                return ((sabi_sabi.sabiSabi) s).checkContext(sl);
            }
            return null;
        }
        
        public void preInterpret()
        {
            if(s instanceof sabi_sabi.sabiSabi)
            {
                ((sabi_sabi.sabiSabi) s).preInterpret(sl);
            }
        }
    }
}