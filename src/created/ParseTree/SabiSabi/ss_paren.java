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
        public ss_OR a;
        
        public ssParen(ss_OR a){
            this.a = a;
        }
        
        public String toString(){
            return "(" + a.toString() + ")";
        }
        
        public void setSymList(SymList sl)
        {
            if(a instanceof ss_OR.ssOR)
            {
                ((ss_OR.ssOR) a).setSymList(sl);
            }
            else if(a instanceof ss_OR.ssORExpansion)
            {
                ((ss_OR.ssORExpansion) a).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            if(a instanceof ss_OR.ssOR)
            {
                return ((ss_OR.ssOR) a).checkContext(sl);
            }
            else if(a instanceof ss_OR.ssORExpansion)
            {
                return ((ss_OR.ssORExpansion) a).checkContext(sl);
            }
            return "";
        }
        
        public Object evaluate(SymList sl) 
        { // for sabi sabi plng
            if(a instanceof ss_OR.ssOR)
            {
                return ((ss_OR.ssOR) a).evaluate(sl);
            }
            else if(a instanceof ss_OR.ssORExpansion)
            {
                return ((ss_OR.ssORExpansion) a).evaluate(sl);
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
        
            return "";
        }
        
        public Object evaluate(SymList sl)
        {
            // if(e instanceof sabi_sabi_end.ssEndUtos)
            // {
            //     return ((sabi_sabi_end.ssEndUtos) e).evaluate(sl);
            // }
            // else if(e instanceof sabi_sabi_end.ssEndValidVar)
            // {
            //     return ((sabi_sabi_end.ssEndValidVar) e).evaluate(sl);
            // }
            // else 
            if(e instanceof sabi_sabi_end.ssEndLiteral)
            {
                return ((sabi_sabi_end.ssEndLiteral) e).evaluate(sl);
            }
            return "";
            
        }
    }
}

//ss_paren ::= LEFT_PAREN ss_paren:p RIGHT_PAREN {: RESULT = new ssParen(p); :}
//			| sabi_sabi_end:e {: RESULT = new ssParenEnd(e); :};