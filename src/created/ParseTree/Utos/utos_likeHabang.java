package created.parseTree.Utos;

abstract class utos_likeHabang implements created.iNode  
{
    public static class likeHabang extends utos_likeHabang
    {
        public sabi_sabi s; 
        public utos_block u;
        
        public likeHabang(sabi_sabi s)
        {
            this.s = s;
            this.u = null;
        }
        
        public likeHabang(sabi_sabi s, utos_block u)
        {
            this.s = s;
            this.u = u;
        }
        
        public String toString()
        {
            return "likeHabang(" + s.toString() + ")\n" + u.toString(); 
        }
    }
}