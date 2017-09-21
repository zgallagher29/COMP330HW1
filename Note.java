

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


public class Note{

 List<String> fileName= new ArrayList<>();

public void start(){
    String userFolderName="";
	
	System.out.println("What is the name of the folder/directory?");
	
	Scanner keyboard = new Scanner(System.in);
	 
	userFolderName=keyboard.nextLine();
    
    
    addFiles(userFolderName);
  
    
    
    
}



//adds files to Array 
//source : https://stackoverflow.com/questions/2532953/adding-file-names-to-an-array-list-in-java
public void addFiles(String dirName)throws IOException{
   
    File dir = new File(dirName);
    fileName = Arrays.asList(dir.list(
   new FilenameFilter() {
      @Override public boolean accept(File dir, String name) {
         return name.endsWith(".txt");
      }
   }
));

System.out.println("Here are the file names: "+fileName);
readIt(fileName);

}




public void readIt(List<String> dirName) throws IOException{
    String line="";
    for (int i = 0; i <dirName.size(); i++){
       
       
        FileReader fileReader = new FileReader(dirName.get(i));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while((line = bufferedReader.readLine()) != null) {
              if(line.contains("sushi")){
               
                System.out.println(line);
           
                    
                }
                
    }
        fileReader.close();
    
    
}
}


 //ok so we need a function involving REGEX to parse through the files
 //Then we add these phrases + the file name to a hashmap
 //idk what to do about topological sort part


}





