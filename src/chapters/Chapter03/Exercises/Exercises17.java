<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Exercises17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		int in = input.nextInt();
		
		int num = (int)(Math.random() * 3);
		
		if (in == 0 && num == 1 )
			System.out.println("The computer is rock. You lose.");
		if (in == 0 && num == 0 )
			System.out.println("The computer is scissor. Draw.");
		if (in == 0 && num == 2 )
			System.out.println("The computer is paper. You win.");
		if (in == 1 && num == 0 )
			System.out.println("The computer is scissor. You win.");
		if (in == 1 && num == 1 )
			System.out.println("The computer is rock. Draw.");
		if (in == 0 && num == 2 )
			System.out.println("The computer is paper. You lose.");
		if (in == 2 && num == 1 )
			System.out.println("The computer is paper. You win.");
		if (in == 2 && num == 2 )
			System.out.println("The computer is rock. Draw");
		if (in == 2 && num == 0 )
			System.out.println("The computer is scissor. You lose.");
	
	
	
	}

}
=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Exercises17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		int in = input.nextInt();
		
		int num = (int)(Math.random() * 3);
		
		if (in == 0 && num == 1 )
			System.out.println("The computer is rock. You lose.");
		if (in == 0 && num == 0 )
			System.out.println("The computer is scissor. Draw.");
		if (in == 0 && num == 2 )
			System.out.println("The computer is paper. You win.");
		if (in == 1 && num == 0 )
			System.out.println("The computer is scissor. You win.");
		if (in == 1 && num == 1 )
			System.out.println("The computer is rock. Draw.");
		if (in == 0 && num == 2 )
			System.out.println("The computer is paper. You lose.");
		if (in == 2 && num == 1 )
			System.out.println("The computer is paper. You win.");
		if (in == 2 && num == 2 )
			System.out.println("The computer is rock. Draw");
		if (in == 2 && num == 0 )
			System.out.println("The computer is scissor. You lose.");
	
	
	
	}

}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
