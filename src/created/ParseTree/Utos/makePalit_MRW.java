package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class makePalit_MRW implements created.iNode  
{
    public static class MRW extends makePalit_MRW
    {
        public sabi_sabi s; 
        public utos_block_opt u;
        public makePalit_MRW m;
        
        public MRW()
        {
            this.s = null;
            this.u = null;
            this.m = null;
        }
        
        public MRW(sabi_sabi s, utos_block_opt u, makePalit_MRW m)
        {
            this.s = s;
            this.u = u;
            this.m = m;
        }
        
        public String toString()
        {
            if(s != null && u != null && m != null)
                return "MRW " + s.toString() + " : " + u.toString() + "\n" + m.toString();
            else    
                return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(s instanceof sabi_sabi.SabiSabi)
            {
                ((sabi_sabi.SabiSabi) s).setSymList(sl);
            }
            
            if(u instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) u).setSymList(sl);
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
            
            if(u instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) u).checkContext(sl);
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
            
            if(u instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) u).preInterpret(sl);
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
    }
    
    public static class MDR extends makePalit_MRW
    {
        public utos_block_opt o; 
        
        public MDR(utos_block_opt o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            return "MDR: " + o.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(o instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) o).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(o instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) o).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(o instanceof utos_block_opt.utosBlockOpt)
            {
                ((utos_block_opt.utosBlockOpt) o).preInterpret(sl);
            }
        }
    }
}