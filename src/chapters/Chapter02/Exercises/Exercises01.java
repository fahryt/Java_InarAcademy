package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius:");
		double celsius = keyboard.nextDouble();
		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + " Celsius is " + ((double)(int)(fahrenheit * 10))/10 + " Fahrenheit .");
	}
}
