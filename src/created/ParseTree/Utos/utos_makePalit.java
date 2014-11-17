package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_makePalit implements created.iNode  
{
    public static class makePalit extends utos_makePalit
    {
        public sabi_sabi s; 
        public makePalit_MRW m;
        
        public makePalit(sabi_sabi s, makePalit_MRW m)
        {
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
    }
}