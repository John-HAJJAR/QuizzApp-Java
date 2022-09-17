
import static javax.swing.JOptionPane.showMessageDialog;


public class StudentLogin extends LoginJFrame{
    
    public ObserverDP OBS;
    
    @Override
    public void setTitle(String title) {
        super.setTitle("Student Login"); 
    }
    
   void b1ActionPerformed(java.awt.event.ActionEvent evt){
       System.out.println("Student has logged in");
       String numdoss = jt1.getText();
       String pass = jt2.getText();
       
       String [] arr = FileManage.SearchStudent(numdoss, pass);   
       if (arr[0].equals("Error Test")){
           showMessageDialog(null, "Wrong dossier or passsword !");
       } else {
            OBS = new ObserverDP();
            OBS.setState(numdoss, arr[1]);
            new StudentForm(OBS);
            dispose();
       }
      
       
       
   }
}
