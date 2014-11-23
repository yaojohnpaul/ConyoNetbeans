package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;

public abstract class utos_makeUlit implements created.iNode  
{
    public static class makeUlit extends utos_makeUlit
    {
        public utos_makeKuha m1; 
        public utos_makeKuha m2;
        public sabi_sabi_for s1;
        public sabi_sabi_for s2;
        public utos_sabisabi m3;
        public utos_block u;
        
        public makeUlit(utos_makeKuha m1, sabi_sabi_for s1, utos_makeKuha m2, utos_block u)
        {
            this.m1 = m1;
            this.m2 = m2;
            this.s1 = s1;
            this.s2 = null;
            this.m3 = null;
            this.u = u;
        }
        
        public makeUlit(utos_makeKuha m1, sabi_sabi_for s1, sabi_sabi_for s2, utos_block u)
        {
            this.m1 = m1;
            this.m2 = null;
            this.s1 = s1;
            this.s2 = s2;
            this.m3 = null;
            this.u = u;
        }
        
        public makeUlit(utos_makeKuha m1, sabi_sabi_for s1, utos_sabisabi m3, utos_block u)
        {
            this.m1 = m1;
            this.m2 = null;
            this.s1 = s1;
            this.s2 = null;
            this.m3 = m3;
            this.u = u;
        }
        
        @Override
        public String toString()
        {
            if(m2 != null)
                return "makeUlit(" + m1.toString() + " db " + s1.toString() + " " + m2.toString() + ")\n" + u.toString();
            else if(s2 != null)
                return "makeUlit(" + m1.toString() + " db " + s1.toString() + " " + s2.toString() + ")\n" + u.toString();
            else if(m3 != null)
                return "makeUlit(" + m1.toString() + " db " + s1.toString() + " " + m3.toString() + ")\n" + u.toString();
            return "";
        }
        
        public void setSymList(SymList sl)
        {
            if(m1 instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) m1).setSymList(sl);
            }
            
