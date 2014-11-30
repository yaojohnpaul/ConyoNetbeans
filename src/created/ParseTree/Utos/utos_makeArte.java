package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import created.WatchAndTrace;
import created.WatchManager;

public abstract class utos_makeArte extends created.iNode  
{
    public utos_makeArte(int ln)
    {
        super(ln);
    }
    
    public static class makeArte extends utos_makeArte
    {
        public arte_dec a; 
        
        public makeArte(int ln, arte_dec a)
        {
            super(ln);
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
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(a instanceof arte_dec.arteDec)
            {
                ((arte_dec.arteDec) a).evaluate(sl);
            }
            if(WatchAndTrace.getVersion() != WatchManager.NOWATCH_ID){
                if(WatchAndTrace.getVersion() == WatchManager.NORMALWATCH_ID || inAFunction == WatchManager.NOT_IN_A_FUNCTION){
                    if(call == WatchManager.STANDALONE){
                        WatchAndTrace GUI = WatchAndTrace.getInstance();
                        GUI.watchAndTrace(sl);
                    }
                }
            }
        }
    }
}