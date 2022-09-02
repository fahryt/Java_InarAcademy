package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your packages weight: ");
		double weight = input.nextDouble();
		String ship = "";
		
		if (weight > 50 ) {
			System.out.println("The package cannot be shipped.");
			return;
		}else if (weight > 0 && weight <= 1) {
			ship += 3.5;
			
		}else if (weight > 1 && weight <=1) {
			ship += 5.5;
					
		}else if (weight > 3 && weight <=10) {
			ship += 8.5;
			
			
		}else if (weight > 10 && weight <=20) {
			ship += 10.5;
			
		}
		System.out.println("With a package weight of " + weight + " your cost of shipping will be "+ ship);
	}

}
