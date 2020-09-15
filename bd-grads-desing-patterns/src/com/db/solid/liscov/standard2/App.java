package com.db.solid.liscov.standard2;

interface Parent {
	
}


class Client implements Parent{
	
}


interface University {
	void study();
}

class CollegeOne implements University {

	@Override
	public void study() {
		System.out.println("Study in class");

	}

}

class CollegeTwo implements University {

	@Override
	public void study() {
		System.out.println("Study online");
	}

}

public class App {

	public static void main(String[] args) {

//		CollegeOne obj = new CollegeOne();

		University obj2 = new CollegeOne();

		University obj3 = new CollegeTwo();
		
		// code 

		obj2 = obj3;
	}

}




