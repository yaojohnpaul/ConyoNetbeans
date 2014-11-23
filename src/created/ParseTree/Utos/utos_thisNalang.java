package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_thisNalang implements created.iNode  
{
    public static class thisNalang extends utos_thisNalang
    {
        public utos_block b; 
        
        public thisNalang()
        {
            this.b = null;
        }
        
        public thisNalang(utos_block b)
        {
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
        
        public void evaluate(SymList sl)
        {
            if(b instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) b).evaluate(sl);
            }
        }
        
    }
    
    public static class thisNalangKapag extends utos_thisNalang
    {
        public sabi_sabi s;
        public utos_block b;
        public utos_thisNalang t;
        
        public thisNalangKapag(sabi_sabi s, utos_block b, utos_thisNalang t)
        {
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
                ErrorReport.error("Condition for if else statement is not Boolean");
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
        
        
        public void evaluate(SymList sl)
        {
            boolean a = false;
            if(s instanceof sabi_sabi.SabiSabi)
            {
                a = (boolean)((sabi_sabi.SabiSabi) s).evaluate(sl);
            }
            
            if(a == true)
            {
                if(b instanceof utos_block.utosBlock)
                {
                    ((utos_block.utosBlock) b).evaluate(sl);
                }
            
                if(t instanceof utos_thisNalang.thisNalang)
                {
                    ((utos_thisNalang.thisNalang) t).evaluate(sl);
                }
                else if(t instanceof utos_thisNalang.thisNalangKapag)
                {
                    ((utos_thisNalang.thisNalangKapag) t).evaluate(sl);
                } 
            }
            
            
            
        }
        
    }
}