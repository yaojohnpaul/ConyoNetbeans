package created.ParseTree.SabiSabi;

abstract class equality implements created.iNode
{
    public static class equal extends equality
    {
        public String kind; // will contain either != or == 
        
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
