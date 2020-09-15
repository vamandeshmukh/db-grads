package com.db.solid.interSub.standard;

interface SwimmingCreature {
	public void swim();
}

interface FlyingCreature {
	public void fly();
}

interface FeatheredCreature {
	public void molt();
}

class Eagle implements FlyingCreature, FeatheredCreature {
	String currentLocation;
	int numberOfFeathers;

	public Eagle(int initialNumberOfFeathers) {
		this.numberOfFeathers = initialNumberOfFeathers;
	}

	public void fly() {
		this.currentLocation = "in the air";
	}

	public void molt() {
		this.numberOfFeathers -= 1;
	}
}

class Penguin implements SwimmingCreature, FeatheredCreature {
	String currentLocation;
	int numberOfFeathers;

	public Penguin(int initialFeatherCount) {
		this.numberOfFeathers = initialFeatherCount;
	}

	public void swim() {
		this.currentLocation = "in the water";
	}

	public void molt() {
		this.numberOfFeathers -= 4;
	}
}

public class App {

}