            if(m2 instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) m2).setSymList(sl);
            }
            
            if(s1 instanceof sabi_sabi_for.SabiSabiFor)
            {
                ((sabi_sabi_for.SabiSabiFor) s1).setSymList(sl);
            }
            
            if(s2 instanceof sabi_sabi_for.SabiSabiFor)
            {
                ((sabi_sabi_for.SabiSabiFor) s2).setSymList(sl);
            }
            
            if(m3 instanceof utos_sabisabi.utosSabiSabiFront)
            {
                ((utos_sabisabi.utosSabiSabiFront) m3).setSymList(sl);
            }
            else if(m3 instanceof utos_sabisabi.utosSabiSabiBack)
            {
                ((utos_sabisabi.utosSabiSabiBack) m3).setSymList(sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).setSymList(sl);
            }
        }
        
        public void checkContext(SymList sl)
        {
            if(m1 instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) m1).checkContext(sl);
            }
            
            if(m2 instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) m2).checkContext(sl);
            }
            
            if(s1 instanceof sabi_sabi_for.SabiSabiFor)
            {
                ((sabi_sabi_for.SabiSabiFor) s1).checkContext(sl);
            }
            
            if(s2 instanceof sabi_sabi_for.SabiSabiFor)
            {
                ((sabi_sabi_for.SabiSabiFor) s2).checkContext(sl);
            }
            
            if(m3 instanceof utos_sabisabi.utosSabiSabiFront)
            {
                ((utos_sabisabi.utosSabiSabiFront) m3).checkContext(sl);
            }
            else if(m3 instanceof utos_sabisabi.utosSabiSabiBack)
            {
                ((utos_sabisabi.utosSabiSabiBack) m3).checkContext(sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).checkContext(sl);
            }
        }
        
        public void preInterpret(SymList sl)
        {
            if(m1 instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) m1).preInterpret(sl);
            }
            
            if(m2 instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) m2).preInterpret(sl);
            }
            
            if(s1 instanceof sabi_sabi_for.SabiSabiFor)
            {
                ((sabi_sabi_for.SabiSabiFor) s1).preInterpret(sl);
            }
            
            if(s2 instanceof sabi_sabi_for.SabiSabiFor)
            {
                ((sabi_sabi_for.SabiSabiFor) s2).preInterpret(sl);
            }
            
            if(m3 instanceof utos_sabisabi.utosSabiSabiFront)
            {
                ((utos_sabisabi.utosSabiSabiFront) m3).preInterpret(sl);
            }
            else if(m3 instanceof utos_sabisabi.utosSabiSabiBack)
            {
                ((utos_sabisabi.utosSabiSabiBack) m3).preInterpret(sl);
            }
            
            if(u instanceof utos_block.utosBlock)
            {
                ((utos_block.utosBlock) u).preInterpret(sl);
            }
        }
        
        public void evaluate(SymList sl)
        {
            boolean flag = false;
            if(m1 instanceof utos_makeKuha.makeKuha)
            {
                ((utos_makeKuha.makeKuha) m1).evaluate(sl);
            }
            if(s1 instanceof sabi_sabi_for.SabiSabiFor)
            {
                flag = ((sabi_sabi_for.SabiSabiFor) s1).evaluate(sl);
            }
            
            if(s2 == null && m3 == null) // case 1
            {
                //for(m1;s1;m2)
                while(flag)
                {
                    if(u instanceof utos_block.utosBlock)
                    {
                        ((utos_block.utosBlock) u).evaluate(sl);
                    }
                    
                    if(m2 instanceof utos_makeKuha.makeKuha)
                    {
                        ((utos_makeKuha.makeKuha) m2).evaluate(sl);
                    }
                    
                    if(s1 instanceof sabi_sabi_for.SabiSabiFor)
                    {
                        flag = ((sabi_sabi_for.SabiSabiFor) s1).evaluate(sl);
                    }
                    
                }
            }
            else if(m2 == null && m3 == null) // case 2
            {
                //for(m1;s1;s2)
                while(flag)
                {
                    if(u instanceof utos_block.utosBlock)
                    {
                        ((utos_block.utosBlock) u).evaluate(sl);
                    }
                    
                    if(s2 instanceof sabi_sabi_for.SabiSabiFor)
                    {
                        ((sabi_sabi_for.SabiSabiFor) s2).evaluate(sl);
                    }
                    
                    if(s1 instanceof sabi_sabi_for.SabiSabiFor)
                    {
                        flag = ((sabi_sabi_for.SabiSabiFor) s1).evaluate(sl);
                    }
                }
            }
            else if(m2 == null && s2 == null) // case 3
            {
                //for(m1;s1;m3)
                while(flag)
                {
                    if(u instanceof utos_block.utosBlock)
                    {
                        ((utos_block.utosBlock) u).evaluate(sl);
                    }
                    
                    if(m3 instanceof utos_sabisabi.utosSabiSabiFront)
                    {
                        ((utos_sabisabi.utosSabiSabiFront) m3).evaluate(sl);
                    }
                    else if(m3 instanceof utos_sabisabi.utosSabiSabiBack)
                    {
                        ((utos_sabisabi.utosSabiSabiBack) m3).evaluate(sl);
                    }
                    
                    if(s1 instanceof sabi_sabi_for.SabiSabiFor)
                    {
                        flag = ((sabi_sabi_for.SabiSabiFor) s1).evaluate(sl);
                    }
                }
            }
        }
    }
}
/*
utos_makeUlit ::= MAKE_ULIT LEFT_PAREN utos_makeKuha:m1 DB sabi_sabi_for:s1 utos_makeKuha:m2 RIGHT_PAREN utos_block:u {: RESULT = new utos_makeUlit.makeUlit(m1, s1, m2, u); :}
				| MAKE_ULIT LEFT_PAREN utos_makeKuha:m1 DB sabi_sabi_for:s1 utos_sabisabi:m2 RIGHT_PAREN utos_block:u {: RESULT = new utos_makeUlit.makeUlit(m1, s1, m2, u); :}
				| MAKE_ULIT LEFT_PAREN utos_makeKuha:m1 DB sabi_sabi_for:s1 sabi_sabi_for:s2 RIGHT_PAREN utos_block:u {: RESULT = new utos_makeUlit.makeUlit(m1, s1, s2, u); :};
*/