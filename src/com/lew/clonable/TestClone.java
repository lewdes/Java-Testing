package com.lew.clonable;

public class TestClone {
	public static void main(String[] args) {

		Dummy d = new Dummy("lew");
		Dummy d2 = (Dummy) d.clone();

		System.out.println(d.hashCode());
		System.out.println(d2.hashCode());

	}
}
