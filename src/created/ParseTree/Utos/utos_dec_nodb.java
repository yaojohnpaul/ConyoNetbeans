package created.parseTree.Utos;

abstract class utos_dec_nodb implements created.iNode  
{
    public static class utosLikeKapag extends utos_dec_nodb
    {
        public utos_likeKapag uk; 
        
        public utosLikeKapag(utos_likeKapag uk)
        {
            this.uk = uk;
        }
        
        public String toString()
        {
            return uk.toString();
        }
    }
    
    public static class utosMakePalit extends utos_dec_nodb
    {
        public utos_makePalit up; 
        
        public utosMakePalit(utos_makePalit up)
        {
            this.up = up;
        }
        
        public String toString()
        {
            return up.toString;
        }
    }
    
    public static class utosLikeHabang extends utos_dec_nodb
    {
        public utos_likeHabang uh; 
        
        public utosLikeHabang(utos_likeHabang uh)
        {
            this.uh = uh;
        }
        
        public String toString()
        {
            return uh.toString;
        }
    }
    
    public static class utosMakeGawaHabang extends utos_dec_nodb
    {
        public utos_makeGawaHabang ugh; 
        
        public utosMakeGawaHabang(utos_makeGawaHabang ugh)
        {
            this.ugh = ugh;
        }
        
        public String toString()
        {
            return ugh.toString;
        }
    }
    
    public static class utosMakeUlit extends utos_dec_nodb
    {
        public utos_makeUlit uu; 
        
        public utosMakeUlit(utos_makeUlit uu)
        {
            this.uu = uu;
        }
        
        public String toString()
        {
            return uu.toString;
        }
    }
    
    public static class utosMakeArte extends utos_dec_nodb
    {
        public utos_makeArte ua; 
        
        public utosMakeArte(utos_makeArte ua)
        {
            this.ua = ua;
        }
        
        public String toString()
        {
            return ua.toString;
        }
    }
}