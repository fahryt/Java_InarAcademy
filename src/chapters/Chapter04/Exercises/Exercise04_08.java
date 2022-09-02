package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_08 {
	public static void main(String[] args) {
		System.out.println("Enter an ASCII code: ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		char ch = (char)i;
		System.out.println("The character for ASCII code " + i + " is " + ch);
	}

}
