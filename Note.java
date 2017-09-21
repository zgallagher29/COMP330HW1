

import java.util.*;
import java.io.*;
import java.io.File;
import java.util.List;



public class Note{


public static void start(){
    String userFolderName="";
	
	System.out.println("What is the name of the folder/directory?");
	
	Scanner keyboard = new Scanner(System.in);
	 
	userFolderName=keyboard.nextLine();
    
    
    addFiles(userFolderName);
  
    
    
    
}



//adds files to Array 
public static void addFiles(String dirName){
    List<String> fileName= new ArrayList<>();
    File dir = new File(dirName);
    fileName = Arrays.asList(dir.list(
   new FilenameFilter() {
      @Override public boolean accept(File dir, String name) {
         return name.endsWith(".txt");
      }
   }
));

System.out.println(fileName);


}



}