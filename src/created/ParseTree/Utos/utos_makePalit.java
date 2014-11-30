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

public abstract class utos_makePalit extends created.iNode  
{
    public utos_makePalit(int ln)
    {
        super(ln);
    }
    
    public static class makePalit extends utos_makePalit
    {
        public sabi_sabi s; 
        public makePalit_MRW m;
        
        public makePalit(int ln, sabi_sabi s, makePalit_MRW m)
        {
            super(ln);
            this.s = s;
            this.m = m;
        }
        
        public String toString()
        {
            return "makePalit(" + s.toString() + ")\n$\n" + m.toString() + "\n$"; 
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
            
            if(m instanceof makePalit_MRW.MRW)
            {
                ((makePalit_MRW.MRW) m).setSymList(sl);
            }
            else if(m instanceof makePalit_MRW.MDR)
            {
                ((makePalit_MRW.MDR) m).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).checkContext(sl);
            }
            
            if(m instanceof makePalit_MRW.MRW)
            {
                ((makePalit_MRW.MRW) m).checkContext(sl);
            }
            else if(m instanceof makePalit_MRW.MDR)
            {
                ((makePalit_MRW.MDR) m).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).preInterpret(sl);
            }
            
            if(m instanceof makePalit_MRW.MRW)
            {
                ((makePalit_MRW.MRW) m).preInterpret(sl);
            }
            else if(m instanceof makePalit_MRW.MDR)
            {
                ((makePalit_MRW.MDR) m).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            Object match = null;
            if(s instanceof sabi_sabi.SabiSabi)
            {
                match = ((sabi_sabi.SabiSabi) s).evaluate(sl);
            }
            
            if(WatchAndTrace.getVersion() != WatchManager.NOWATCH_ID){
                if(WatchAndTrace.getVersion() == WatchManager.NORMALWATCH_ID || inAFunction == WatchManager.NOT_IN_A_FUNCTION){
                    if(call == WatchManager.STANDALONE){
                        WatchAndTrace GUI = WatchAndTrace.getInstance();
                        GUI.watchAndTrace(sl, ln());
                    }
                }
            }
            
            if(m instanceof makePalit_MRW.MRW)
            {
                ((makePalit_MRW.MRW) m).evaluate(sl, match, false, false, call, inAFunction);
            }
            else if(m instanceof makePalit_MRW.MDR)
            {
                ((makePalit_MRW.MDR) m).evaluate(sl, call, inAFunction);
            }
        }
    }
}