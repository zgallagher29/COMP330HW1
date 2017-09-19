import java.util.*;
import java.io.*;
import java.util.Scanner;


public class main {

  public static void main(String[] args){
   
   String searchChoice= userSearch();
   searchinFile(searchChoice);
     
  }

 

 
 public static String userSearch(){
  
  //asks user for what they want
  /*
  ! = UNIQUE identifier for note
^ = denotes a reference to another note by their unique identifier (above)
@ = mentions a PERSON, unique to the individual person
# = denotes a topic addressed in the note
[keywords] = "vocab words," or common words within a note
  */
int mention_option = 0;
Scanner keyboard = new Scanner(System.in);
do{
System.out.println("Are you looking for a 1. A Unique Identifier (!) 2. A Reference (^) 3. A Person (@) 4. A Topic (#) 5. Keyword ");
mention_option = keyboard.nextInt();
}while ((mention_option>5) || (mention_option <1));  //need to catch if it's not an integer


String searchWord= null;
String addedCharacter;

searchWord=keyboard.nextLine();//idk why this has to be there but it skips the switch statement if it's not there
switch (mention_option) {
            
            case 1:  
            addedCharacter = "!";
            System.out.print("1. What unique indentifier would you look like to search for? ");
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
return searchWord;
/*
System.out.print("(1) Would you like to look for a mention");
//mention_option = user_input.next( );


String keyword;
System.out.print("(2) Would you like to look for a keyword");
//keyword = user_input.next( );
  */

 }
 
 
 public static void searchinFile(String userWord){
    
    
     // The name of the file to open.
        String fileName = "kimktweets.txt";
        int totalMentions=0;

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
              
               
                if(line.contains(userWord)){
               
                System.out.println(line);
                totalMentions++;
                    
                }
               
               
            }
            System.out.println("There were " +totalMentions+ " occurances of " + userWord +" in Kim K's twitter feed.");

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
     
     
     
     
     
     
 }
 
 
 
 
 
}
 
 //UI?/Prompting the user to enter which option they want  //agreed^^^