package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_22 {
	public static void main(String[] args) {
		System.out.println("Enter string s1: ");
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		System.out.println("Enter string s2: ");
		String s2 = in.next();
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		if (s1.contains(s2)) {
			System.out.println(s2 +" is a substring of " + s1);
			
		}else {
			System.out.println(s2 + " is  not a substring of " + s1);
		}
	}

}
