package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises09 {
 public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter v0, v1, and time: ");
	double v0 = keyboard.nextDouble();
	double v1 = keyboard.nextDouble();
	double t = keyboard.nextDouble();
	double a = (v1 - v0) / t ;
	System.out.println("The average acceleration is " + a );
}
}
