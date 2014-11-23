package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_likeKapag implements created.iNode  
{
    public static class likeKapag extends utos_likeKapag
    {
        public sabi_sabi s;
        public utos_block b;
        public utos_thisNalang t;
        
        public likeKapag(sabi_sabi s, utos_block b, utos_thisNalang t)
        {
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
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).checkContext(sl);
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
    }
}