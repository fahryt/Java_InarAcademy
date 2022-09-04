<<<<<<< HEAD
package weeks03;

import java.util.Scanner;

public class Week3_Assignment05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 4 digit number: ");
		int num = in.nextInt();
		
		int digit4 = num / 1000;
		int digit3 = (num / 100) % 10;
		int digit2 = (num % 100) / 10;
		int digit1 = num % 10 ;
		System.out.println(digit1 + "" + digit2 + "" + digit3 + "" + digit4);
		
	}

}
=======
package weeks03;

import java.util.Scanner;

public class Week3_Assignment05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 4 digit number: ");
		int num = in.nextInt();
		
		int digit4 = num / 1000;
		int digit3 = (num / 100) % 10;
		int digit2 = (num % 100) / 10;
		int digit1 = num % 10 ;
		System.out.println(digit1 + "" + digit2 + "" + digit3 + "" + digit4);
		
	}

}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
