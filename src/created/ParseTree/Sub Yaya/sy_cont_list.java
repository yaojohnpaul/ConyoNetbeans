abstract class sy_cont_list implements iNode 
{
    public static class SubYayaBodyListExpansion extends sy_cont_list
    {
        public sy_cont c;
        public sy_cont_list l;
        
        public SubYayaBodyListExpansion(sy_cont c, sy_cont_list l)
        {
            this.c = c;
            this.l = l;
        }
        
        public String toString()
        {
            return c.toString() + l.toString();
        }
    }
    
    public static class SubYayaBodyList extends sy_cont_list
    {
        public sy_cont c;
        
        public SubYayaBodyList(sy_cont c)
        {
            this.c = c;
        }
        
        public String toString()
        {
            return c.toString();
        }
    }
    
}
