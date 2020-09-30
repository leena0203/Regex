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
		String Number = "91 2345678012";
		System.out.println("Phone NO. of User:"+Number+"------->"+patternMatcher.validateMobileNum(Number));
		String Password = "Soni#akh@45";
		System.out.println("Password of User:"+Password+"------->"+patternMatcher.validatePassword(Password));
		String email = "abc@gmail.com";
		System.out.println("EmailId of User:"+email+"------->"+patternMatcher.validateEmail(email));
		String email1 = "abc-100@yahoo.com";
		System.out.println("EmailId of User:"+email1+"------->"+patternMatcher.validateEmail(email1));
		String email2 = "abc.100@yahoo.com";
		System.out.println("EmailId of User:"+email2+"------->"+patternMatcher.validateEmail(email2));
		String email3 = "abc-100@abc.net";
		System.out.println("EmailId of User:"+email3+"------->"+patternMatcher.validateEmail(email3));
		String email4 = "abc.100@abc.com.au";
		System.out.println("EmailId of User:"+email4+"------->"+patternMatcher.validateEmail(email4));
		String email5 = "abc@gmail.com.com";
		System.out.println("EmailId of User:"+email5+"------->"+patternMatcher.validateEmail(email5));
		String email6 = "abc@.com.my";
		System.out.println("EmailId of User:"+email6+"------->"+patternMatcher.validateEmail(email6));
		String email7 = "abc123@gmail.a";
		System.out.println("EmailId of User:"+email7+"------->"+patternMatcher.validateEmail(email7));
		String email8 = "abc123@com";
		System.out.println("EmailId of User:"+email8+"------->"+patternMatcher.validateEmail(email8));
		String email9 = ".abc@abc.com";
		System.out.println("EmailId of User:"+email9+"------->"+patternMatcher.validateEmail(email9));
		String email10 = "abc()*@gmail.com";
		System.out.println("EmailId of User:"+email10+"------->"+patternMatcher.validateEmail(email10));
		String email11 = "abc@%*.com";
		System.out.println("EmailId of User:"+email11+"------->"+patternMatcher.validateEmail(email11));
		String email12 = "abc..2002@gmail.com";
		System.out.println("EmailId of User:"+email12+"------->"+patternMatcher.validateEmail(email12));
		
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
	    	  String regex = "^[a-z]+[.|+_-]?[a-z0-9]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$";
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

