package com.testing.lew;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class Cougar {

	public static void main(String[] args) {
		String s = "HAHA, I am lew";
		
//		char[] c = s.toCharArray();
		
		for(char c : s.toCharArray()){
			System.out.println(c);
		}
	}

}