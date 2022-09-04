package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_04 {
	public static void main(String[] args) {
		System.out.println("Enter the side : ");
		Scanner in = new Scanner(System.in);
		double side = in.nextDouble();
		double area = (6 * Math.pow(side, 2)) / ( 4 * Math.tan(Math.PI / 6)) ;
		area = (int)(area * 100) / 100.0;
		System.out.println("The area of the hexagon is " + area);
		
		
	}


}
