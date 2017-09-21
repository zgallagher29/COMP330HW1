package TwitterParser;

import java.util.*;
import java.io.*;
import java.io.File;
import java.util.List;



public class Note{


String folderName="";

public static void start(){
  
    List<String> fileName= new ArrayList<>();
    addFiles();
    printOutFiles();
    
    
    
}

public static void setFolderName(String newFolderName){
    String folderName;
    folderName=newFolderName;
}

public String getFolderName(){
    return folderName;
}

//adds files to Array 
public static void addFiles(){
    File dir = new File(folderName);
    fileName = Arrays.asList(dir.list(
   new FilenameFilter() {
      @Override public boolean accept(File dir, String name) {
         return name.endsWith(".txt");
      }
   }
));


}


//prints out the files in the directory 
public static void printOutFiles(){
    System.out.println(fileName);
    
}

}