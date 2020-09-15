package com.db.structural.design.pattern;

/**
 * 
 * @author Vaman Deshmukh
 *
 */
// Bridge pattern: decouple an abstraction from its implementation 
// so that the two can vary independently

abstract class Vehicle {
	Workshop ws1; // Produce
	Workshop ws2; // Assemble

	Vehicle(Workshop ws1, Workshop ws2) {
		this.ws1 = ws1;
		this.ws2 = ws2;
	}

	abstract void manufacture();

}

class Car extends Vehicle {

	public Car(Workshop ws1, Workshop ws2) {
		super(ws1, ws2);
	}
	@Override
	void manufacture() {
		System.out.println("Car ");
		ws1.work();
		ws2.work();
	}
}

class Bike extends Vehicle {
	public Bike(Workshop ws1, Workshop ws2) {
		super(ws1, ws2);
	}
	@Override
	void manufacture() {
		System.out.println("Bike ");
		ws1.work();
		ws2.work();
	}
}

interface Workshop {
	abstract void work();

}

class Produce implements Workshop {
	@Override
	public void work() {
		System.out.println("Produced.");
	}

}

class Assemble implements Workshop {
	@Override
	public void work() {
		System.out.println("Assembled.");
	}
}

public class Pattern {
	public static void main(String[] args) {
		Vehicle v1 = new Car(new Produce(), new Assemble());
		v1.manufacture();

		Vehicle v2 = new Bike(new Produce(), new Assemble());
		v2.manufacture();

	}
}
