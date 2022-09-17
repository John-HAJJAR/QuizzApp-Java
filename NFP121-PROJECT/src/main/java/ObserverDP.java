
import java.util.Observable;
import java.util.Observer;


public class ObserverDP extends Observable {
   
    private String num_doss = "";
    private String name = "";
    
    
    
    public String getDoss() {
      return num_doss;
   }
    
    public String getName() {
      return name;
   }

   public void setState(String doss, String name) {
      this.num_doss = doss;
      this.name = name;
       setChanged();
       notifyObservers();
   }
   
  
        
}
