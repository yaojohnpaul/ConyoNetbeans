abstract class sy_cont implements iNode 
{
    public static class SubYayaContArte extends sy_cont
    {
        public arte_dec a;
        
        public SubYayaContArte(arte_dec a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
    
    public static class SubYayaContYaya extends sy_cont
    {
        public yaya a;
        
        public SubYayaContYaya(yaya a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
    
    public static class SubYayaContConstructor extends sy_cont
    {
        public constructor a;
        
        public SubYayaContConstructor(constructor a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
    
}
