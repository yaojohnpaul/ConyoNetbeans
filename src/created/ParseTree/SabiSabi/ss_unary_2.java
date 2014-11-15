abstract class ss_unary_2 implements iNode
{
    
    public static class ssU2PlusPlus extends ss_unary_2
    {
        public ss_unary_2 u;
        
        public ssU2PlusPlus(ss_unary_2 u);
        {
            this.u = u;
        }
        
        public String toString()
        {
            return u.toString() + "++";
        }
    }
    
    public static class ssU2MinusMinus extends ss_unary_2
    {
        public ss_unary_2 u;
        
        public ssU2MinusMinus(ss_unary_2 u);
        {
            this.u = u;
        }
        
        public String toString()
        {
            return u.toString() + "--";
        }
    }
    
    public static class ssU2 extends ss_unary_2
    {
        public ss_paren p;
        
        public ssU2(ss_paren p);
        {
            this.p = p;
        }
        
        public String toString()
        {
            return p.toString();
        }
    }
}



//ss_unary_2 ::= ss_unary_2:u POS_INC {: RESULT = new ssU2PlusPlus(u); :}
//			| ss_unary_2:u NEG_INC {: RESULT = new ssU2MinusMinus(u); :}
//			| ss_paren:p {: RESULT = new ssU2(p); :};