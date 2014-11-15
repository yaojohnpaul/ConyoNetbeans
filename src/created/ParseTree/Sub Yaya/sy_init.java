abstract class sy_init implements iNode 
{
    public static class SubYayaInitialize extends sy_init
    {
        public reference_dt rd;
        public arte_init_list ai;
        
        public SubYayaInitialize(reference_dt rd, arte_init_list ai)
        {
            this.rd = rd;
            this.ai = ai;
        }
        
        public String toString()
        {
            return "brandNew " + rd.toString() + "(" + ai.toString() + ")";
        }
    }
    
}
