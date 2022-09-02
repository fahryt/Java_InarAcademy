package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the sides of a triangle : ");
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();
		
		if (side3 > (side1 + side2) || side2 > (side1 + side3) || side1 > (side3 + side2)) {
			System.out.println("Invalid input.");
			
		}else {
			System.out.println("Perimeter is " + (side1 + side2 + side3));
			
		}
	}

}
