
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.text.*;
import java.io.*;
import java.util.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class StartPage extends JFrame implements ActionListener {
    
    private JPanel panel;
    public JButton b1,b2;
    private JLabel jl1; 
    
    public StartPage(){
        setTitle("Quizz Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        jl1 = new JLabel("Log in as : "); 
        jl1.setFont(new Font("Arial", Font.PLAIN, 18)); 
        
        b1 = new JButton("Admin"); b1.addActionListener(this);
        b2 = new JButton("Student"); b2.addActionListener(this);
        
        panel = new JPanel();
        add(panel);
        panel.setLayout(null);
        panel.add(jl1);  jl1.setSize(150,50); jl1.setLocation(140, 30); 
        panel.add(b1);  b1.setSize(150,50); b1.setLocation(100, 80); 
        panel.add(b2); b2.setSize(150,50); b2.setLocation(100, 140); 
        
        
        setBounds(10, 300, 350, 300);
          setVisible(true); setResizable(false);
                        
    }
     
    
     public void actionPerformed (ActionEvent evt){
     String s = evt.getActionCommand();
      if (s.equals("Admin")) AdminLogin.getInstanceA(); 
      if (s.equals("Student")) StudentLogin.getInstanceS(); 
     }
    
    
     public void disableBTN(){
         b1.setEnabled(false);
         b2.setEnabled(false);
     }
         
    public static void main(String[] args) {
        new StartPage();
        
    }
    
}
