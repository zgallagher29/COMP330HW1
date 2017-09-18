import java.util.*;
import java.io.*;
 
public class main {

  public static void main(String[] args){
   System.out.println("bruuuuuuuh");
   userPrompts();
      // The name of the file to open.
        String fileName = "kimktweets.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
   //reading in file 
  }

 

 
 public static void userPrompts(){
  
  //asks user for what they want
  
  
String mention_option;
System.out.print("(1) Would you like to look for a mention");
//mention_option = user_input.next( );


String keyword;
System.out.print("(2) Would you like to look for a keyword");
//keyword = user_input.next( );
  

 }
 
}
 
 //UI?/Prompting the user to enter which option they want  //agreed^^^