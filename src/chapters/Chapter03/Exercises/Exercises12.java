<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises12 {
	public static void main(String[] args) {
		Scanner ınput = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		int number = ınput.nextInt();
		int d1 = number / 100 ;
		int d3 = number % 10 ;
		
		if (d1 == d3 ) {
			System.out.println(number + " is a palindrome");
			
		}
		else 
			System.out.println(number + " is not a palindrome");
		
	}

}
=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises12 {
	public static void main(String[] args) {
		Scanner ınput = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		int number = ınput.nextInt();
		int d1 = number / 100 ;
		int d3 = number % 10 ;
		
		if (d1 == d3 ) {
			System.out.println(number + " is a palindrome");
			
		}
		else 
			System.out.println(number + " is not a palindrome");
		
	}

}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
