package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		double feetValue = keyboard.nextDouble();
		double feetValueToMeter = feetValue * 0.305 ;
		System.out.println(feetValue + " feet " + feetValueToMeter + " meters.");
	}

}
