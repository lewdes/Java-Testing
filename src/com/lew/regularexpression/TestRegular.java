package com.lew.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegular {
	public static void main(String[] args) {
		String s = "\\D";
		String line = "haha, i am abc san!";
		Pattern p = Pattern.compile(s);
		
		Matcher m = p.matcher(line);
//		
//	     if (m.find( )) {
//	         System.out.println("Found value: " + m.group() );
//	      }else {
//	         System.out.println("NO MATCH");
//	      }
//	     
	     while(m.find()){
	    	 System.out.println("Found value: " + m.group() );
	     }
		
	}
}
