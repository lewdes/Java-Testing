package com.testing.lew;

public class WeightTable {
	public static void main(String[] args) {
		double earthWeight = Double.parseDouble(args[0]);
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values()){
			System.out.println("value: " + p);
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
	}
}