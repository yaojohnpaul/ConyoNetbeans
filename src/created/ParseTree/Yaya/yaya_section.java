package created.parseTree.Yaya;

abstract class yaya_section implements created.iNode  
{
    public static class yayaSection extends yaya_section
    {
        public yaya_list yl;
        
        public yayaSection()
        {
            this.yl = null;   
        }
        
        public yayaSection(yaya_list yl)
        {
            this.yl = yl;
        }
        
        public String toString()
        {
            return yl.toString();
        }
    }
    
}