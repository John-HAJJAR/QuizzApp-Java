
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class OperationModify implements StrategyDP {

    @Override
    public int doOperation(String dom, String QCM, String Rep1, String Rep2, String Rep3, String CorrectAns) {
     System.out.println("hi from Modify");
     
             
        File oldFile = new File("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\questionslist.txt");
        File newFile = new File("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\temp.txt");
        String line = ""; String newline = ""; 
          try {
          FileWriter fw = new FileWriter("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\temp.txt", true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter pw = new PrintWriter(bw);
          Scanner x = new Scanner(new File("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\questionslist.txt"));
          x.useDelimiter("\n");
        while(x.hasNext())
        {    
            line = x.next();
            String[] words= null;
            words = line.split(" %20% ");
         
         if(words[0].trim().equals(dom))
          {
            for(int i=0; i<words.length; i++)
            {
               if(words[i].trim().equals(QCM)){
                   newline += QCM + " %20% " + Rep1 + " %20% " + Rep2 + " %20% " + Rep3 + " %20% " + CorrectAns + " %20% ";
                   System.out.println("if true"); 
                   i+=4;
               } else{
                  newline += words[i] + " %20% ";
                  System.out.println(newline); 
               }
            }
           pw.print(newline + "\n");
          }
         else {  pw.print(line + "\n"); }
          
        }
        
        
        x.close();
        pw.flush();
        pw.close();
        
        oldFile.delete();
       
       File temp2 = new File("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\questionslist.txt");
       newFile.renameTo(temp2);
       
        
        }catch(Exception e){System.out.println(e);}
        return -1;
    }
    
}
