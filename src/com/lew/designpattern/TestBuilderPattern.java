package com.lew.designpattern;

public class TestBuilderPattern {
	public static void main(String[] args) {
		Contact c = new Contact.ContactBuilder().name("haha", "lew").email("lew@gmail.com").phone(1983092l).build();
		System.out.println(c);
	}
}
