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

public abstract class utos_thisNalang extends created.iNode  
{
    public utos_thisNalang(int ln)
    {
        super(ln);
    }
    
    public static class thisNalang extends utos_thisNalang
    {
        public utos_block b; 
        
        public thisNalang(int ln)
        {
            super(ln);
            this.b = null;
        }
        
        public thisNalang(int ln, utos_block b)
        {
            super(ln);
            this.b = b;
        }
        
        public String toString()
        {
            if(b != null)
                return "thisNalang\n" + b.toString();
            else
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(b instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) b).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(b instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) b).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(b instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) b).preInterpret(sl);
            }
        }
        
        public int evaluate(SymList sl, int call, int inAFunction)
        {
            if(b instanceof utos_block.utosBlock)
            {
                return ((utos_block.utosBlock) b).evaluate(sl,  call, inAFunction);
            }
            
            return 0;
        }
        
    }
    
    public static class thisNalangKapag extends utos_thisNalang
    {
        public sabi_sabi s;
        public utos_block b;
        public utos_thisNalang t;
        
        public thisNalangKapag(int ln, sabi_sabi s, utos_block b, utos_thisNalang t)
        {
            super(ln);
            this.s = s;
            this.b = b;
            this.t = t;
        }
        
        public String toString()
        {
            return "thisNalangKapag(" + s.toString() + ")\n" + b.toString() + "\n" + t.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
            
            if(b instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) b).setSymList(sl);
            }
            
            if(t instanceof utos_thisNalang.thisNalang)
            {
                ((utos_thisNalang.thisNalang) t).setSymList(sl);
            }
            else if(t instanceof utos_thisNalang.thisNalangKapag)
            {
                ((utos_thisNalang.thisNalangKapag) t).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            String a = "";
            if(s instanceof sabi_sabi.SabiSabi)
            {
                a = ((sabi_sabi.SabiSabi) s).checkContext(sl);
            }
            
            if(b instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) b).checkContext(sl);
            }
            
            if(t instanceof utos_thisNalang.thisNalang)
            {
                ((utos_thisNalang.thisNalang) t).checkContext(sl);
            }
            else if(t instanceof utos_thisNalang.thisNalangKapag)
            {
                ((utos_thisNalang.thisNalangKapag) t).checkContext(sl);
            }
            
            if(!a.equals("booly"))
            {
                ErrorReport.error(ln(), "Condition for if else statement is not Boolean");
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).preInterpret(sl);
            }
            
            if(b instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) b).preInterpret(sl);
            }
            
            if(t instanceof utos_thisNalang.thisNalang)
            {
                ((utos_thisNalang.thisNalang) t).preInterpret(sl);
            }
            else if(t instanceof utos_thisNalang.thisNalangKapag)
            {
                ((utos_thisNalang.thisNalangKapag) t).preInterpret(sl);
            }
        }
        
        
        public int evaluate(SymList sl, int call, int inAFunction)
        {
            boolean a = false;
            if(s instanceof sabi_sabi.SabiSabi)
            {
                a = (boolean)((sabi_sabi.SabiSabi) s).evaluate(sl);
            }
            if(WatchAndTrace.getVersion() != WatchManager.NOWATCH_ID){
                if(WatchAndTrace.getVersion() == WatchManager.NORMALWATCH_ID || inAFunction == WatchManager.NOT_IN_A_FUNCTION){
                    if(call == WatchManager.STANDALONE){
                        WatchAndTrace GUI = WatchAndTrace.getInstance();
                        GUI.watchAndTrace(sl);
                    }
                }
            }// highlight else if condition
            if(a == true)
            {
                if(b instanceof utos_block.utosBlock)
                {
                    return ((utos_block.utosBlock) b).evaluate(sl, call, inAFunction);
                }
            }
            else
            {
                if(t instanceof utos_thisNalang.thisNalang)
                {
                    return ((utos_thisNalang.thisNalang) t).evaluate(sl, call , inAFunction);
                }
                else if(t instanceof utos_thisNalang.thisNalangKapag)
                {
                    return ((utos_thisNalang.thisNalangKapag) t).evaluate(sl, call, inAFunction);
                } 
            }
            
            return 0;
        }
        
    }
}