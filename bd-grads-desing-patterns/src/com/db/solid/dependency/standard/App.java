package com.db.solid.dependency.standard;

interface Notifier {
	
	public void alertWeatherConditions(String weatherConditions);
}

class Noti {
	
}

class WeatherTracker {
	String currentConditions;

	public void setCurrentConditions(String weatherDescription) {
		this.currentConditions = weatherDescription;
	}

	public void notify(Notifier notifier) {
		notifier.alertWeatherConditions(currentConditions);
	}
}

class MobileDevice implements Notifier {
	public void alertWeatherConditions(String weatherConditions) {
		if (weatherConditions == "rainy")
			System.out.print("It is rainy");
	}

}

class EmailClient implements Notifier {

	public void alertWeatherConditions(String weatherConditions) {
		if (weatherConditions == "sunny")
			;
		System.out.print("It is sunny");
	}
}

public class App {
	public static void main(String[] args) {
		
	}
}
