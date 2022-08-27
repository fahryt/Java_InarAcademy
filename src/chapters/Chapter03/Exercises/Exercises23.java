package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates: (x , y)");
		double x = in.nextDouble();
		double y = in.nextDouble();

		boolean rectangle = (5.0 >= x && x <= -5.0) && (2.5 >= y && -2.5 <= y);

		if (rectangle) {
			System.out.println("Point " + x + " " + y + " is in the rectangle");
		} else
			System.out.println("Point " + x + " " + y + " is not in the rectangle");
	}

}
