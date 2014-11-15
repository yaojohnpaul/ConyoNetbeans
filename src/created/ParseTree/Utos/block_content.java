abstract class block_content implements iNode 
{
    public static class blockContent extends block_content
    {
        public utos_dec u;
        public block_content b;
        
        public blockContent(utos_dec u, block_content b)
        {
            this.u = u;
            this.b = b;
        }
        
        public blockContent(utos_dec u)
        {
            this.u = u;
            this.b = null;
        }
        
        public String toString()
        {
            return u.toString() + " " + b.toString();
        }
    }
}