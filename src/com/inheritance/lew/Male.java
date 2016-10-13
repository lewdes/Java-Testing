package com.inheritance.lew;

public class Male extends Human implements Comparable<Male> {

	public Male() {
		this.gender = "M";
	}
	
	public Male(String name) {
		this.name = name;
		this.gender = "M";
	}

	public void pee() {
		System.out.println("Stand up...");
	}

	@Override
	public int compareTo(Male o) {
		
		return this.name.compareTo(o.name);
	}
}
