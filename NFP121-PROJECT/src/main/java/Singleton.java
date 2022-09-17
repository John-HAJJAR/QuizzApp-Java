
import java.awt.event.ActionEvent;


public class Singleton{
    
   private static Singleton instanceS = new Singleton();


   private Singleton(){
       
   }

   
   public static Singleton getInstance(){
         if (instanceS == null)
            instanceS = new Singleton();
        return instanceS;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
