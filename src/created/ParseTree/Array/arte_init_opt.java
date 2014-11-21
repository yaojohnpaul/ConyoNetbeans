package created.ParseTree.Array;

import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class arte_init_opt implements created.iNode 
{
    public static class arteInitOpt extends arte_init_opt
    {
        public sabi_sabi s; 
        public arte_init_opt o;
        
        public arteInitOpt(sabi_sabi s)
        {
            this.s = s;
            this.o = null;
        }
        
        public arteInitOpt(sabi_sabi s, arte_init_opt o)
        {
            this.s = s;
            this.o = o;
        }
        
        public String toString()
        {
            if(o != null)
                return s.toString() + "\n" + o.toString();
            else
                return s.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
            
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                ((arte_init_opt.arteInitOpt) o).setSymList(sl);
            }
        }
        
        public String checkContext(SymList sl)
        {
            String temp1 = "";
            String temp2 = "";
            if(o != null){
                if(s instanceof sabi_sabi.SabiSabi)
                {
                    temp1 = ((sabi_sabi.SabiSabi) s).checkContext(sl);
                }
            
                if(o instanceof arte_init_opt.arteInitOpt)
                {
                    temp2 = ((arte_init_opt.arteInitOpt) o).checkContext(sl);
                }
                if(temp1.equals(temp2)){
                    return temp1;
                }
                return "";
            }
            else if(o instanceof arte_init_opt.arteInitOpt)
            {
                return ((arte_init_opt.arteInitOpt) o).checkContext(sl);
            }
            
            return "";
            
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).preInterpret(sl);
            }
            
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                ((arte_init_opt.arteInitOpt) o).preInterpret(sl);
            }
        }
    }
}