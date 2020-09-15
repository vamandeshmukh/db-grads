package com.db.solid.open.standard2;

interface Personality {
	public abstract String greet();
}

class Greeting {
	private Personality personality;

	public Greeting(Personality personality) {
		this.personality = personality;
	}

	public String greet() {
		return this.personality.greet();
	}
}

class FormalPersonality implements Personality {
	@Override
	public String greet() {
		return "Good morning!";
	}
}

class CasualPersonality implements Personality {
	@Override
	public String greet() {
		return "Hello!";
	}
}


public class App {
	
	public static void main(String[] args) {
		
		int num = 11;
		num = 12;
		int num2 = 20;
		num = num2;
		
		Personality person1 = new CasualPersonality();
		
		Greeting greeting = new Greeting(person1);
		System.out.println(greeting.greet());
		
		Personality person2 = new FormalPersonality();
		Greeting greeting2 = new Greeting(person2);
		System.out.println(greeting2.greet());
		
		person1 = person2;
	}
}





