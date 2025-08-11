package utility;

public class Converter {

	public static double celsiusToFahrenheit(double celsius) {
		return ((celsius * 9.0/5.0) + 32);
	}

	public static double celsiusToFahrenheit(double celsius, boolean reverse) {
		if (reverse) return fahrenheitToCelsius(celsiusToFahrenheit(celsius));
		else return celsiusToFahrenheit(celsius);
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return ((fahrenheit - 32) * 5.0/9.0);
	}

}

