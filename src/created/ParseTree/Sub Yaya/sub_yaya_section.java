abstract class sub_yaya_section implements iNode 
{
    public static class subYayaSection extends sub_yaya_section
    {
        public sub_yaya_list syl;
        
        public subYayaSection()
        {
            syl = null;   
        }
        
        public subYayaSection(sub_yaya_list syl)
        {
            this.syl = syl;
        }
        
        public String toString()
        {
            return syl.toString();
        }
    }
    
}