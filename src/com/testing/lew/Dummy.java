package com.testing.lew;

public class Dummy {
	String dummyString;
	int number;
	String type;

	public Dummy(String s) {
		this.dummyString = s;
	}
	
	public Dummy call(){
		System.out.println("d");
		return this;
	}
	
	public Dummy shout(){
		System.out.println("s");
		return this;
	}

}
