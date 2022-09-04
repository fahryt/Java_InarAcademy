package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter(in lower case) ");
		String str = in.next();
		str = str.toLowerCase();
		char ch = str.charAt(0);

		if (Character.isLetter(ch)) {
			if (ch == 'a') {
				System.out.println(str + " is a vowel");
				System.exit(0);
			}
			if (ch == 'e') {
				System.out.println(str + " is a vowel");
				System.exit(0);			
			}
			
			if (ch == 'i') {
				System.out.println(str + " is a vowel");
				System.exit(0);
			}
			if (ch == 'o') {
				System.out.println(str + " is a vowel");
				System.exit(0);
			}
			if (ch == 'u') {
				System.out.println(str + " is a vowel");
				System.exit(0);
			}
			if (Character.isLetter(ch)) {
				System.out.println(str + " is a consonant");
				System.exit(0);
			}

		}else {
			System.out.println("Invaid input");
			System.exit(0);
		}

	}
}
