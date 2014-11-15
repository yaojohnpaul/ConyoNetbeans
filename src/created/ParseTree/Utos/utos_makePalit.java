abstract class utos_makePalit implements iNode 
{
    public static class makePalit extends utos_makePalit
    {
        public sabi_sabi s; 
        public makePalit_MRW m;
        
        public makePalit(sabi_sabi s, makePalit_MRW m)
        {
            this.s = s;
            this.m = m;
        }
        
        public String toString()
        {
            return "makePalit(" + s.toString() + ")\n$\n" + m.toString() + "\n$"; 
        }
    }
}