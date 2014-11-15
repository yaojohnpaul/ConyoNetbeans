abstract class super_yaya implements iNode 
{
    public static class superYaya extends super_yaya
    {
        public utos_block u;
        
        public superYaya(utos_block u)
        {
            this.u = u;
        }
        
        public String toString()
        {
            return "superYaya\n" + u.toString();
        }
    }
    
}