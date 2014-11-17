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

public abstract class ss_unary_1 implements created.iNode
{
    public static class ssU1Not extends ss_unary_1
    {
        public ss_unary_1 u;
        
        public ssU1Not(ss_unary_1 u)
        {
            this.u = u;
        }
        
        public String toString()
        {
            return "!" + u.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(u instanceof ss_unary_1.ssU1)
            {
                ((ss_unary_1.ssU1) u).setSymList(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                ((ss_unary_1.ssU1Not) u).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            String unary = "";
            if(u instanceof ss_unary_1.ssU1)
            {
                unary = ((ss_unary_1.ssU1) u).checkContext(sl);
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                unary = ((ss_unary_1.ssU1Not) u).checkContext(sl);
            }
            //other context here
            if(unary == "booly")
                return unary;
                
            ErrorReport.error("Datatype Mismatch");
            return "";
        } 
        
        public Object evaluate(SymList sl)
        {
            if(u instanceof ss_unary_1.ssU1)
            {
                return !((boolean)((ss_unary_1.ssU1) u).evaluate(sl));
            }
            else if(u instanceof ss_unary_1.ssU1Not)
            {
                return !((boolean)((ss_unary_1.ssU1Not) u).evaluate(sl));
            }
            
            return null;
        }
    }
    
    public static class ssU1 extends ss_unary_1
    {
        public ss_paren p;
        
        public ssU1(ss_paren p)
        {
            this.p = p;
        }
        
        public String toString()
        {
            return p.toString();
        }
        
        public void setSymList(SymList sl)
        {
            if(p instanceof ss_paren.ssParen)
            {
                ((ss_paren.ssParen) p).setSymList(sl);
            }
            else if(p instanceof ss_paren.ssParenEnd)
            {
                ((ss_paren.ssParenEnd) p).setSymList(sl);
            }
            
        }
        
        public String checkContext(SymList sl) 
        { // for sabi sabi plng
            //other context here
            if(p instanceof ss_paren.ssParen)
            {
                return ((ss_paren.ssParen) p).checkContext(sl);
            }
            else if(p instanceof ss_paren.ssParenEnd)
            {
                return ((ss_paren.ssParenEnd) p).checkContext(sl);
            }
            return "";
        }
        
        public Object evaluate(SymList sl)
        {
            if(p instanceof ss_paren.ssParen)
            {
                return ((ss_paren.ssParen) p).evaluate(sl);
            }
            else if(p instanceof ss_paren.ssParenEnd)
            {
                return ((ss_paren.ssParenEnd) p).evaluate(sl);
            }   
            
            return null;
        }
    }
}

/*
ss_unary_1 ::= NOT ss_unary_1:u {: RESULT = new ssU1Not(u); :}
			| PLUS PLUS ss_unary_1:u {: RESULT = new ssU1PlusPlus(u); :}
			| MINUS MINUS ss_unary_1:u {: RESULT = new ssU1MinusMinus(u); :}
			| ss_unary_2:u {: RESULT = new ssU1(u); :};
*/