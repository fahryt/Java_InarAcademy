package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_15 {
	public static void main(String[] args) {
		String set2 = "abc" ;
		String set3 = "def";
		String set4 = "ghi";
		String set5 = "jkl";
		String set6 = "mno";
		String set7 = "pqrs";
		String set8 = "tuv";
		String set9 = "wxyz";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter ");
		String input = in.next();
		
		input = input.toLowerCase();
		char ch = input.charAt(0);
		
	if (Character.isLetter(ch)) { 
		if (set2.contains(input) ) {
			System.out.println("The correspending number is 2");
			
			}
		if (set3.contains(input) ) {
			System.out.println("The correspending number is 3");
			}
		if (set4.contains(input) ) {
			System.out.println("The correspending number is 4");
			}
		if (set5.contains(input) ) {
			System.out.println("The correspending number is 5");
			}
		if (set6.contains(input) ) {
			System.out.println("The correspending number is 6");
			}
		if (set7.contains(input) ) {
			System.out.println("The correspending number is 7");
			}
		if (set8.contains(input) ) {
			System.out.println("The correspending number is 8");
			}
		if (set9.contains(input) ) {
			System.out.println("The correspending number is 9");
			}
	
		}else 
			System.out.println("Invalid input");
	}
}
