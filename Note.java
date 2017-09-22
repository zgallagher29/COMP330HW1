

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

public class Note {

 List<String> fileName= new ArrayList<>();
 
 

public void start(){
    String userFolderName="";
	
	System.out.println("What is the name of the folder/directory?");
	
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
  
  
  
int mention_option = 0;
keyboard = new Scanner(System.in);
do{
System.out.println("Are you looking for a 1. A Unique Identifier (!) 2. A Reference (^) 3. A Person (@) 4. A Topic (#) 5. Keyword ");
mention_option = keyboard.nextInt();
}while ((mention_option>5) || (mention_option <1));  //need to catch if it's not an integer


String searchWord= null;
String addedCharacter;

searchWord=keyboard.nextLine();//idk why this has to be there but it skips the switch statement if it's not there
switch (mention_option) {
            
            case 1:  
            
            System.out.print("1. What unique indentifier would you look like to search for? (!,*,?,_etc.) ");
            addedCharacter=keyboard.nextLine();
             System.out.print("2. What keyword would you look like to search for? ");
            searchWord=keyboard.nextLine();
            searchWord=searchWord+addedCharacter;
            break;
            
            case 2: 
            addedCharacter = "^";
            System.out.print("2. What reference would you look like to search for? ");
            searchWord=keyboard.nextLine();
            searchWord=searchWord+addedCharacter;
            break;
            
            case 3:  
            addedCharacter = "@";
            System.out.print("3. Who would you look like to search for? ");
            searchWord=keyboard.nextLine();
            searchWord=addedCharacter+searchWord;
            break;
            
            case 4:  
            addedCharacter = "#";
            System.out.print("4. What topic would you look like to search for? ");
            searchWord=keyboard.nextLine();
            searchWord=addedCharacter+searchWord;
            break;
            
            case 5: 
             System.out.print("2. What keyword would you look like to search for? ");
             searchWord=keyboard.nextLine();
             break;
                                        }
                            
String line="";
int totalMentions=0;
int lineNumber=1;
i=0;
 for (File child : directoryListing){
    
      try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(directoryListing[i]);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
              
               
                if(line.contains(searchWord)){
               System.out.println("In line number "+ lineNumber+ ": ");
                System.out.println(line);
                totalMentions++;
                    
                }
                lineNumber++;
               
               
            }
            System.out.println("There were " +totalMentions+ " occurances of " + searchWord +" in " +directoryListing[i]);

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                directoryListing[i] + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + directoryListing[i] + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    i++;
    totalMentions=0;
    lineNumber=1;
}
}
}

 //ok so we need a function involving REGEX to parse through the files
 //Then we add these phrases + the file name to a hashmap
 //idk what to do about topological sort part








