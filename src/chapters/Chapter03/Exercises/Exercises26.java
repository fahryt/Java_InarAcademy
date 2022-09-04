<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises26 {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int integer = in.nextInt();
	
	boolean fiveAndSix = integer % 5 == 0 && integer % 6 == 0;
	boolean fiveOrSix = integer % 5 == 0 || integer % 6 == 0;
	boolean fiveSixNot = (integer % 5 == 0 || integer % 6 == 0 ) ^ ( integer % 5 == 0 && integer % 6 == 0);
	
	System.out.println("Is " + integer + " divisible by 5 and 6? " + fiveAndSix );
	System.out.println("Is " + integer + " divisible by 5 and 6? " + fiveOrSix );
	System.out.println("Is " + integer + " divisible by 5 and 6, but not both? " + fiveSixNot );
	
	}

=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises26 {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int integer = in.nextInt();
	
	boolean fiveAndSix = integer % 5 == 0 && integer % 6 == 0;
	boolean fiveOrSix = integer % 5 == 0 || integer % 6 == 0;
	boolean fiveSixNot = (integer % 5 == 0 || integer % 6 == 0 ) ^ ( integer % 5 == 0 && integer % 6 == 0);
	
	System.out.println("Is " + integer + " divisible by 5 and 6? " + fiveAndSix );
	System.out.println("Is " + integer + " divisible by 5 and 6? " + fiveOrSix );
	System.out.println("Is " + integer + " divisible by 5 and 6, but not both? " + fiveSixNot );
	
	}

>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
