import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;





public class REGEX_class {
 
 
 
 
 
 
 
  public static void main(String[] args) {
    String in = "Let's match 127.0.0.1 being valid, or this IP: 127.0.0.1 and joinTHIS.server.com or build 1.2";
    String regularexpressioncheck = "([@][A-Za-z0-9]+[0-9A-Za-z0-9]+['^']+[A-Za-z0-9])\\w"; //since we're doing it all to search
    //in one string we need to search through and say like '+' so that it looks for multiple
    
    Pattern p = Pattern.compile(regularexpressioncheck, Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(in);
    while (m.find()) {
      System.out.println(m.group(1));
    }
  }
}




// ///*

// ([@][A-Za-z0-9])\w ----- mentions
// ([0-9A-Za-z0-9])\w --- keyword
// (['^']+[A-Za-z0-9])\w ---- references
// (['^']+[A-Za-z0-9]+[^])\w --references
// ([A-Za-z0-9]+['^'])\w  --- reference
// ([!]+[A-Za-z0-9]+[!])\w -- identifier
// ([!]+[A-Za-z0-9])\w -- identifier
// [A-Za-z0-9]+[!])\w -- identifier
// ([#]+[A-Za-z0-9]+[#])\w -- identifier
// ([#]]+[A-Za-z0-9])\w -- identifier
// [A-Za-z0-9]+[#])\w -- identifier




// (['^']+[A-Za-z0-9]+[^])\w --references
// ([A-Za-z0-9]+['^'])\w  --- reference
// ([!]+[A-Za-z0-9]+[!])\w -- identifier
// ([!]+[A-Za-z0-9])\w -- identifier
// [A-Za-z0-9]+[!])\w -- identifier
// ([#]+[A-Za-z0-9]+[#])\w -- identifier
// ([#]]+[A-Za-z0-9])\w -- identifier
// [A-Za-z0-9]+[#])\w -- identifier";
// /*