package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int n = in.nextInt();
		System.out.println("Enter the side: ");
		float side = in.nextFloat();
		double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		
		System.out.println("The area of the polygon is " + area );
		//?
	}

}
