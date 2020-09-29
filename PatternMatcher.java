package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		String samplel = "Leena";
		System.out.println("First Name of User:"+samplel+"------->"+patternMatcher.validateInput(samplel));
		String samplel1 = "Sarode";
		System.out.println("Last Name of User:"+samplel1+"------->"+patternMatcher.validateInput(samplel1));
		String email = "abc.LYX@bl.co.com";
		System.out.println("EmailId of User:"+email+"------->"+patternMatcher.validateEmail(email));
		String Number = "91 2345678012";
		System.out.println("Phone NO. of User:"+Number+"------->"+patternMatcher.validateMobileNum(Number));
		String Password = "Soniakh@45";
		System.out.println("Password of User:"+Password+"------->"+patternMatcher.validatePassword(Password));
	}
	
	
	      
	      private String validateInput(String samplel) {
	    	  String regex = "^[A-Z a-z]{3,25}$";
	    	  Pattern pattern = Pattern.compile(regex);
	    	  Matcher matcher = pattern.matcher(samplel);
	    	  if(matcher.find()) {
	    		  return "valid";
	    		  
	    	  }
	    	  return "invalid";
	      }
	      private String validateEmail(String samplel) {
	    	  String regex = "^(abc[.][A-Za-z]+@bl[.]co[.][A-Za-z]{3,25})$";
	    	  Pattern pattern = Pattern.compile(regex);
	    	  Matcher matcher = pattern.matcher(samplel);
	    	  if(matcher.find()) {
	    		  return "valid";
	    		  
	    	  }
	    	  return "invalid";
	      }
	      private String  validateMobileNum(String number) {
	    	  String regex = "^([0-9]{1,5}[ ][0-9]{1,10})$";
	    	  Pattern pattern = Pattern.compile(regex);
	    	  Matcher matcher = pattern.matcher(number);
	    	  if(matcher.find()) {
	    		  return "valid";
	    		  
	    	  }
	    	  return "invalid";
	      }
	      private String validatePassword(String samplel) {
	    	  String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
	    	  Pattern pattern = Pattern.compile(regex);
	    	  Matcher matcher = pattern.matcher(samplel);
	    	  if(matcher.find()) {
	    		  return "valid";
	    		  
	    	  }
	    	  return "invalid";
	      }
	}

