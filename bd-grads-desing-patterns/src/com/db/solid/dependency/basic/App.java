package com.db.solid.dependency.basic;

class WeatherTracker {
	String currentConditions;
	Phone phone;
	Emailer emailer;
//	WhatsApp wa;

	public WeatherTracker() {
		phone = new Phone();
		emailer = new Emailer();
	}

	public void setCurrentConditions(String weatherDescription) {
		this.currentConditions = weatherDescription;
		if (weatherDescription == "rainy") {
			String alert = phone.generateWeatherAlert(weatherDescription);
			System.out.print(alert);
		}
		if (weatherDescription == "sunny") {
			String alert = emailer.generateWeatherAlert(weatherDescription);
			System.out.print(alert);
		}
	}
}

class Emailer {
	public String generateWeatherAlert(String weatherConditions) {
		String alert = "It is " + weatherConditions;
		return alert;
	}
}

class Phone {
	public String generateWeatherAlert(String weatherConditions) {
		String alert = "It is " + weatherConditions;
		return alert;
	}
}

public class App {

	public static void main(String[] args) {

		// test here

	}

}
