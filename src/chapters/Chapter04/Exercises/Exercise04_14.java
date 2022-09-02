package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String str = in.next();
		str = str.toUpperCase();
		char ch = str.charAt(0);
		
		if (Character.isLetter(ch)) {
			switch (ch) {
			case 'A':
				System.out.println("The numeric value for grade 4");
				break;
			case 'B':
				System.out.println("The numeric value for grade 3");
				break;
			case 'C':
				System.out.println("The numeric value for grade 2");
				break;
			case 'D':
				System.out.println("The numeric value for grade 1");
				break;
			case 'F':
				System.out.println("The numeric value for grade 0");
				break;	
			}
		}else {
			System.out.println("Invalid input");
		}
	}

}
