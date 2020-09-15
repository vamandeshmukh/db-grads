package com.db.solid.interSub.basic;

interface Bird {
	public void fly();

	public void molt();
}

class Eagle implements Bird {
	String currentLocation;
	int numberOfFeathers;

	public Eagle(int initialFeatherCount) {
		this.numberOfFeathers = initialFeatherCount;
	}

	public void fly() {
		this.currentLocation = "in the air";
	}

	public void molt() {
		this.numberOfFeathers -= 1;
	}
}

class Penguin implements Bird {
	String currentLocation;
	int numberOfFeathers;

	public Penguin(int initialFeatherCount) {
		this.numberOfFeathers = initialFeatherCount;
	}

	public void molt() {
		this.numberOfFeathers -= 1;
	}

	public void fly() {
		throw new UnsupportedOperationException();
	}

	public void swim() {
		this.currentLocation = "in the water";
	}
}

public class App {

}
