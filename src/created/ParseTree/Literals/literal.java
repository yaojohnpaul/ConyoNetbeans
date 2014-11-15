package created.ParseTree.Literals;

abstract class literal implements created.iNode
{
    
    public static class Inty extends literal
    {
        public String value;
        
        public Inty(String value)
        {
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
        
    }
    
    public static class Floaty extends literal
    {
        public String value;
        
        public Floaty(String value)
        {
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
    }
    
    public static class Stringy extends literal
    {
        public String value;
        
        public Stringy(String value)
        {
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
    }
    
    public static class Chary extends literal
    {
        public String value;
        
        public Chary(String value)
        {
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
    }
    
    public static class Booly extends literal
    {
        public String value;
        
        public Booly(String value)
        {
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
    }
    
    public static class Waley extends literal
    {
        public String value;
        
        public Waley(String value)
        {
            this.value = value;
        }
        
        public String toString(){
            return value;
        }
    }
}