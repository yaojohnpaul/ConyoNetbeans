abstract class sabi_sabi_end implements iNode
{
    public static class ssEndValidVar extends sabi_sabi_end
    {
        public valid_var v;
        
        public ssEndValidVar(valid_var v)
        {
            this.v = v;
        }
        
        public String toString()
        {
            return v.toString;
        }
    }
    
    public static class ssEndUtos extends sabi_sabi_end
    {
        public utos_dec_val u;
        
        public ssEndUtos(utos_dec_val u)
        {
            this.u = u;
        }
        
        public String toString()
        {
            return u.toString;
        }
    }
    
    public static class ssEndLiteral extends sabi_sabi_end
    {
        public literal l;
        
        public ssEndLiteral(literal l)
        {
            this.l = l;
        }
        
        public String toString()
        {
            return l.toString;
        }
    }
    
}
/*
sabi_sabi_end ::= valid_var:v {: RESULT = new ssEndValidVar(v); :}
				| utos_dec_val:u {: RESULT = new ssEndUtos(u); :}
				| literal:l {: RESULT = new ssEndLiteral(l); :};
*/