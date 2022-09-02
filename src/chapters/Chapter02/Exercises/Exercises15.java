package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises15 {
	public static void main(String[] args) {
		System.out.println("Enter x1 and y1: ");
		Scanner keyboard = new Scanner(System.in);
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		double distance = Math.pow((x2 - x1 ) * (x2 - x1 ) + (y2 - y1) * (y2 - y1 ), 0.5);
		System.out.println("The distance between the two points is: " + distance);
				
	}

}
