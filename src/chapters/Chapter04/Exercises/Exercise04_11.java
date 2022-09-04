<<<<<<< HEAD
package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		int value = in.nextInt();
		
		if (value<10) {
			System.out.println("The hex value is " + value);
			
		}else if (value<16) {
			switch (value) {
			case 10: {

				System.out.println("The hex value is A");
				break;
			}
			case  11: {

				System.out.println("The hex value is B");
				break;
			}
			case  12: {

				System.out.println("The hex value is C");
				break;
			}
			case  13: {

				System.out.println("The hex value is D");
				break;
			}
			case  14: {

				System.out.println("The hex value is E");
				break;
			}
			case  15: {

				System.out.println("The hex value is F");
				break;
			}
			
			}
		}else 
			System.out.println("Invalid input");
	}

}
=======
package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		int value = in.nextInt();
		
		if (value<10) {
			System.out.println("The hex value is " + value);
			
		}else if (value<16) {
			switch (value) {
			case 10: {

				System.out.println("The hex value is A");
				break;
			}
			case  11: {

				System.out.println("The hex value is B");
				break;
			}
			case  12: {

				System.out.println("The hex value is C");
				break;
			}
			case  13: {

				System.out.println("The hex value is D");
				break;
			}
			case  14: {

				System.out.println("The hex value is E");
				break;
			}
			case  15: {

				System.out.println("The hex value is F");
				break;
			}
			
			}
		}else 
			System.out.println("Invalid input");
	}

}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
