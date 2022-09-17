import java.lang.String;
public class Context {
    private StrategyDP strategy;

   public Context(StrategyDP strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(String dom, String QCM, String Rep1, String Rep2, String Rep3, String CorrectAns){
      strategy.doOperation(dom, QCM, Rep1, Rep2, Rep3, CorrectAns);
      return 1;
   }
}
