package created.ParseTree.Program;

abstract class yaya_section implements created.iNode 
{
    public static class yayaSection extends yaya_section
    {
        public yaya_list l;
        
        public yayaSection()
        {
            this.l = null;
        }
        
        public yayaSection(yaya_list l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString();
        }
    }
    
}