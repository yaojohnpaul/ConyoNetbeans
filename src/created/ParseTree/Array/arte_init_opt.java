package created.ParseTree.Array;

import java.util.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class arte_init_opt extends created.iNode 
{
    public arte_init_opt(int ln)
    {
        super(ln);
    }
    
    public static class arteInitOpt extends arte_init_opt
    {
        public sabi_sabi s; 
        public arte_init_opt o;
        
        public arteInitOpt(int ln, sabi_sabi s)
        {
            super(ln);
            this.s = s;
            this.o = null;
        }
        
        public arteInitOpt(int ln, sabi_sabi s, arte_init_opt o)
        {
            super(ln);
            this.s = s;
            this.o = o;
        }
        
        public String toString()
        {
            if(o != null)
                return s.toString() + ", " + o.toString();
            else
                return s.toString();
        }
        
        public int getCount()
        {
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                return 1 + ((arte_init_opt.arteInitOpt) o).getCount();
            }
            else
            {
                return 1;
            }
        }
        
        public ArrayList<sabi_sabi> getContents()
        {
            ArrayList<sabi_sabi> local = new ArrayList<>();
            
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                local.addAll(((arte_init_opt.arteInitOpt) o).getContents());
                local.add(s);
                return local;
            }
            else
            {
                local.add(s);
                return local;
            }
        }
        
        public void setSabi(int index, sabi_sabi s)
        {
            if(index == 0)
            {
                this.s = s;
            }
            else
            {
                if(o instanceof arte_init_opt.arteInitOpt)
                {
                    ((arte_init_opt.arteInitOpt) o).setSabi(index-1, s);
                }
            }
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
            String temp3 = "";
            if(o != null){
                if(s instanceof sabi_sabi.SabiSabi)
                {
                    temp1 = ((sabi_sabi.SabiSabi) s).checkContext(sl);
                    temp3 = temp1;
                    temp1 = temp1 + "[]";
                }
            
                if(o instanceof arte_init_opt.arteInitOpt)
                {
                    temp2 = ((arte_init_opt.arteInitOpt) o).checkContext(sl);
                }

                if(temp1.equals(temp2)){
                    return temp3 + "[]";
                }
                return "";
            }
            else if(s instanceof sabi_sabi.SabiSabi)//if(o instanceof arte_init_opt.arteInitOpt)
            {
                return ((sabi_sabi.SabiSabi) s).checkContext(sl) + "[]";
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
        
        public ArrayList<Object> evaluate(SymList sl)
        {
            ArrayList<Object> alo = new ArrayList<>();
            
            if(s instanceof sabi_sabi.SabiSabi)
            {
                alo.add(((sabi_sabi.SabiSabi) s).evaluate(sl));
            }
            
            if(o instanceof arte_init_opt.arteInitOpt)
            {
                alo.addAll(((arte_init_opt.arteInitOpt) o).evaluate(sl));
            }
            
            return alo;
        }
    }
}