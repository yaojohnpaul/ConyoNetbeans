abstract class utos_makeKuha implements iNode 
{
    public static class makeKuha extends utos_makeKuha
    {
        public valid_var vv; 
        public arte_assign a;
        
        public makeKuha(valid_var vv, arte_assign a)
        {
            this.vv = vv;
            this.a = a;
        }
        
        public String toString()
        {
            return vv.toString() + " " + a.toString();
        }
    }
}