
public class CheckIDP implements Interpreter{

   private Interpreter INTER1 = null;
   
   public CheckIDP(Interpreter INTER1) { 
      this.INTER1 = INTER1;
   }

    
    @Override
    public boolean interpret(String context) {
        return INTER1.interpret(context);
    }
    
}
