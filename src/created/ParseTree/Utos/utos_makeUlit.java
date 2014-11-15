package created.parseTree.Utos;

abstract class utos_makeUlit implements created.iNode  
{
    public static class makeUlit extends utos_makeUlit
    {
        public utos_makeKuha m1; 
        public utos_makeKuha m2;
        public sabi_sabi_for s1;
        public sabi_sabi_for s2;
        public utos_block u;
        
        public makeUlit(utos_makeKuha m1, sabi_sabi_for s1, utos_makeKuha m2, utos_block u)
        {
            this.m1 = m1;
            this.m2 = m2;
            this.s1 = s1;
            this.s2 = null;
            this.u = u;
        }
        
        public makeUlit(utos_makeKuha m1, sabi_sabi_for s1, sabi_sabi_for s2, utos_block u)
        {
            this.m1 = m1;
            this.m2 = null;
            this.s1 = s1;
            this.s2 = s2;
            this.u = u;
        }
        
        public String toString()
        {
            if(m2 != null)
                return "makeUlit(" + m1.toString() + " db " + s1.toString() + " " + m2.toString() + ")\n" + u.toString();
            else if(s2 != null)
                return "makeUlit(" + m1.toString() + " db " + s1.toString() + " " + s2.toString() + ")\n" + u.toString();
        }
    }
}