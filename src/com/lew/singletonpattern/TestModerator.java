package com.lew.singletonpattern;

public class TestModerator {
	public static void main(String[] args) {
		Singleton m = Singleton.getInstance();
		m.disconnect();

		System.out.println(m.isOnline());
		m.setOnline(true);
		System.out.println(m.isOnline());
	}
}
