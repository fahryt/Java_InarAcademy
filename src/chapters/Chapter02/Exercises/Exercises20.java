package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises20 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter balance and interest rate for a year (e.g., 3 for %3): ");
		double balance = keyboard.nextDouble();
		double interestRate = keyboard.nextDouble();
		double interest = balance * (interestRate / 1200);
		System.out.println("The interest is " + interest );
		
	}

}
