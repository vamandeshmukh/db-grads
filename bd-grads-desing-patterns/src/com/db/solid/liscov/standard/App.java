package com.db.solid.liscov.standard;

class Studio {
	int squareFootage;
	int numberOfRooms;

	public Studio() {
		this.numberOfRooms = 0;
	}

	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}
}

class PentHouseSuite {
	int squareFootage;
	int numberOfBedrooms;

	public PentHouseSuite(int rooms) {
		this.numberOfBedrooms = rooms;
	}

	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}
}

class BedroomAdder {
	public void addBedroom(PentHouseSuite pentHouseSuite) {
		pentHouseSuite.numberOfBedrooms += 1;
	}

}

public class App {
	
	public static void main(String[] args) {
		Studio st = new Studio();
		st.setSquareFootage(1000);
		System.out.println(st.squareFootage);
		
		PentHouseSuite ph = new PentHouseSuite(4);
		ph.squareFootage = 3000;
		BedroomAdder ba = new BedroomAdder();
		ba.addBedroom(ph);
		System.out.println(ph.numberOfBedrooms);
		System.out.println(ph.squareFootage);
		System.out.println(ph.squareFootage);	
	}
}
