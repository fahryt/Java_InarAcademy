<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises03 {
	public static void main(String[] args) {
		Scanner ınput = new Scanner(System.in);
		System.out.println("Enter a, ,b ,c ,d ,e , f: ");
		double a  = ınput.nextDouble();
		double b  = ınput.nextDouble();
		double c  = ınput.nextDouble();
		double d  = ınput.nextDouble();
		double e  = ınput.nextDouble();
		double f  = ınput.nextDouble();
		
		double x = ( e * d - b * f ) / ( a * d - b * c ) ;
		double y = ( a * f - e * c ) / ( a * d - b * c ) ;
		
		if ( a * d - b * c == 0) {
			System.out.println("The equation has no solution ");
		}
		else
			
			System.out.println("X : " + x) ;
			System.out.println("Y : " + y);
		
	}
}
=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises03 {
	public static void main(String[] args) {
		Scanner ınput = new Scanner(System.in);
		System.out.println("Enter a, ,b ,c ,d ,e , f: ");
		double a  = ınput.nextDouble();
		double b  = ınput.nextDouble();
		double c  = ınput.nextDouble();
		double d  = ınput.nextDouble();
		double e  = ınput.nextDouble();
		double f  = ınput.nextDouble();
		
		double x = ( e * d - b * f ) / ( a * d - b * c ) ;
		double y = ( a * f - e * c ) / ( a * d - b * c ) ;
		
		if ( a * d - b * c == 0) {
			System.out.println("The equation has no solution ");
		}
		else
			
			System.out.println("X : " + x) ;
			System.out.println("Y : " + y);
		
	}
}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
