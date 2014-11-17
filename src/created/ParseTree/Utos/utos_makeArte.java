package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_makeArte implements created.iNode  
{
    public static class makeArte extends utos_makeArte
    {
        public arte_dec a; 
        
        public makeArte(arte_dec a)
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
}