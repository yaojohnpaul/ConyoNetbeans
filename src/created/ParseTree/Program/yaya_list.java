abstract class yaya_list implements iNode 
{
    public static class yayaDec extends yaya_list
    {
        public yaya y;
        public yaya_list l;
        
        public yayaDec(yaya y)
        {
            this.y = y;
            this.l = l;
        }
        
        public yayaDec(yaya y, yaya_list l)
        {
            this.y = y;
            this.l = l;
        }
        
        public String toString()
        {
            return y.toString() + "\n" + l.toString();
        }
    }
    
}