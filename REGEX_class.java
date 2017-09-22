import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class regTest {
 
 
 
 
 
 
 
  public void startRegex() {
    String in = "Let's match 127.0.0.1 being valid, or this IP: 127.0.0.1 and joinTHIS.server.com or build 1.2";
    String regularexpressioncheck = "\\b((?:(?:[0-9]{1,3}\\.){3}[0-9]{1,3}|(?:[a-z0-9]+(?:-[a-z0-9]+)*\\.)+[a-z]{2,4}))\\b"; //since we're doing it all to search
    //in one string we need to search through and say like '+' so that it looks for multiple
    
    Pattern p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(in);
    while (m.find()) {
      System.out.println(m.group(1));
    }
  }
}


