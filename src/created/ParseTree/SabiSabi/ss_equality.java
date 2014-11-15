package created.ParseTree.SabiSabi;

abstract class ss_equality implements created.iNode
{
    public static class ssEqualityExpansion extends ss_equality
    {
        public ss_comparison c;
        public equality eq;
        public ss_equality e;
        
        public ssEqualityExpansion(ss_comparison c, equality eq, ss_equality e)
        {
            this.c = c;
            this.eq = eq;
            this.e = e;
        }
        
        public String toString(){
            return c.toString() + " " + eq.toString() + " " + e.toString();
        }
    }
    
    public static class ssEquality extends ss_equality
    {
        public ss_comparison c;
        
        public ssEqualityExpansion(ss_comparison c)
        {
            this.c = c;
        }
        
        public String toString(){
            return c.toString();
        }
    }
}


//ss_equality ::= ss_comparison:c equality:eq ss_equality:e {: RESULT = new ssEqualityExpansion(c, eq, e); :}
//			| ss_comparison:c {: RESULT = new ssEquality(c); :};

