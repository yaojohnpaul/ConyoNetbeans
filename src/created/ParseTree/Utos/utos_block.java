abstract class utos_block implements iNode
{
    public static class utosBlock extends utos_block
    {
        public utos_block_opt uo;
        
        public utosBlock()
        {
            this.uo = null;
        }
        
        public utosBlock(utos_block_opt uo)
        {
            this.uo = uo;
        }
        
        public String toString()
        {
            return "$\n" + uo.toString() + "\n";
        }
    }
}