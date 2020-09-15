package com.db.core;

class Demo extends Thread {
	
	
	public void run() {
		System.out.println("Thread is running.");
	}
}


public class ThreadDemo {
		
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.start();
		
	}

}
