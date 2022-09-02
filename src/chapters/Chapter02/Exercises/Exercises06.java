package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises06 {
 public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a number between 0 and 1000: ");
	int number = keyboard.nextInt();
	int digit1 = number % 10 ;
	int digit10 = (number / 10) % 10 ;
	int digit100 = number / 100 ;
	int total = digit1 + digit10 + digit100 ;
	System.out.println("The sum of the digits is " + total);
}
}
