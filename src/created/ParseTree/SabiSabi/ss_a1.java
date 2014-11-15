package created.ParseTree.SabiSabi;

abstract class ss_a1 implements created.iNode
{
    public static class ssA1Expansion extends ss_a1
    {
        public ss_a2 a2;
        public arithmetic_1 ar;
        public ss_a1 a1;
        
        public ssComparisonExpansion(ss_a2 a, arithmetic_1 ar, ss_a1 c)
        {
            this.a1 = a1;
            this.ar = ar;
            this.a2 = a2;
        }
        
        public String toString(){
            return a2.toString() + " " + ar.toString() + " " + a1.toString();
        }
        
    }
    
    public static class ssA1 extends  ss_a1
    {
        public ss_a2 a2;
        
        public ssComparison(ss_a2 a2)
        {
            this.a2 = a2;
        }
        
        public String toString(){
            return a2.toString();
        }   
    }
}

//ss_a1 ::= ss_a2:a2 arithmetic_1:ar ss_a1:a1 {: RESULT = new ssA1(a2, ar, a1); :}
//		| ss_a2:a2 {: RESULT = new ssA1(a2); :};