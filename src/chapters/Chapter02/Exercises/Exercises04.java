package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises04 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double poundValue = keyboard.nextDouble();
		double poundValueToKilogram = poundValue * 0.454 ;
		System.out.println(poundValue + " pound is " + poundValueToKilogram + " kilograms");
	}
}
