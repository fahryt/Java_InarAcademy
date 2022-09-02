package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises10 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms: ");
		double kg = keyboard.nextDouble();
		System.out.println("Enter the initial temperature: ");
		double initialTemperature = keyboard.nextDouble();
		System.out.println("Enter the final temperature: ");
		double finalTemperature = keyboard.nextDouble();
		double q = kg * (finalTemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is " + q);
	}
}
