import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;




public class REGEX_class {
 
 
 
 
 
 
 
  public void regex()  throws IOException{
    start();

}




public void start() throws IOException{
    String userFolderName="";
	
	System.out.println("What is the name of the folder/directory you want to use regex on?");
	
	Scanner keyboard = new Scanner(System.in);
	 
	userFolderName=keyboard.nextLine();
    
    int i =0;
     File dir = new File(userFolderName);
     File[] directoryListing = dir.listFiles();
    if (directoryListing != null) {
     
     System.out.println("Here are the listed files: ");
    for (File child : directoryListing) {
      	System.out.println(directoryListing[i]);
      	i++;
    }
    } else {
    
    System.out.println("No files here!");
    
  }
  
  
  
int mention_option =1;
keyboard = new Scanner(System.in);
String addedCharacter;
String in="";
i=0;
String regularexpressioncheck;
String regularexpressioncheck1;
String regularexpressioncheck2;
String regularexpressioncheck3;




//for loop for all the files in the directory
for(File child : directoryListing){
in=convertFileToString(directoryListing[i]);

//String m, m1, m2,m3
switch (mention_option) {
            
            case 1:  //topics
            System.out.println("Here are all the topics in the files that were parsed through");
           regularexpressioncheck="#\\w+";
           // regularexpressioncheck="([0-9A-Za-z][A-Za-z0-9])*"; //keywordchecker
           
           // regularexpressioncheck1="\\w+!";
            //regularexpressioncheck2="([!]+[A-Za-z0-9])\\w";
            //regularexpressioncheck3="[A-Za-z0-9]+[!]\\w"
            Pattern p= Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(in); //in is the string 
             while (m.find()) {
            System.out.println(m.group(0));//modify
           
             }
             
             
             
            // Pattern p2 = Pattern.compile(regularexpressioncheck2, Pattern.CASE_INSENSITIVE);
            // Matcher m2 = p2.matcher(in); //in is the string 
            // while (m2.find()) {
            // System.out.println(m2.group(1));//modify
            // }
             
            // Pattern p3 = Pattern.compile(regularexpressioncheck3, Pattern.CASE_INSENSITIVE);
            // Matcher m3 = p3.matcher(in); //in is the string 
            // while (m3.find()) {
            // System.out.println(m3.group(0));//modify
            // }
             
            
           
              
            
            
            
            case 2: //keywords
            regularexpressioncheck="[0-9A-Za-z][A-Za-z0-9]*";
            //regularexpressioncheck2="(['^']+[A-Za-z0-9]+['^';])\\w";
            //regularexpressioncheck3="([A-Za-z0-9]+['^'])\\w";
            System.out.println("Here are all the keywords in the files that were parsed through: ");
            p= Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
             while (m.find()) {
            System.out.println(m.group(0));//modify
             }
            // p2 = Pattern.compile(regularexpressioncheck2, Pattern.CASE_INSENSITIVE);
            // m2 = p2.matcher(in); //in is the string 
            // while (m2.find()) {
            // System.out.println(m2.group(1));//modify
            // }
             
            // p3 = Pattern.compile(regularexpressioncheck3, Pattern.CASE_INSENSITIVE);
            // m3 = p3.matcher(in); //in is the string 
            // while (m3.find()) {
            // System.out.println(m3.group(1));//modify
            // }
             
           
            
            
            case 3:  //mentions
            
            regularexpressioncheck = "@\\w+"; //since we're doing it all to search
            System.out.println("Here are all the mentions in the files that were parsed through: ");
            p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
            while (m.find()) {
            System.out.println(m.group(0));//modify
            }
            
            
            case 4:  //identifiers
            
            regularexpressioncheck = "!\\w+"; //since we're doing it all to search
            System.out.println("Here are all the identifiers in the files that were parsed through: ");
            p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
            while (m.find()) {
            System.out.println(m.group(0));//modify
            }
            
            
            
            case 5:  //identifiers
            
            regularexpressioncheck = "([^]+[A-Za-z0-9])\\w"; //since we're doing it all to search
            System.out.println("Here are all the references in the files that were parsed through: ");
            p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
            while (m.find()) {
            System.out.println(m.group(0));//modify
            }
            
            
            // case 4:  //topics
            // regularexpressioncheck1="#\\w+";
            // regularexpressioncheck2="(['#']]+[A-Za-z0-9])\\w";
            // regularexpressioncheck3="([A-Za-z0-9]+['#'])\\w";
            // System.out.println("Here are all the topics in the files that were parsed through: ");
            // p1= Pattern.compile(regularexpressioncheck1, Pattern.CASE_INSENSITIVE);
            // m1 = p1.matcher(in); //in is the string 
            // while (m1.find()) {
            // System.out.println(m1.group(0));//modify
            // }
            // // p2 = Pattern.compile(regularexpressioncheck2, Pattern.CASE_INSENSITIVE);
            // // m2 = p2.matcher(in); //in is the string 
            // // while (m2.find()) {
            // // System.out.println(m2.group(1));//modify
            // // }
             
            // // p3 = Pattern.compile(regularexpressioncheck3, Pattern.CASE_INSENSITIVE);
            // // m3 = p3.matcher(in); //in is the string 
            // // while (m3.find()) {
            // // System.out.println(m3.group(1));//modify
            // // }
             
           
            
            
            
            
            
            
            // case 5: //keywords
            // System.out.print("Here are all the keywords in the files that were parsed through: ");
            // regularexpressioncheck = "([0-9A-Za-z0-9])\\w"; //since we're doing it all to search
            // System.out.print("Here are all the keywords in the files that were parsed through: ");
            // p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            // m = p.matcher(in); //in is the string 
            // while (m.find()) {
            // System.out.println(m.group(1));//modify
            // }
             
             
             i++;
             
             
                                   }     }
                            




}

public void method2(HashMap<String,String> map){
    //write to file : "fileone"
    try{
    File fileTwo=new File("filetwo.txt");
    FileOutputStream fos=new FileOutputStream(fileTwo);
        PrintWriter pw=new PrintWriter(fos);

        for(Map.Entry<String,String> m :map.entrySet()){
            pw.println(m.getKey()+"="+m.getValue());
        }

        pw.flush();
        pw.close();
        fos.close();
    }catch(Exception e){}

    //read from file 
    try{
        File toRead=new File("filetwo.txt");
        FileInputStream fis=new FileInputStream(toRead);

        Scanner sc=new Scanner(fis);

        HashMap<String,String> mapInFile=new HashMap<String,String>();

        //read data from file line by line:
        String currentLine;
        while(sc.hasNextLine()){
            currentLine=sc.nextLine();
            //now tokenize the currentLine:
            StringTokenizer st=new StringTokenizer(currentLine,"=",false);
            //put tokens ot currentLine in map
            mapInFile.put(st.nextToken(),st.nextToken());
        }
        fis.close();

        //print All data in MAP
        for(Map.Entry<String,String> m :mapInFile.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }catch(Exception e){}
  }
 public String convertFileToString(File file)throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader (file));
    String         line = null;
    StringBuilder  stringBuilder = new StringBuilder();
    String         ls = System.getProperty("line.separator");

    try {
        while((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }

        return stringBuilder.toString();
    } finally {
        reader.close();
    }
    
    



}}
















































