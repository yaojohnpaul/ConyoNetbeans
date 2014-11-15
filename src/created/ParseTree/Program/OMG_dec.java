abstract class OMG_dec implements iNode 
{
    public static class OMG extends OMG_dec
    {
        String id; //Constant name
        SabiSabi ss; //Expression, value of constant
        
        public OMG(String id, SabiSabi ss)
        {
            this.id = id;
            this.ss = ss;
        }
    
        public String toString()
        {
            return id;
        }
        
        /**
         * Get the value of the constant.
         * @return Constant value.
         */
        public SabiSabi getValue()
        {
            return ss;
        }
    }
}