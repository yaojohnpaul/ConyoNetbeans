abstract class sub_yaya_list implements iNode 
{
    public static class subYayaDec extends sub_yaya_list
    {
        public sub_yaya s;
        public sub_yaya_list l;
        
        public subYayaDec(sub_yaya s)
        {
            this.s = s;
            this.l = null;
        }
        
        public subYayaDec(sub_yaya s, sub_yaya_list l)
        {
            this.s = s;
            this.l = l;
        }
        
        public String toString()
        {
            return s.toString() + "\n" + l.toString();
        }
    }
    
}