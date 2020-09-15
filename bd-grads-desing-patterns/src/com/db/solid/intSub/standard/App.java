package com.db.solid.intSub.standard;

abstract class Bird {
	abstract void haveFeathers();
}

interface Swimmable {
	void swim();
}

interface Flyable {
	void fly();
}

class Eagle extends Bird implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void haveFeathers() {
		// TODO Auto-generated method stub
		
	}

}

class Penguine extends Bird implements Swimmable {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void haveFeathers() {
		// TODO Auto-generated method stub
		
	}

}

public class App {

}
