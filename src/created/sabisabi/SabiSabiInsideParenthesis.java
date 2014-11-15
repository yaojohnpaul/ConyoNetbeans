class SabiSabiInsideParenthesis1 implements iNode {
  SabiSabi exp1, exp2;            // left and right subexpression 
  String kind;                  // comparison operator

  public SabiSabiInsideParenthesis1(SabiSabi e1, String type, SabiSabi e2) {
    exp1=e1;
    kind=type;
    exp2=e2;
  }

  public String toString() {
      return "("+exp1+kind+exp2+")";

  }

  public boolean interpret(int[] in, int[] par) {
    //int e1 = exp1.interpret();
    //int e2 = exp2.interpret();
    switch(kind) {
    case "+": return(e1+e2);
    case "-": return(e1-e2);
    }

    return(false);     // error
  }
}