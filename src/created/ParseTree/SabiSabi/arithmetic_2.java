abstract class arithmetic_2 implements iNode
{
    ublic static class arithmetic2 extends arithmetic_2
    {
        public String kind; // will contain either /, * or % 
        
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