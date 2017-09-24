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
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;



//SOURCE: https://www.programcreek.com/2013/03/java-sort-map-by-value/
//SOURCE: https://stackoverflow.com/questions/30470031/java-writing-a-treemap-to-a-text-file
//Source: https://stackoverflow.com/questions/1053467/how-do-i-save-a-string-to-a-text-file-using-java

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
String convert="";
List<wordInfo> wordMatch = new ArrayList<wordInfo>();
HashMap<String, Integer> myMap = new HashMap<String, Integer>();
int locationOfMatch=0;


for(File child : directoryListing){
    in=convertFileToString(directoryListing[i]);
String strFileName = child.getName();




System.out.println("Name of file is "+ in);
int referenceCount=0;
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
            if(isInArray(wordMatch, convert)){
               locationOfMatch= getIndex(wordMatch, convert);
               wordMatch.get(locationOfMatch).addCount();
                
                
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
            convert=m.group(0).toString();
            if(isInArray(wordMatch, convert)){
               locationOfMatch= getIndex(wordMatch, convert);
               wordMatch.get(locationOfMatch).addCount();
                
                
            }
            else{
            wordMatch.add(new wordInfo (convert));}
        
             }
             
             
             
             
             
             
            case 3:  //mentions
            
            regularexpressioncheck = "@\\w+"; //since we're doing it all to search
            System.out.println("Here are all the mentions in the files that were parsed through: ");
            p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
             while (m.find()) {
            System.out.println(m.group(0));//modify
            convert=m.group(0).toString();
            if(isInArray(wordMatch, convert)){
               locationOfMatch= getIndex(wordMatch, convert);
               wordMatch.get(locationOfMatch).addCount();
                
                
            }
            else{
            wordMatch.add(new wordInfo (convert));}
        
             }
             
            case 4:  //identifiers
            regularexpressioncheck = "!\\w+"; //since we're doing it all to search
            System.out.println("Here are all the identifiers in the files that were parsed through: ");
            p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
             while (m.find()) {
            System.out.println(m.group(0));//modify
            convert=m.group(0).toString();
            if(isInArray(wordMatch, convert)){
               locationOfMatch= getIndex(wordMatch, convert);
               wordMatch.get(locationOfMatch).addCount();
                
                
            }
            else{
            wordMatch.add(new wordInfo (convert));}
        
             }
            
            
            case 5:  //references
            
            //regularexpressioncheck="(^[!@#$%^&* ][A-Za-z0-9]*)";
            
            regularexpressioncheck ="[\\^][A-Za-z0-9]*"; //since we're doing it all to search
            System.out.println("Here are all the references in the files that were parsed through: ");
            p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
            m = p.matcher(in); //in is the string 
             while (m.find()) {
            System.out.println(m.group(0));//modify
            convert=m.group(0).toString();
            if(convert.contains("^")){
                referenceCount++;
            }
            if(isInArray(wordMatch, convert)){
               locationOfMatch= getIndex(wordMatch, convert);
               wordMatch.get(locationOfMatch).addCount();
                
                
            }
            else{
            wordMatch.add(new wordInfo (convert));}
        
             }
    
              myMap.put(strFileName,referenceCount);
             System.out.println("The reference count for this file is "+ referenceCount);
             i++;
             
             
                                   }     }
                                   printArray(wordMatch);
                                   
            System.out.println("------------------");
            System.out.println("Topologically sorting the files......");
                Topologicalsort(myMap);             

                
}


public void printArray(List<wordInfo>matches){
    
    System.out.println("--------------");
    System.out.println("Here is a list of common words between all the files: ");
    for(int n=0; n<matches.size(); n++){
       if( matches.get(n).getWordCount()>1){
         System.out.println("--");
         System.out.println("Word: "+matches.get(n).getWord()+"    Ammount of time it occurs: "+ matches.get(n).getWordCount());
       }   
    }
}

public boolean isInArray(List<wordInfo>match, String name){
   
    
    for(int x=0; x<match.size();x++){
        if(match.get(x).getWord().equals(name)){
            return true;
        }
        
    }
    return false;
    
    
}


public int getIndex(List<wordInfo>match, String name){
    
    
    for(int x=0; x<match.size();x++){
        if(match.get(x).getWord().equals(name)){
            return x;
        }
        
    }
    return 0;
    
    
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
 }
    
    
    public void Topologicalsort (HashMap<String, Integer> map) {
       
       //We need to sort the references (files) and make the one with the most go in last
        //We need to pop or retrieve the the files
        
    TreeMap<String, Integer> sortedMap = sortMapByValue(map);  
		System.out.println(sortedMap);
    }
        
        
        public TreeMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
		Comparator<String> comparator = new ValueComparator(map);
		//TreeMap is a map sorted by its keys. 
		//The comparator is used to sort the TreeMap by keys. 
		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
		result.putAll(map);
		String resultsString=result.toString();
		//System.out.println(results);
		System.out.println("Here's the files topologically sorted. It has also been written to a file called topoSorted.txt. Thanks!");
		WritetoFile(resultsString);
		return result;
	}
	//Source: https://stackoverflow.com/questions/1053467/how-do-i-save-a-string-to-a-text-file-using-java
	
    
	
	
	public void WritetoFile(String resultsInString) {
    
       try{
    File file=new File("topoSorted.txt");
    FileOutputStream fos=new FileOutputStream(file);
        PrintWriter pw=new PrintWriter(fos);
        pw.println("The file name comes first followed by the amount of references it has.");
      pw.println(resultsInString);

        pw.flush();
        pw.close();
        fos.close();
    }catch(Exception e){}

}
	    
	    
	
	
	
 
    
}



class ValueComparator implements Comparator<String>{
 
	HashMap<String, Integer> map = new HashMap<String, Integer>();
 
	public ValueComparator(HashMap<String, Integer> map){
		this.map.putAll(map);
	}
 
	@Override
	public int compare(String s1, String s2) {
		if(map.get(s1) >= map.get(s2)){
			return -1;
		}else{
			return 1;
		}	
	}
	
}	
	
























