package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises17 {
	public static void main(String[] args) {
		System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
		Scanner keyboard = new Scanner(System.in);
		double fahrenheit = keyboard.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = keyboard.nextDouble();
		double windchillTemperature = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + windchillTemperature);
	}

}
