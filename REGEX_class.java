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
String convert="";
List<wordInfo> wordMatch = new ArrayList<wordInfo>();

for(File child : directoryListing){
in=convertFileToString(directoryListing[i]);

//String m, m1, m2,m3
switch (mention_option) {
            
            case 1:  //topics
            System.out.println("Here are all the topics in the files that were parsed through");
            regularexpressioncheck="#\\w+";
            Pattern p= Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(in); //in is the string 
             while (m.find()) {
            System.out.println(m.group(0));//modify
            convert=m.group(0).toString();
            if(wordMatch.contains(convert)){
                System.out.println("match founds!");
            }
            else{
            wordMatch.add(new wordInfo (convert));}
        
             }
             

            
            case 2: //keywords
            regularexpressioncheck="[0-9A-Za-z][A-Za-z0-9]*";
            
            System.out.println("Here are all the keywords in the files that were parsed through: ");
            p= Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
             while (m.find()) {
            System.out.println(m.group(0));//modify
             }
     
            
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
            System.out.println(m.group(0));
       
            }
            
            
            
            case 5:  //references
            
            //regularexpressioncheck="(^[!@#$%^&* ][A-Za-z0-9]*)";
            
            regularexpressioncheck ="[\\^][A-Za-z0-9]*"; //since we're doing it all to search
            System.out.println("Here are all the references in the files that were parsed through: ");
            p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
            while (m.find()) {
            System.out.println(m.group(0));//modify
            }
            
    
             
             i++;
             
             
                                   }     }
                            


}




public boolean isInArray(List<wordInfo>match, String )







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














































