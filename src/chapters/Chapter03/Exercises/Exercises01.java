package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises01 {
 public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a, b, c, ");
	double a = keyboard.nextDouble();
	double b = keyboard.nextDouble();
	double c = keyboard.nextDouble();
	double disc = Math.pow(b*b - 4 * a * c , 0.5);
	if (disc > 0) { 
		double r1 = (- b + disc ) / 2 * a ;
		double r2 = (- b - disc ) / 2 * a ;
		System.out.println("The equation has two roots " + r1 + "and" + r2);
	}
	else if (disc == 0 ) {
		double r1 = (- b + disc ) / 2 * a ;
		System.out.println("The equation has one root " + r1 );
	  }
	else {
		System.out.println("The equation has no real roots");
		}

 }
 
}
