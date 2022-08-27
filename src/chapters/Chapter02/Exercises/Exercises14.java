package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises14 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight = keyboard.nextDouble();
		System.out.println("Enter height in inches: ");
		double inches = keyboard.nextDouble();
		double bmi = (weight * 0.45359237 ) / Math.pow (inches * 0.0254 , 2);
		System.out.println("BMI is " + bmi );
	}
}
