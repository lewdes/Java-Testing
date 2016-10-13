package com.lew.testinterface;

public class A {
	Inter inter;

	public A(Inter inter) {
		this.inter = inter;
	}

	public void testSomething() {
		this.inter.doSomething();
	}
}
