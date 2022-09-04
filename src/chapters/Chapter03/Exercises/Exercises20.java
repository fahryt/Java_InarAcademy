<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises20 {
	public static void main(String[] args) {
		System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
		Scanner keyboard = new Scanner(System.in);
		double fahrenheit = keyboard.nextDouble();
		
		if(fahrenheit < -58 || fahrenheit > 41) {
			System.out.println("Invalid temperature.");
		}
		
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = keyboard.nextDouble();

		if(windSpeed > 2) {
			System.out.println("Invalid wind speed.");
		}
		
		double windchillTemperature = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + windchillTemperature);
}
=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises20 {
	public static void main(String[] args) {
		System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
		Scanner keyboard = new Scanner(System.in);
		double fahrenheit = keyboard.nextDouble();
		
		if(fahrenheit < -58 || fahrenheit > 41) {
			System.out.println("Invalid temperature.");
		}
		
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = keyboard.nextDouble();

		if(windSpeed > 2) {
			System.out.println("Invalid wind speed.");
		}
		
		double windchillTemperature = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + windchillTemperature);
}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
}