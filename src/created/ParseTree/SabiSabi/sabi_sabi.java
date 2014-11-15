package created.ParseTree.SabiSabi;

abstract class sabi_sabi implements created.iNode
{
    public static class SabiSabi extends sabi_sabi
    {
        public ss_OR o;
        
        public SabiSabi(ss_OR o)
        {
            this.o = o;
        }
        
        public String toString()
        {
            return o.toString();
        }
    }
}


//sabi_sabi ::= ss_OR:o {: RESULT = new SabiSabi(o); :};