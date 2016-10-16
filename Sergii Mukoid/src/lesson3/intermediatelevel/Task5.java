package lesson3.intermediatelevel;

public class Task5 {

	private double convertKelvinToCelsius(double Kelvin) {
		double resultCelsius = Kelvin - 273.15;
		return resultCelsius;
	}

	private double convertCelsiusToKelvin(double Celsius) {
		double resultKelvin = Celsius + 273.15;
		return resultKelvin;
	}

	public static void main(String[] args) {
		Task5 myInstance = new Task5();
		System.out.println(myInstance.convertCelsiusToKelvin(0));
		System.out.println(myInstance.convertKelvinToCelsius(0));
	}

}
