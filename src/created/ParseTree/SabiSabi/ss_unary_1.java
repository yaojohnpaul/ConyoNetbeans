package created.ParseTree.SabiSabi;

abstract class ss_unary_1 implements created.iNode
{
    public static class ssU1Not extends ss_unary_1
    {
        public ss_unary_1 u;
        
        public ssU1Not(ss_unary_1 u);
        {
            this.u = u;
        }
        
        public String toString()
        {
            return "!" + u.toString();
        }
    }
    
    public static class ssU1PlusPlus extends ss_unary_1
    {
        public ss_unary_1 u;
        
        public ssU1PlusPlus(ss_unary_1 u);
        {
            this.u = u;
        }
        
        public String toString()
        {
            return "++" + u.toString();
        }
    }
    
    public static class ssU1MinusMinus extends ss_unary_1
    {
        public ss_unary_1 u;
        
        public ssU1MinusMinus(ss_unary_1 u);
        {
            this.u = u;
        }
        
        public String toString()
        {
            return "--" + u.toString();
        }
    }
    
    public static class ssU1MinusMinus extends ss_unary_1
    {
        public ss_unary_2 u;
        
        public ssU1MinusMinus(ss_unary_2 u);
        {
            this.u = u;
        }
        
        public String toString()
        {
            return u.toString();
        }
    }
}

/*
ss_unary_1 ::= NOT ss_unary_1:u {: RESULT = new ssU1Not(u); :}
			| PLUS PLUS ss_unary_1:u {: RESULT = new ssU1PlusPlus(u); :}
			| MINUS MINUS ss_unary_1:u {: RESULT = new ssU1MinusMinus(u); :}
			| ss_unary_2:u {: RESULT = new ssU1(u); :};
*/