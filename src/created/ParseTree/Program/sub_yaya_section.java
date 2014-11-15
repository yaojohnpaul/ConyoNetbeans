package created.ParseTree.Program;

abstract class sub_yaya_section implements created.iNode 
{
    public static class subYayaSection extends sub_yaya_section
    {
        public sub_yaya_list s;
        
        public subYayaSection()
        {
            this.s = null;
        }
        
        public subYayaSection(sub_yaya_list s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return s.toString();
        }
    }
    
}