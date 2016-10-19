package com.lew.singletonpattern;

public class Singleton {

	public static final Singleton INSTANCE = new Singleton();

	private boolean isOnline;

	private Singleton() {

	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void disconnect() {
		System.out.println("Disconnecting...");
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

}
