package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;
import created.Sym.*;
import error.*;

public abstract class ss_paren implements created.iNode
{
    public static class ssParen extends ss_paren
    {
        public ss_a1 a;
        
        public ssParen(ss_a1 a){
            this.a = a;
        }
        
        public String toString(){
            return "(" + a.toString() + ")";
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof ss_a1.ssA1)
            {
                ((ss_a1.ssA1) a).setSymList(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                ((ss_a1.ssA1Expansion) a).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            if(a instanceof ss_a1.ssA1)
            {
                return ((ss_a1.ssA1) a).checkContext(sl);
            }
            else if(a instanceof ss_a1.ssA1Expansion)
            {
                return ((ss_a1.ssA1Expansion) a).checkContext(sl);
            }
            return null;
        } 
    }
    
    public static class ssParenEnd extends ss_paren
    {
        public sabi_sabi_end e;
        
        public ssParenEnd(sabi_sabi_end e)
        {
            this.e = e;
        }
        
        public String toString()
        {
            return e.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(e instanceof sabi_sabi_end.ssEndUtos)
            {
                ((sabi_sabi_end.ssEndUtos) e).setSymList(sl);
            }
            else if(e instanceof sabi_sabi_end.ssEndValidVar)
            {
                ((sabi_sabi_end.ssEndValidVar) e).setSymList(sl);
            }
            else if(e instanceof sabi_sabi_end.ssEndLiteral)
            {
                ((sabi_sabi_end.ssEndLiteral) e).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            if(e instanceof sabi_sabi_end.ssEndUtos)
            {
                return ((sabi_sabi_end.ssEndUtos) e).checkContext(sl);
            }
            else if(e instanceof sabi_sabi_end.ssEndValidVar)
            {
                return ((sabi_sabi_end.ssEndValidVar) e).checkContext(sl);
            }
            else if(e instanceof sabi_sabi_end.ssEndLiteral)
            {
                return ((sabi_sabi_end.ssEndLiteral) e).checkContext(sl);
            }
        
            return null;
        }
    }
}

//ss_paren ::= LEFT_PAREN ss_paren:p RIGHT_PAREN {: RESULT = new ssParen(p); :}
//			| sabi_sabi_end:e {: RESULT = new ssParenEnd(e); :};