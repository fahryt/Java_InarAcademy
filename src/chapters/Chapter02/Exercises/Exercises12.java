package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises12 {
	public static void main(String[] args) {
		System.out.println("Enter speed and acceleration: ");
		Scanner keyboard = new Scanner(System.in);
		double speed = keyboard.nextDouble();
		double a = keyboard.nextDouble();
		double length = Math.pow(speed, 2) / (2 * a) ;
		System.out.println("The miimum runway length for this airplane is " + length );
		
 
				
	}

}
