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
import error.*;

public abstract class utos_makeGawaHabang extends created.iNode  
{
    public utos_makeGawaHabang(int ln)
    {
        super(ln);
    }
    
    public static class makeGawaHabang extends utos_makeGawaHabang
    {
        public utos_block u; 
        public sabi_sabi s;
        
        public makeGawaHabang(int ln, utos_block u, sabi_sabi s)
        {
            super(ln);
            this.u = u;
            this.s = s;
        }
        
        public String toString()
        {
            return "makeGawa\n" + u.toString() + "\nlikeHabang(" + s.toString() + ")";
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            String type = "";
            if(s instanceof sabi_sabi.SabiSabi)
            {
                type = ((sabi_sabi.SabiSabi) s).checkContext(sl);
                if(!type.equals("booly"))
                {
                    ErrorReport.error(ln(), "Condition for do-while statement is not Boolean");
                }
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).preInterpret(sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl, int call, int inAFunction)
        {
            boolean a = false;
            int utosType = 0;
            
            do
            {
                if(u instanceof utos_block.utosBlock)
                {
                    ((utos_block.utosBlock) u).evaluate(sl, call, inAFunction );
                }
                
                if(utosType == 1)
                    break;
                
                if(s instanceof sabi_sabi.SabiSabi)
                {
                    a = (boolean)((sabi_sabi.SabiSabi) s).evaluate(sl);
                }
               
                if(WatchAndTrace.getVersion() != WatchManager.NOWATCH_ID){
                    if(WatchAndTrace.getVersion() == WatchManager.NORMALWATCH_ID || inAFunction == WatchManager.NOT_IN_A_FUNCTION){
                        if(call == WatchManager.STANDALONE){
                            WatchAndTrace GUI = WatchAndTrace.getInstance();
                            GUI.watchAndTrace(sl, ln());
                        }
                    }
                }// highlight while condition
            } while(a);
        }
    }
}