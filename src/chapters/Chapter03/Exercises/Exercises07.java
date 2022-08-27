package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises07 {
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
		 if (numberOfOneDollars == 1) {
			 System.out.println("    " + numberOfOneDollars + " dollar"); 
			 
		 }
		 else if (numberOfOneDollars == 0)
			 System.out.println();
		 
		 else  System.out.println("    " + numberOfOneDollars + " dollars");
		  
		 if (numberOfQuarters ==1) {
			 System.out.println("    " + numberOfQuarters + " quarter ");
		 }
	     else if (numberOfQuarters == 0)
		    System.out.println(); 
		 else  
			 System.out.println("    " + numberOfQuarters + " quarters ");
		    
		 if (numberOfDimes == 1) {
			 System.out.println("    " + numberOfDimes + " dime"); 
		 }
		 else if (numberOfDimes == 0)
			 System.out.println();
		 
		 else 
			 System.out.println("    " + numberOfDimes + " dimes");
		 if (numberOfNickels == 1 ) {
			 System.out.println("    " + numberOfNickels + " nickel");
		 }
		 else if (numberOfNickels == 0)
			 System.out.println();
		 else 
			 System.out.println("    " + numberOfNickels + " nickels");
		 if (numberOfPennies == 1) {
			 System.out.println("    " + numberOfPennies + " pennie");
		 }
		 else if (numberOfPennies == 0)
			 System.out.println();
		 else 
			 System.out.println("    " + numberOfPennies + " pennies");
		 
		 		
		 }
	}

