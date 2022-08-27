package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises13 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		int amount = keyboard.nextInt();
		double interestRate = 0.05/12 ;
		double totalOneMonth = amount * (1 + interestRate );
	    double totalTwoMonth = (100 + totalOneMonth) * (1 + interestRate );
	    double totalThreeMonth = (100 + totalTwoMonth) * (1 + interestRate );
	    double totalFourMonth = (100 + totalThreeMonth) * (1 + interestRate );	
	    double totalFiveMonth = ( 100 + totalFourMonth) * (1 + interestRate )	;
	    double totalSixMonth = (100 + totalFiveMonth) * (1 + interestRate );
	    System.out.println("After the sixth month, the account value is: " + (int)((totalSixMonth * 100)) / 100);
 }

}
