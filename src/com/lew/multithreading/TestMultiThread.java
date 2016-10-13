package com.lew.multithreading;

class TestMultiThread implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		TestMultiThread m1 = new TestMultiThread();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}