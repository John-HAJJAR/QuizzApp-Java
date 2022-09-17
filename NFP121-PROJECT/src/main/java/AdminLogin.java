
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;


public class AdminLogin extends LoginJFrame {
    protected String U1 = "admin";
    protected String P1 = "123"; 
    

    @Override
    public void setTitle(String title) {
        super.setTitle("Admin Login"); 
         
    }
 
   void b1ActionPerformed(java.awt.event.ActionEvent evt){
       if(jt1.getText().equals(U1) && jt2.getText().equals(P1)){
            System.out.println("Admin has logged in");
            dispose();
            new AdminPage();
       } else {
           showMessageDialog(null, "Wrong username or passsword !");
           
       }
       
     
       
   }

   
    

}

  