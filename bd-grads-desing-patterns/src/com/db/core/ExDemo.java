package com.db.core;

public class ExDemo {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;

		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(i);
		}

	}
}
