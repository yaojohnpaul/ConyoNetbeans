abstract class yaya_param implements iNode 
{
    public static class yayaParam extends yaya_param
    {
        public data_type dt;
        public String id;
        
        public yayaParam(data_type dt, String id)
        {
            this.dt = dt;
            this.id = id;
        }
        
        public String toString()
        {
            return dt.toString() + " " + id;
        }
    }
    
}