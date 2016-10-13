package com.testing.lew;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyClass {

	public static void main(String[] args) {
		
		//Test StringBuilder
		StringBuilder sb = new StringBuilder("StringBuilder");
				System.out.println(sb.hashCode());
				
				sb.append(" haha").append("welcome");
				System.out.println(sb.hashCode());
				
				
				//Test StringBuffer		
		StringBuffer sb2 = new StringBuffer("String Buffer");
		System.out.println(sb2.hashCode());
		sb2.append(" haha");
		System.out.println(sb2.hashCode());
		
		//Test String
		String s = "String";
		System.out.println(s.hashCode());
		s = s + " Test";
		System.out.println(s.hashCode());
	}

}