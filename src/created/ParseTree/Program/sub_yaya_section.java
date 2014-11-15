abstract class sub_yaya_section implements iNode 
{
    public static class subYayaList extends sub_yaya_section
    {
        public sub_yaya_list s;
        
        public subYayaList()
        {
            this.s = null;
        }
        
        public subYayaList(sub_yaya_list s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return s.toString();
        }
    }
    
}