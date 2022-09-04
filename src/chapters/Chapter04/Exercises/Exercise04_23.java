package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_23 {
	public static void main(String[] args) {
		System.out.println("Enter employee's name: ");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		System.out.println("Enter nuber of hours worked in a week: ");
		int hour = in.nextInt();
		System.out.println("Enter hourly pay rate: ");
		double pay = in.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fTax = in.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double sTax = in.nextDouble();
		
		double totalDeduction = fTax * hour * pay + sTax * hour * pay ;
		double net = pay * hour - totalDeduction ;
		double fPay = pay * hour - pay * hour * fTax;
		double sPay = pay * hour - pay * hour * sTax;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked " + hour);
		System.out.println("Pay Rate: $" + pay);
		System.out.println("Gross Pay: $" + pay * hour);
		System.out.println("Deductions:");
		System.out.println(" Federal Withholding ("+ 100 * fTax + "%): $" + fPay);
		System.out.println("State Withholding (" + 100 * sTax + "%): $" + sPay);
		System.out.println("Total Deduction: $" + totalDeduction );
		System.out.println("Net Pay: $" + net);
		
	}

}
