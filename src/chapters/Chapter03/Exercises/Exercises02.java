package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises02 {
	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10 );
		int number2 = (int)(System.currentTimeMillis() * 7 % 10);
		int number3 = (int)(System.currentTimeMillis() * 3 % 10);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " = ? " );
		int total = keyboard.nextInt();
		if (total == number1 + number2 + number3) {
			System.out.println(" The answer is true");
		}
		else {
			System.out.println("The answer is false");
			
		}
	}

}
