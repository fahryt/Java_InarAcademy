package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder:");
		double radius = keyboard.nextDouble();
		double length = keyboard.nextDouble();
		final double Pİ = 3.14;
		double area = radius * radius * Pİ;
		double volume = (area * length ) ;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	
	
	}
	
	

}
