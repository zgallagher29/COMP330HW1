import java.util.*;
import java.io.*;

public class wordInfo{

   
    public String word;
    public int wordCount;
    
    
    public wordInfo(String word){
    this.word=word;
    wordCount=1;

}
    
    public void addCount(){
        wordCount=wordCount+1;
    }
    
public String getWord(){
    return word;
}

public int getWordCount(){
    return wordCount; 
}
    
}