<<<<<<< HEAD
package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String str = in.next();
		str = str.toUpperCase();
		char ch = str.charAt(0);
		int i = (int)ch;
		
		String bin = Integer.toBinaryString(i);
		
		if (ch>='0' && ch<='9') {
			
			System.out.println("The binary value is " + bin);
				
			
		}else if (ch>'9') {
			switch (ch) {
			case 'A':
			
				System.out.println("The binary value is " + bin);
				
				break;
			case 'B':
				
				System.out.println("The binary value is " + bin);
				break;
			
			case 'C':
				
				System.out.println("The binary value is " + bin);
				break;

			case 'D':
				
				System.out.println("The binary value is " + bin);
				break;
			case 'E':
				
				System.out.println("The binary value is " + bin);
				break;
			case 'F':
				
				System.out.println("The binary value is " + bin);
				break;

			}
		}
		
		
		else  {
			System.out.println("Invalid input");
		}
		}
	}


=======
package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String str = in.next();
		str = str.toUpperCase();
		char ch = str.charAt(0);
		int i = (int)ch;
		
		String bin = Integer.toBinaryString(i);
		
		if (ch>='0' && ch<='9') {
			
			System.out.println("The binary value is " + bin);
				
			
		}else if (ch>'9') {
			switch (ch) {
			case 'A':
			
				System.out.println("The binary value is " + bin);
				
				break;
			case 'B':
				
				System.out.println("The binary value is " + bin);
				break;
			
			case 'C':
				
				System.out.println("The binary value is " + bin);
				break;

			case 'D':
				
				System.out.println("The binary value is " + bin);
				break;
			case 'E':
				
				System.out.println("The binary value is " + bin);
				break;
			case 'F':
				
				System.out.println("The binary value is " + bin);
				break;

			}
		}
		
		
		else  {
			System.out.println("Invalid input");
		}
		}
	}


>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
