package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises19 {
	public static void main(String[] args) {
		System.out.println("Enter x1 and y1: ");
		Scanner keyboard = new Scanner(System.in);
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		System.out.println("Enter x3 and y3: ");
		double x3 = keyboard.nextDouble();
		double y3 = keyboard.nextDouble();
		double side1 = Math.pow((x2 - x1 ) * (x2 - x1 ) + (y2 - y1) * (y2 - y1 ), 0.5);
		double side2 = Math.pow((x3 - x2 ) * (x3 - x2 ) + (y3 - y2) * (y3 - y2 ), 0.5);
		double side3 = Math.pow((x3 - x1 ) * (x3 - x1 ) + (y3 - y1) * (y3 - y1 ), 0.5);
		double s = ( side1 + side2 + side3 ) / 2 ;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		System.out.println("The area of the triangle is " + ((int)(area * 10)) / 10 );
	}
}
