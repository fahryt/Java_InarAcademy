package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first city: ");
		String a = in.nextLine();
		System.out.println("Enter the second city: ");
		String b = in.nextLine();
		System.out.println("Enter the third city: ");
		String c = in.nextLine();
		
		//if (a.compareTo(b) < 0) {
			if (b.compareTo(c) < 0) {
				System.out.println("The cities in alphabetical order are " + a + " " + b + " " + c);
			}else if ()	
			}else {
				System.out.println("The cities in alphabetical order are " + a + " " + c + " " + b);
				
				
			}
		}else {
			if (b.compareTo(c) < 0) {
				System.out.println("The cities in alphabetical order are " + a + " " + b + " " + c);
			
		}
	
	}
}
