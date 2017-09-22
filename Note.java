

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
 
 rTest test = new rTest();

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
  test.startRegex();
  
  
    
    
    
}





}


 //ok so we need a function involving REGEX to parse through the files
 //Then we add these phrases + the file name to a hashmap
 //idk what to do about topological sort part








