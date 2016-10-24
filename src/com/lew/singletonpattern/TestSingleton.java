package com.lew.singletonpattern;

public class TestSingleton {
	public static void main(String[] args) {
		Singleton m = Singleton.getInstance();
		m.disconnect();

		System.out.println(m.isOnline());
		m.setOnline(true);
		System.out.println(m.isOnline());

		// Test singleton Enum
		System.out.println(SingletonEnum.INSTANCE);
		//SingletonEnum.INSTANCE.methodA();
	}
}