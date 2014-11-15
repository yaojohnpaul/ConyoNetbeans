abstract class sub_yaya_list implements iNode 
{
    public static class subYayaList extends sub_yaya_list
    {
        public sub_yaya s;
        public sub_yaya_list syl;
        
        public subYayaList(sub_yaya s)
        {
            this.s = s;
            syl = null;
        }
        
        public subYayaList(sub_yaya s, sub_yaya syl)
        {
            this.s = s;
            this.syl = syl;
        }
        
        public String toString()
        {
            if(syl == null)
                return s.toString();
            else
                return s.toString() + ", " + syl.toString();
        }
    }
    
}