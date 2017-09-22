/*import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class main {


  public static void main(String[] args){

//[A-Z]
//[a-z]
//[0-9]

String string1= "Happy Birthday do you!!!! 123 83749 AAAA (444)-444-4444 blah blah blah hhhhhhhhhhh 111111111223333994949499202021-33-02.3.qASDFGHYUIUYTREKSL!!!!!!!!!!f.";
String string2 = "Bananas, bananas. This is bananas!!!! ******123";


//

RegEx_Tester("\\s[!!]\\s", string1);


}


public static void RegEx_Tester (String theRegex, String str2check) {
    
    Pattern tester_regex = Pattern.compile(theRegex);
    
    Matcher matcher_regex = tester_regex.matcher(str2check);
    
    while(matcher_regex.find()){
        if(matcher_regex.group().length() !=0){
    
            System.out.println(matcher_regex.group().trim());
            
        
        
        System.out.println("Start index:" + matcher_regex.start());
        System.out.println("End index:" + matcher_regex.end());

        
    }
     

}

   //String searchChoice= userSearch();
  // searchinFile(searchChoice);
     
//  }
/*
 

 
 public static String userSearch(){
  
  //asks user for what they want
  /*
  ! = UNIQUE identifier for note
^ = denotes a reference to another note by their unique identifier (above)
@ = mentions a PERSON, unique to the individual person
# = denotes a topic addressed in the note
[keywords] = "vocab words," or common words within a note
  
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
return searchWord;
/*
System.out.print("(1) Would you like to look for a mention");
//mention_option = user_input.next( );


String keyword;
System.out.print("(2) Would you like to look for a keyword");
//keyword = user_input.next( );
  */

 //}
 
 
//  public static void searchinFile(String userWord){
    
//     /*
    
//     1. Intialize a fle array
//     2. Ask for the first file
//     3. 
    
    
    
    
//     */
//      // The name of the file to open.
//      //string filename = "";
//      String [] filenamearray = new String[10];
//         Scanner keyboard = new Scanner(System.in);
        
//         //while? while the file name array = 0
//         //while loop here to ask the user to enter all the files they want 
    
//       int i=0;
//         //i = the number of elements in array
//         System.out.print("What is the filename you would like to search through?");//keep this here
//         filenamearray[i]=keyboard.nextLine();//keep
//         String addfile= "";
//         //i=1?
       
//         do{
          
          
          
          
//          //while there is only one element in the appended string array
         
//         // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array -- array append documentation
         
//         System.out.print("Would you like to add another file?");
//         addfile=keyboard.nextLine();
        
//         if(addfile.equals("yes")){
//          i++;   
         
         
//         System.out.print("What is the filename you would like to search through?");//keep this here
//         filenamearray[i]=keyboard.nextLine();}
        
//         else if(addfile.equals("no")){
//             break;
//         }
            
        
        
            
//         }while(!addfile.equals("no"));

//         int totalMentions=0;

//         // This will reference one line at a time
//         String line = null;


// //             //for ( ){//for loop here because the for loop will iterate through the amount of files the user wants
//         try {
//             // FileReader reads text files in the default encoding.
//             FileReader fileReader = 
//                 new FileReader(filenamearray[0]);

//             // Always wrap FileReader in BufferedReader.
//             BufferedReader bufferedReader = 
//                 new BufferedReader(fileReader);

//             while((line = bufferedReader.readLine()) != null) {
              
               
//                 if(line.contains(userWord)){
               
//                 System.out.println(line);
//                 totalMentions++;
                    
//                 }
               
               
//             }
//             System.out.println("There were " +totalMentions+ " occurances of " + userWord +" in " +filenamearray[0]);

//             // Always close files.
//             bufferedReader.close();         
//         }
//         catch(FileNotFoundException ex) {
//             System.out.println(
//                 "Unable to open file '" + 
//                 filenamearray[0] + "'");                
//         }
//         catch(IOException ex) {
//             System.out.println(
//                 "Error reading file '" 
//                 +  filenamearray[0] + "'");                  
//             // Or we could just do this: 
//             // ex.printStackTrace();
//         }
     
     
     
     
     
     
//  }
 
 
 
 
// }
 
