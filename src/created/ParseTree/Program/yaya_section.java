abstract class yaya_section implements iNode 
{
    public static class yayaList extends yaya_section
    {
        public yaya_list l;
        
        public yayaList()
        {
            this.l = null;
        }
        
        public yayaList(yaya_list l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString();
        }
    }
    
}