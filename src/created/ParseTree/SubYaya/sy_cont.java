package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class sy_cont implements created.iNode 
{
    public static class SubYayaContArte extends sy_cont
    {
        public arte_dec a;
        
        public SubYayaContArte(arte_dec a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof arte_dec.arteDec)
            {
                ((arte_dec.arteDec) a).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(a instanceof arte_dec.arteDec)
            {
                ((arte_dec.arteDec) a).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(a instanceof arte_dec.arteDec)
            {
                ((arte_dec.arteDec) a).preInterpret(sl);
            }
        }
    }
    
    public static class SubYayaContYaya extends sy_cont
    {
        public yaya a;
        
        public SubYayaContYaya(yaya a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof yaya.addYaya)
            {
                ((yaya.addYaya) a).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(a instanceof yaya.addYaya)
            {
                ((yaya.addYaya) a).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(a instanceof yaya.addYaya)
            {
                ((yaya.addYaya) a).preInterpret(sl);
            }
        }
    }
    
    public static class SubYayaContConstructor extends sy_cont
    {
        public constructor a;
        
        public SubYayaContConstructor(constructor a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof constructor.mSimula)
            {
                ((constructor.mSimula) a).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(a instanceof constructor.mSimula)
            {
                ((constructor.mSimula) a).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(a instanceof constructor.mSimula)
            {
                ((constructor.mSimula) a).preInterpret(sl);
            }
        }
    }
    
}
