package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class utos_likeKapag extends created.iNode  
{
    public utos_likeKapag(int ln)
    {
        super(ln);
    }
    
    public static class likeKapag extends utos_likeKapag
    {
        public sabi_sabi s;
        public utos_block b;
        public utos_thisNalang t;
        
        public likeKapag(int ln, sabi_sabi s, utos_block b, utos_thisNalang t)
        {
            super(ln);
            this.s = s;
            this.b = b;
            this.t = t;
        }
        
        public String toString()
        {
            return "likeKapag(" + s.toString() + ")\n" + b.toString() + "\n" + t.toString();
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
            }
            else
            {
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