//  //UI?/Prompting the user to enter which option they want  //agreed^^^*/


// /*
// import java.util.regex.*;
// import java.nio.file.DirectoryStream;
// import java.nio.file.Files;
// import java.nio.file.FileSystems;
// import java.nio.file.Path;
// import java.io.FilenameFilter;

// public class main{
	
// 	public static void main(String[] args){


		
// 		String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 "; 
// 		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		
// 		/*
// 		[ ]  Insert characters that are valid
// 		[^ ]  Insert characters that are not valid
// 		\\s  Any white space
// 		\\S  Any non white space
// 		{n,m}  Whatever proceeds must occur between n and m times
// 		*/
		
// 		// Word must contain letters that are 2 to 20 characters in length
// 		// [A-Za-z]{2,20} 0r \w{2,20}
		
// 		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
// 		/*
// 		\\d  Any digits 0-9
// 	 	\\D  Anything not a number
// 	 	{n}  Whatever proceeds must occur n times
// 	 	*/
		
// 		// Only 5 digits
// 		// \\s[0-9]{5}\\s or \\d{5}
		
// 		regexChecker("\\s\\d{5}\\s", longString);
		
// 		/*
// 		|  Is used for OR clause situations
// 		*/
		
// 		// Must start with a A or C, followed by 1 letter in brackets
// 		// Must be a maximum of 2 characters in length
// 		// A[KLRZ]|C[AOT]
		
// 		regexChecker("A[KLRZ]|C[AOT]", longString);
		
// 		/*
// 		{n,}  Whatever proceeds must occur at least n times
// 		+  Whatever proceeds must occur one or more times
// 		. ^ * + ? { } [ ] \ | ( )  Characters that must be escaped or backslashed
// 		*/
		
// 		// Grab any string that contains 1 or more !
		
// 		regexChecker("(\\{{1,})", strangeString);
// 		regexChecker("(\\{+)", strangeString);
		
// 		// Get anything that occurs 3 times except newline
// 		// .  Anything but newline
		
// 		regexChecker(".{3}", strangeString);
		
// 		/*
// 		\\w  Any word type character A-Z, a-z, 0-9, _
// 		\\W  Any non word character
// 		*  Occurs zero or more times
// 		*/
		
// 		regexChecker("\\w*", strangeString);
		
// 		regexChecker("@[A-Z]a-z0-9._\\%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", longString);
		
		
// 		// ?  0 or 1 of what proceeds it
		
// 		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);
		
// 		regexReplace(longString);
		
// 	}
	
// 	public static void regexChecker(String theRegex, String str2Check){
		
// 		// You define your regular expression (REGEX) using Pattern
		
// 		Pattern checkRegex = Pattern.compile(theRegex);
		
// 		// Creates a Matcher object that searches the String for
// 		// anything that matches the REGEX
		
// 		Matcher regexMatcher = checkRegex.matcher( str2Check );
		
// 		// Cycle through the positive matches and print them to screen
// 		// Make sure string isn't empty and trim off any whitespace
		
// 		while ( regexMatcher.find() ){
// 			if (regexMatcher.group().length() != 0){
// 				System.out.println( regexMatcher.group().trim() );
				
// 				// You can get the starting and ending indexs
				
// 				System.out.println( "Start Index: " + regexMatcher.start());
// 				System.out.println( "Start Index: " + regexMatcher.end());
// 			}
// 		}
		
// 		System.out.println();
// 	}
	
// 	public static void regexReplace(String str2Replace){
		
// 		// REGEX that matches 1 or more white space
		
// 		Pattern replace = Pattern.compile("\\s+");
		
// 		// This doesn't really apply, but this is how you ignore case
// 		// Pattern replace = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		
// 		// trim the string t prepare it for a replace
		
// 		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		
// 		// replaceAll replaces all white space with commas
		
// 		System.out.println(regexMatcher.replaceAll(", "));
		
// 	}
	
	

	
	
	
	
// }*/


import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;








public class main{
	
	
	
	public static void main(String[] args){
	
	Note newNote= new Note();
	newNote.start();
    
	
	}}
	
	