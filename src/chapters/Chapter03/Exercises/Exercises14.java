package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises14 {
	public static void main(String[] args) {
		int num = (int)Math.random();
	    Scanner ınput = new Scanner(System.in);
	    System.out.println("Guees the number ( 0 or 1 )");
	    int answer = ınput.nextInt();
	    if (num == answer) {
	    	System.out.println("Correct");
	    	
	   }
	    else 
	    	System.out.println("It is not correct");
	}

}
