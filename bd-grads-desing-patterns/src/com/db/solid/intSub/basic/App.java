package com.db.solid.intSub.basic;



interface Bird {
	void fly();

	void molt(); // lose feathers
}

class Eagle implements Bird {
	int numberOfFeathers;
	String currentLocation;

	public Eagle(int initialFeathers) {
		this.numberOfFeathers = initialFeathers;
	}

	@Override
	public void fly() {
		this.currentLocation = "in the air";
	}

	@Override
	public void molt() {
		this.numberOfFeathers -= 1;
	}
}

class Penguin implements Bird {
	int numberOfFeathers;
	String currentLocation;

	public Penguin(int initialFeathers) {
		this.numberOfFeathers = initialFeathers;
	}

	@Override
	public void molt() {
		this.numberOfFeathers -= 1;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
	}
	
	void swim() {
		
	}
}

public class App {
	public static void main(String[] args) {
		Penguin p = new  Penguin(10);
		System.out.println(p.numberOfFeathers);
		p.fly();
	}
}
