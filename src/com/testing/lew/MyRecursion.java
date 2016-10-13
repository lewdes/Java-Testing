package com.testing.lew;

public class MyRecursion {
	
	static int count =0;

	public static void main(String[] args) {
		solve(4);
		
	}

	   public static void solve(int n) {
		   count++;
		   System.out.println("n = " + n);
	       if (n == 1) {
	           System.out.println("1!!!");
	       } else {
	           solve(n - 1);
	           System.out.println("1st Phase..");
	           solve(n - 1);
	           System.out.println("2nd Phase..");
	       }
	       
	       
	   }
}
