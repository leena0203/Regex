package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		String samplel = "Leena";
		System.out.println(samplel+"------->"+patternMatcher.validateInput(samplel));
		String samplel1 = "eela23";
		System.out.println(samplel1+"------->"+patternMatcher.validateInput(samplel1));
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
	}

