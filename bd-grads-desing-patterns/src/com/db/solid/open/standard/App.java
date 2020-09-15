package com.db.solid.open.standard;

class Greeting {

	String personality;

	public String greet() {

		if (this.personality == "formal") {
			return "Good morning!";
		} else if (this.personality == "casual") {
			return "Hi!";
		} 
//		else if (this.personality == "friendly") {
//			return "Hello darl!";
//		}
		else {
			return null;
		}
	}
}

public class App {

	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		greeting.personality = "friendly"; // friendly = hello darling! 

		System.out.println(greeting.personality);
		System.out.println(greeting.greet());

	}
}
