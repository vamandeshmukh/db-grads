package com.db.solid.liscov.basic;

abstract class Apartment {
	int squareFootage;
	int numberOfBedrooms;
	abstract void setSquareFootage(int sqft);
}

class PenthouseSuite extends Apartment {
	public PenthouseSuite() {
		this.numberOfBedrooms = 4;
	}

	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}
}

class Studio extends Apartment {
	public Studio() {
		this.numberOfBedrooms = 0;
	}

	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}
}

class UnitUpgrader {
	public void upgrade(Apartment apartment) {
		apartment.squareFootage += 40;

		if (apartment.getClass() != Studio.class)
			apartment.numberOfBedrooms += 1;
	}
}

public class App {
	
	public static void main(String[] args) {
		
		Studio st = new Studio();
		
		
		
	}

}
