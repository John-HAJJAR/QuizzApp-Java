
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import static javax.swing.JOptionPane.showMessageDialog;


public class StudentForm extends javax.swing.JFrame {

    public StudentForm(ObserverDP OBS) {
        initComponents();
        setVisible(true);
        setResizable(false);
        jButton1.setEnabled(false);
        
        NameofStudent = OBS.getName();
        SName.setText(NameofStudent);
        
        num_doss = OBS.getDoss();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {



	
	ArrayList<String> strings = new ArrayList<String>(); 
	  try {
            strings = FileManage.FileReadDomaine();
        } catch (IOException ex) {
            Logger.getLogger(CreateStudentAcc.class.getName()).log(Level.SEVERE, null, ex);
        }

	

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        QLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        QLabel3 = new javax.swing.JLabel();
        QLabel4 = new javax.swing.JLabel();
        QLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new JList(strings.toArray());
	jList1.setSelectedIndex(0);
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Welcome,");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Java Quiz");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.blue);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Choisir la bonne reponse");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Question no :");

        QLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QLabel.setText("Question");
        QLabel.setBorder(new javax.swing.border.MatteBorder(null));

        jRadioButton1.setText("Reponse 1");

        jRadioButton2.setText("Reponse 2");

        jRadioButton4.setText("Reponse 3");
	G2 = new ButtonGroup();
	G2.add(jRadioButton1);
	G2.add(jRadioButton2);
	G2.add(jRadioButton4);



        QLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        QLabel3.setText("1");
        QLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        QLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        QLabel4.setText("2");
        QLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        QLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        QLabel5.setText("3");
        QLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(QLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(QLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(QLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Choisir le domaine de Quizz");

        SName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SName.setText("names");
        jList1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jScrollPane1.setViewportView(jList1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Start exam");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Voir Notes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SName))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 36, Short.MAX_VALUE)))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SName)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Interpreter CorrectAns;
    public Interpreter getCheckAns() throws IOException{
   
        CorrectAns = new TermIDP(FullQ[4].trim());
        return new CheckIDP(CorrectAns);
        
   }    
    
    public int qr = 0;
    public int qw = 0;
    public int qu = 0;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int corrans = ButtonSelected();
        String s = corrans + "";
        try {
            Interpreter isCorrect = getCheckAns();
        } catch (IOException ex) {
            Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean b = CorrectAns.interpret(s);
        
        if (b == true){qr++;}
        if (b == false){qw++;}
        if (s.equals("0")) {qu++;}
        G2.clearSelection();
        questions.remove(random_int);
        if(questions.isEmpty() || num_quest == 10){
             showMessageDialog(null, "No more questions. \n Questions corr : " + qr + "\n Questions wrong : " + qw + "\n Unanswered quet : " + qu );
             String dom = (String) jList1.getSelectedValue(); 
           try {
               FileManage.ExamFinished(num_doss, NameofStudent, dom, qr + "");
           } catch (IOException ex) {
               Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
           }
             jButton1.setEnabled(false);
             jButton2.setEnabled(true);
             
        } else {
        SetQuest();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
 private int ButtonSelected(){
    int button = 0;
        if(jRadioButton1.isSelected()){
            button = 1;
        }else if(jRadioButton2.isSelected()){
            button = 2;
        }
        else if(jRadioButton4.isSelected()){
            button = 3;
        }
        
    return button;
 }
     
    public void createArrays() throws IOException {
       String selectedDom = (String) jList1.getSelectedValue();
       arr = FileManage.GetQCM(selectedDom);
       questions = new ArrayList<>();
       for (int i=1; i<arr.length; i+=5){
           if(arr[i].equals(" ")){continue;}
           else {
          questions.add(arr[i]);
           }
       }
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            new AfficherRes(num_doss);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public int random_int;
    public int num_quest;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            createArrays();
        } catch (IOException ex) {
            Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        num_quest = 0;
        SetQuest();
        qr = 0;
        qw = 0;
        qu = 0;
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void SetQuest(){
        System.out.println(questions.size());
        Random r = new Random();
        int low = 0;
        int high = questions.size();
        int rand = r.nextInt(high-low) + low;
        random_int = rand; 
        num_quest++;
        System.out.println(random_int);
        FullQ = updateQuestion(random_int);
        try {
            getCheckAns();
        } catch (IOException ex) {
             Logger.getLogger(StudentForm.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }
    
    
    
    
    
    public String [] updateQuestion(int i){
        String [] FullQCM = new String [5];
        String q = questions.get(i);
        QLabel.setText(q);
        
        for (int k=1; k<arr.length; k+=5){
            if(arr[k].equals(q)){
                for(int m=0; m<5; m++){
                    FullQCM[m] = arr[k+m];
                }
            }
        }
        
        QLabel3.setText(FullQCM[1]);
        QLabel4.setText(FullQCM[2]);
        QLabel5.setText(FullQCM[3]);
        
        return FullQCM;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QLabel;
    private javax.swing.JLabel QLabel3;
    private javax.swing.JLabel QLabel4;
    private javax.swing.JLabel QLabel5;
    private javax.swing.JLabel SName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    public String [] arr;
    public ArrayList<String> questions;
    public String [] FullQ;
    public String NameofStudent;
    public String num_doss;
    public ButtonGroup G2;
}
