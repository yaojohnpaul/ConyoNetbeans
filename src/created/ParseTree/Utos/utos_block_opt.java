abstract class utos_block_opt implements iNode
{
    public static class utosBlockOpt extends utos_block_opt
    {
        public block_content b;
        
        public utosBlockOpt()
        {
            this.b = null;
        }
        
        public utosBlockOpt(block_content b)
        {
            this.b = b;
        }
        
        public String toString()
        {
            return b.toString();
        }
    }
}