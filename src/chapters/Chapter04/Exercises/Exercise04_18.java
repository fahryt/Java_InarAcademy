package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_18 {
	public static void main(String[] args) {
		System.out.println("Enter two characters: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		str = str.toUpperCase();
		char ch = str.charAt(0);
		char ch1 = str.charAt(1);
		
		switch (ch) {
		case 'M':
			System.out.println("Mathematics ");
			break;

		case 'C':
			System.out.println("Computer Science ");
			break;
		case 'I':
			System.out.println("Information Technology ");
			break;
		}		
		switch (ch1) {
		case '1':
			System.out.println("Freshman");
			break;
		case '2':
			System.out.println("Sophomore");
			
			break;
		case '3':	
			System.out.println("Junior");
			break;
		case '4':
			System.out.println("Senior");
			break;
		}
	}

}
