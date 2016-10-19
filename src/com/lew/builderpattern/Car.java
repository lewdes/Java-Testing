package com.lew.builderpattern;

public class Car {
	String name;
	String type;

	public Car(CarBuilder builder) {
		this.name = builder.name;
		this.type = builder.type;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + "]";
	}

	public static class CarBuilder {
		String name;
		String type;

		public CarBuilder() {

		}

		public CarBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public CarBuilder withType(String type) {
			this.type = type;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
