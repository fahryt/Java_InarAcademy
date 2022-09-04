<<<<<<< HEAD
package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises07 {
 public static void main(String[] args) {
	System.out.println("Enter the number of minutes: ");
	Scanner keyboard = new Scanner(System.in);
	int min = keyboard.nextInt();
	int day = 60 * 24 ;
	int yearValue = min / (day * 365 );
	int dayValue = (min / day % 365 ) ;
	int minValue = min % 24 * 60 ;
System.out.println(min + " minutes is approximately " + yearValue + (" years and " + dayValue + (" days and ") + 
	minValue +	(" minutes.")) );	
}
}
=======
package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises07 {
 public static void main(String[] args) {
	System.out.println("Enter the number of minutes: ");
	Scanner keyboard = new Scanner(System.in);
	int min = keyboard.nextInt();
	int day = 60 * 24 ;
	int yearValue = min / (day * 365 );
	int dayValue = (min / day % 365 ) ;
	int minValue = min % 24 * 60 ;
System.out.println(min + " minutes is approximately " + yearValue + (" years and " + dayValue + (" days and ") + 
	minValue +	(" minutes.")) );	
}
}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
