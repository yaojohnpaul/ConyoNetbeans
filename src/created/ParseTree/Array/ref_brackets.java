abstract class ref_brackets implements iNode 
{
    public static class refBrackets extends ref_brackets
    {
        public sabi_sabi s; 
        
        public refBrackets(sabi_sabi s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return s.toString;
        }
    }
}