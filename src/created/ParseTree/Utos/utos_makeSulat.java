package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import created.*;

public abstract class utos_makeSulat extends created.iNode  
{
    public utos_makeSulat(int ln)
    {
        super(ln);
    }
    
    public static class makeSulat extends utos_makeSulat
    {
        public sabi_sabi s; 
        
        public makeSulat(int ln, sabi_sabi s)
        {
            super(ln);
            this.s = s;
        }
        
        public String toString()
        {
            return "makeSulat(" + s.toString() + ")";
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                //Change evaluate() to String if ever return type of evaluate changes
                OutGen.addOut(String.valueOf(((sabi_sabi.SabiSabi) s).evaluate(sl)));
            }
            if(WatchAndTrace.getVersion() != WatchManager.NOWATCH_ID){
                if(WatchAndTrace.getVersion() == WatchManager.NORMALWATCH_ID || inAFunction == WatchManager.NOT_IN_A_FUNCTION){
                    if(call == WatchManager.STANDALONE){
                        WatchAndTrace GUI = WatchAndTrace.getInstance();
                        GUI.watchAndTrace(sl, ln());
                    }
                }
            }
        }
    }
}