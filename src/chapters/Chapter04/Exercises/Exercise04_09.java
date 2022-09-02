package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_09 {
	public static void main(String[] args) {
		System.out.println("Enter a character: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char ch = str.charAt(0);
		int i = (int)ch;
		System.out.println("The Unicode for the character " + ch + " is " + i);
		
	}

}
