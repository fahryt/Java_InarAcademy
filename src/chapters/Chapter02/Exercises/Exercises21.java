package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises21 {
	public static void main(String[] args) {
		System.out.println("Enter investment amount : ");
		Scanner keyboard = new Scanner(System.in);
		double investmentAmount = keyboard.nextDouble();
		System.out.println("Enter annual interest rate in percentage : ");
		double monthlyInterestRate = keyboard.nextDouble();
		System.out.println("Enter number of years : ");
		double numberOfYears = keyboard.nextDouble();
		double futureInvestmentValue = ( investmentAmount * (1 + monthlyInterestRate)) * numberOfYears * 12 ;
		System.out.println("Accumulated value is $" + futureInvestmentValue );		
	//think about it
	}

}
