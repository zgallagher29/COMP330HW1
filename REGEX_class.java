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
     
     System.out.println("Here are the listed keywords/mentions/identifiers/topics: ");
    for (File child : directoryListing) {
      	System.out.println(directoryListing[i]);
      	i++;
      
      	
      	
    }
    
   
    
    } else {
    
    System.out.println("Nothing here!");
    
  }
  
  System.out.println(i);

  
  
int mention_option =1;
keyboard = new Scanner(System.in);
String addedCharacter;
String in= "";
i=0;
String regularexpressioncheck;





//for loop for all the files in the directory
for(File child : directoryListing){
int count = 0;
in=convertFileToString(directoryListing[i]);
//String m, m1, m2,m3
regularexpressioncheck="(^[!@#$%^&* ][A-Za-z0-9!@#$%^&* ]*)";
regularexpressioncheck="[0-9A-Za-z][A-Za-z0-9]*"; //keywordchecker
Pattern p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
Matcher m = p.matcher(in); //in is the string 
             while (m.find()) {
                 count = m;
            System.out.println(m.group());
            System.out.println(m.group(count));
            //modify
             }

             
             
             
             
             
                                   }     }
                            






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

















































// ///*

// ([@][A-Za-z0-9])\w ----- mentions
// ([0-9A-Za-z0-9])\w --- keyword
// (['^']+[A-Za-z0-9])\w ---- references
// (['^']+[A-Za-z0-9]+[^])\w --references
// ([A-Za-z0-9]+['^'])\w  --- reference
// ([!]+[A-Za-z0-9]+[!])\w -- identifier
// ([!]+[A-Za-z0-9])\w -- identifier
// [A-Za-z0-9]+[!])\w -- identifier
// ([#]+[A-Za-z0-9]+[#])\w -- topic
// ([#]]+[A-Za-z0-9])\w -- topic
// [A-Za-z0-9]+[#])\w -- topic




// (['^']+[A-Za-z0-9]+[^])\w --references
// ([A-Za-z0-9]+['^'])\w  --- reference
// ([!]+[A-Za-z0-9]+[!])\w -- identifier
// ([!]+[A-Za-z0-9])\w -- identifier
// [A-Za-z0-9]+[!])\w -- identifier
// ([#]+[A-Za-z0-9]+[#])\w -- identifier
// ([#]]+[A-Za-z0-9])\w -- identifier
// [A-Za-z0-9]+[#])\w -- identifier";
// /*