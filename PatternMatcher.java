package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		System.out.println("First Name " +fname+" is: "+ patternMatcher.validatefname(fname));
		String lname = sc.nextLine();
		System.out.println("LastName "+lname+" is: "+ patternMatcher.validatelname(lname));
		String number = sc.nextLine();
		System.out.println("Mobile Format "+number+" is: "+ patternMatcher.validateMobileNo(number));
		String password = sc.nextLine();
		System.out.println("Password "+password+" is: "+ patternMatcher.validatePassword(password));
        String[] multipleEmail;
		multipleEmail =  new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
				"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com",
				"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com",
				"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
		for(int i=0; i< multipleEmail.length; i++) {
		System.out.println("EmailId "+multipleEmail[i]+" is: "+ patternMatcher.validateEmail(multipleEmail[i]));
		}
	}   
	public String matchpattern(String regex, String input) {   
    	  Pattern pattern = Pattern.compile(regex);
    	  Matcher matcher = pattern.matcher(input);
    	  if(matcher.find()) {
    		  return "Valid" ;
    	  }
    	  else {
    	       return "Invalid";
          }
      }
	public String validatefname(String s) {                  // valid first name
    	  String regex = "(^[A-Z]{1})[a-z]{2,}$";
    	  return matchpattern(regex, s);
    }
	public String validatelname(String s) {                 // valid last name
    	  String regex = "(^[A-Z]{1})[a-z]{2,}$";
    	  return matchpattern(regex, s);
    }
	
	public String validateMobileNo(String s) {                 // valid Mobile format
    	  String regex = "^([0-9]{2}[ ][0-9]{10})$";
    	  return matchpattern(regex, s);
    }
	public String validatePassword(String s) {                 // valid Password format
    	  String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%#*?&])[A-Za-z\\d@#$!%*?&]{8,}$";
    	  return matchpattern(regex, s);
	}
	public String validateEmail(String s) {                 // valid emailId
	    	  String regex = "^[a-z]+[.|+_-]?[a-z0-9]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$";
	    	  return matchpattern(regex, s);
	}
}

