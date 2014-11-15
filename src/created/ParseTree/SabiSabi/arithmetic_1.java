abstract class arithmetic_1 implements iNode
{
    public static class arithmetic1 extends arithmetic_1
    {
        public String kind; // will contain either + or - 
        
        public arithmetic1(String type)
        {
            kind = type;
        }
        
        public String toString()
        {
            return kind;
        }
    }
    
}

