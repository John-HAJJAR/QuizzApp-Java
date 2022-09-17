
public class TermIDP implements Interpreter {
	
   private String data;

   public TermIDP(String data){
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {
   
       
      if(context.equals(data)){
         return true;
         
      }
      return false;
   }
}