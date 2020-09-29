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
	}

