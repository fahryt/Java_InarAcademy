<<<<<<< HEAD
package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		
		x1 = (int)Math.toRadians(x1);
		y1 = (int)Math.toRadians(y1);
		x2 = (int)Math.toRadians(x2);
		y2 = (int)Math.toRadians(y2);
		
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("The distance between the two points is " + d);
//?
	}

}
=======
package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		
		x1 = (int)Math.toRadians(x1);
		y1 = (int)Math.toRadians(y1);
		x2 = (int)Math.toRadians(x2);
		y2 = (int)Math.toRadians(y2);
		
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("The distance between the two points is " + d);
//?
	}

}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
