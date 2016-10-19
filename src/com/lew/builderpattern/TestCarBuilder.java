package com.lew.builderpattern;

public class TestCarBuilder {
	public static void main(String[] args) {
		Car c = new Car.CarBuilder().withName("BMW").withType("Type A").build();
		System.out.println(c);
	}
}
