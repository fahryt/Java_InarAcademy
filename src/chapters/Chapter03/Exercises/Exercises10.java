<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises10 {
	 public static void main(String[] args) {
		    int number1 = (int)(Math.random() * 100);
		    int number2 = (int)(Math.random() * 100);

		    System.out.print
		      ("What is " + number1 + " + " + number2 + "? ");
		    Scanner input = new Scanner(System.in);
		    int answer = input.nextInt();

		    if (number1 + number2 == answer)
		      System.out.println("You are correct!");
		    else
		      System.out.println("Your answer is wrong.\n" + number1 + " + "
		        + number2 + " should be " + (number1 + number2)); 
		  }
}
=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises10 {
	 public static void main(String[] args) {
		    // 1. Generate two random single-digit integers
		    int number1 = (int)(Math.random() * 100);
		    int number2 = (int)(Math.random() * 100);

		    // 3. Prompt the student to answer �what is number1 � number2?�
		    System.out.print
		      ("What is " + number1 + " + " + number2 + "? ");
		    Scanner input = new Scanner(System.in);
		    int answer = input.nextInt();

		    // 4. Grade the answer and display the result
		    if (number1 + number2 == answer)
		      System.out.println("You are correct!");
		    else
		      System.out.println("Your answer is wrong.\n" + number1 + " + "
		        + number2 + " should be " + (number1 + number2)); 
		  }
}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
