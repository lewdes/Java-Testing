package com.lew.clonable;

public class Dummy implements Cloneable {
	String name;

	public Dummy(String name) {
		this.name = name;
	}

	// public Object clone() throws CloneNotSupportedException {
	// return super.clone();
	// }
	//
	@Override
	public Dummy clone() {
		try {
			return (Dummy) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError(); // Can't happen
		}
	}
}
