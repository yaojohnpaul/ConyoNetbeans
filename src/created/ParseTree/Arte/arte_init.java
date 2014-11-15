abstract class arte_init implements iNode 
{
    public static class arrayInit extends arte_init
    {
        public array_init a; 
        
        public arrayInit(array_init a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString;
        }
    }
    
    public static class syInit extends arte_init
    {
        public sy_init sy; 
        
        public syInit(sy_init sy)
        {
            this.sy = sy;
        }
        
        public String toString()
        {
            return sy.toString;
        }
    }
    
    public static class sabiInit extends arte_init
    {
        public sabi_sabi s; 
        
        public sabiInit(sabi_sabi s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return s.toString;
        }
    }
}