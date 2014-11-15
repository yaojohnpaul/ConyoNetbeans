abstract class arte_dec implements iNode 
{
    public static class arteDec extends arte_dec
    {
        public data_type dt; 
        public String id;
        public arte_assign a;
        
        public arteDec(data_type dt, String id, arte_assign a)
        {
            this.dt = dt;
            this.id = id;
            this.a = a;
        }
        
        public String toString()
        {
            return dt.toString + " " + id.toString() + " " + a.toString();
        }
    }
}