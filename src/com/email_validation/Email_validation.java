package com.email_validation;
import java.util.regex.*;

import java.util.ArrayList;

public class Email_validation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String > emails=new ArrayList<String>();//creating generic ArrayList
		emails.add("NamitaMrigwani@gmail.com");
	    emails.add("Mrigwani#@gmail.com");
	    emails.add("mrigwaninamita@gmail.com");
	    emails.add("namita123@gmail.com");
	    emails.add("mrigwani124@gmail.com");
	    //add invalid emails
	    emails.add("@gmail.com");
	    emails.add("mrigwani#gmail.com");
	    
	    checkemail(emails);
	    
// here we are using regular expression
}

	
	 private static void checkemail(ArrayList<String> al) {//this is a method to verify email id and if email id is valid gives true value else false
		String regex="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	    //compile regular expression to get the pattern
	    Pattern pattern=Pattern.compile(regex);
	  //  iterating emails one by one from arraylist
	    for(String email:al) {
	    	//creating instance matcher
	    	Matcher matcher =pattern.matcher(email);
	    	System.out.println("valid email:"+email+" "+matcher.matches()+"\n" );
	    	
	    }
		
	}
}