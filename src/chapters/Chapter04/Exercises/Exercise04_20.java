package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String str = in.next();
		int i = str.length();
		char ch = str.charAt(0);
		System.out.println("Length of word " + i + " The first character of word " + ch);
		
	}
}
