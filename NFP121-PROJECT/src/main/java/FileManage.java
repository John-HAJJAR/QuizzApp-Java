
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FileManage {
    
  public static void FileWriteStudentAccs (String NumDoss, String FN, String pass) throws IOException{
     
            FileWriter fw= new FileWriter("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\studentsacc.txt", true);
        
            String dataa123 = NumDoss + " ; " + FN + " ; " + pass;
           
          fw.write(dataa123);
          fw.write("\n");
           
          fw.close();
      
  }
  
  
  public static void FileWriteDomaine (String dom) throws IOException{
       FileWriter fw= new FileWriter("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\domainelist.txt", true);
        
            String dataa123 = dom ;
           
          fw.write(dataa123);
          fw.write("\n");
          fw.close();
  }
  
  public static ArrayList<String> FileReadDomaine() throws IOException {
       FileReader fr;
	ArrayList<String> strings = new ArrayList<String>(); 
        try {
            fr = new FileReader("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\domainelist.txt");
            BufferedReader br = new BufferedReader(fr);
            String s; 
            while((s=br.readLine())!=null) 
            {
            	strings.add(s);
            }
            br.close();
            fr.close();
        }catch(Exception e){System.out.print(e);}
            return strings;
}
   
    public static String[] GetQCM(String dom) throws IOException {
         FileReader fr;
         String [] errorarr= new String[1];
         errorarr[0] = "Error Test";
        try {
            fr = new FileReader("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\questionslist.txt");
            String[] words= null;
            BufferedReader br = new BufferedReader(fr);
            String s; 
            while((s=br.readLine())!=null) 
            {
             words=s.split("%20%"); 
             
              if(words[0].trim().equals(dom))
              {
                   br.close(); fr.close(); 
                   return words;
              } else {
                  continue;
              }
            }
            br.close();
            fr.close();
        }catch(Exception e){System.out.print(e);}
      return errorarr;
    }
  
   
    public static void ExamFinished(String num, String name, String dom, String notes) throws IOException{
        FileWriter fw= new FileWriter("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\results.txt", true);
        
        LocalDate myObj1 = LocalDate.now();
        String myObj2 = LocalTime.now().getHour() + ":" + LocalTime.now().getMinute();
        String date = myObj1 + " " + myObj2;
        String dataa123 = num + " %20% " + name + " %20% " + dom + " %20% " + notes + " %20% " + date;
           
        fw.write(dataa123);
        fw.write("\n");
        fw.close();
    }
    
    public static String[] SearchStudent(String numdoss, String pass){
         FileReader fr;
         String [] errorarr= new String[1];
         errorarr[0] = "Error Test";
        try {
            fr = new FileReader("C:\\Users\\John\\Desktop\\NFP121-PROJECT\\src\\main\\java\\studentsacc.txt");
            String[] words= null;
            BufferedReader br = new BufferedReader(fr);
            String s; 
            while((s=br.readLine())!=null) 
            {
             words=s.split(" ; "); 
             if (words[0].equals(numdoss)){
                 if (words[2].equals(pass)){
                     return words;
                 }
                 
             }
             
            }
            br.close();
            fr.close();
        }catch(Exception e){System.out.print(e);}
      return errorarr;
    }
    
    
    

       
  }
   
