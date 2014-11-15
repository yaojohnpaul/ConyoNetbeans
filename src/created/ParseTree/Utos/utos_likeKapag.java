abstract class utos_likeKapag implements iNode 
{
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
            return "likeKapag(" + s.toString() + ")\n" + b.toString() + "\n" + t.toString();
        }
    }
}