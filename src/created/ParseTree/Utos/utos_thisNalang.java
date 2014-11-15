abstract class utos_thisNalang implements iNode 
{
    public static class thisNalang extends utos_thisNalang
    {
        public utos_block b; 
        
        public thisNalang()
        {
            this.b = null;
        }
        
        public thisNalang(utos_block b)
        {
            this.b = b;
        }
        
        public String toString()
        {
            return "thisNalang\n" + b.toString();
        }
    }
    
    public static class likeKapag extends utos_likeKapag
    {
        public sabi_sabi s;
        public utos_block b;
        public utos_thisNalang t;
        
        public likeKapag(sabi_sabi s, utos_block b, utos_thisNalang t)
        {
            this.s = s;
            this.b = b;
            this.t = t;
        }
        
        public String toString()
        {
            return "thisNalangKapag(" + s.toString() + ")\n" + b.toString() + "\n" + t.toString();
        }
    }
}