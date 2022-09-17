
import java.awt.Container;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class AfficherRes extends JFrame{
    private Container c; 
    private JLabel title, searchjl; 
     private JScrollPane scrolltable;
      private JTable table1;
      private JButton jbutt;
      private JTextField jtf;
      private TableRowSorter<TableModel> searcht;
   public AfficherRes(String origin) throws FileNotFoundException{
       
       setTitle("");
       setBounds(350, 10, 700, 690); 
      
       c = getContentPane(); 
       c.setLayout(null); 
       setResizable(false);
       setVisible(true);
      
        title = new JLabel("Results list "); 
        title.setFont(new Font("Academy Bold", Font.ITALIC + Font.BOLD, 22));
        title.setSize(400, 30); 
        title.setLocation(290, 20); 
        c.add(title); 


        searchjl = new JLabel("Search by name, num dossier or domaine :"); 
        searchjl.setFont(new Font("Arial", Font.PLAIN, 14)); 
        searchjl.setSize(500, 20); 
        searchjl.setLocation(200, 580); 
        c.add(searchjl);  
       
        
        jtf = new JTextField(""); 
        jtf.setFont(new Font("Arial", Font.PLAIN, 16)); 
        jtf.setSize(130, 20); 
        jtf.setLocation(270, 600);
        c.add(jtf);
        
      
       DefaultTableModel model = new DefaultTableModel();
          table1 = new JTable(model);
          
        searcht = new TableRowSorter<>(table1.getModel());
 
        table1.setDefaultEditor(Object.class, null);
      
         table1.setRowSorter(searcht);
        model.addColumn("Num Dossier");
        model.addColumn("Name");
        model.addColumn("Domaine");
        model.addColumn("Note /10");
        model.addColumn("Date");
        try{
            FileReader fr = new FileReader("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\results.txt"); 
            String[] words= null;
            BufferedReader br = new BufferedReader(fr);
            String s; 
            
            while((s=br.readLine())!=null)
      {
          
             words=s.split(" %20% ");
         
             if(origin.equals("admin")){
                   model.insertRow(0, new Object[] {words[0],words[1],words[2],words[3],words[4]});
             } else {
                 if (words[0].equals(origin)){
                     model.insertRow(0, new Object[] {words[0],words[1],words[2],words[3],words[4]});
                 }
             }
            
        }      
        br.close(); 
        fr.close();     
        }catch(Exception e){System.out.println(e);}
        
         
        scrolltable = new JScrollPane (table1);
        scrolltable.setLocation(10, 100);
        scrolltable.setSize(660, 450);
        add(scrolltable);
         scrolltable.setVisible(true);
         
         
          jtf.getDocument().addDocumentListener(new DocumentListener(){
                       
            public void insertUpdate(DocumentEvent e) {
                String text = jtf.getText();

                if (text.trim().length() == 0) {
                    searcht.setRowFilter(null);
                } else {
                    searcht.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

           
            public void removeUpdate(DocumentEvent e) {
                String text = jtf.getText();

                if (text.trim().length() == 0) {
                    searcht.setRowFilter(null);
                } else {
                    searcht.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

         
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

        });

         
         
         

   }
}