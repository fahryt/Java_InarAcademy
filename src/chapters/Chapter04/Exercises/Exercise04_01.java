<<<<<<< HEAD
package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex : ");
		double vertex = in.nextDouble();
		double side = (2 * vertex) * Math.sin(Math.PI/5);
		double area = (5 * Math.pow(side, 2)) /( 4 * Math.tan(Math.PI / 5));
		area = (int)(area * 100) / 100.0;
		System.out.println("The area of the pentagon is " + area);
		
	}

}
=======
package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex : ");
		double vertex = in.nextDouble();
		double side = (2 * vertex) * Math.sin(Math.PI/5);
		double area = (5 * Math.pow(side, 2)) /( 4 * Math.tan(Math.PI / 5));
		area = (int)(area * 100) / 100.0;
		System.out.println("The area of the pentagon is " + area);
		
	}

}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
