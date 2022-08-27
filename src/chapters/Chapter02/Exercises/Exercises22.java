package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises22 {
	public static void main(String[] args) {
		System.out.println("Enter an amount in Int for example 1156: ");
		Scanner keyboard = new Scanner(System.in);
		int amount = keyboard.nextInt();
		  int remainingAmount = amount;
		  int numberOfOneDollars = remainingAmount / 100;
		  remainingAmount = remainingAmount % 100;
		  int numberOfQuarters = remainingAmount / 25;
		  remainingAmount = remainingAmount % 25;
		  int numberOfDimes = remainingAmount / 10;
		  remainingAmount = remainingAmount % 10;
		  int numberOfNickels = remainingAmount / 5;
		  remainingAmount = remainingAmount % 5;
		  int numberOfPennies = remainingAmount;
		  System.out.println("Your amount " + amount + " consists of");
		  System.out.println("    " + numberOfOneDollars + " dollars");
		  System.out.println("    " + numberOfQuarters + " quarters ");
		  System.out.println("    " + numberOfDimes + " dimes");
		  System.out.println("    " + numberOfNickels + " nickels");
		  System.out.println("    " + numberOfPennies + " pennies");
	}

}
