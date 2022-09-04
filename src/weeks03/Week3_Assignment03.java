<<<<<<< HEAD
package weeks03;

import java.util.Scanner;

public class Week3_Assignment03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much is your year of service? ");
		byte year = in.nextByte();
		if (year<5) {
			System.out.println("You will not get the bonus.");
		}
			else {
				System.out.println("Enter your salary: ");
				int salary = in.nextInt();
				double bonus = salary * 0.05;
				double salaryWithBonus = salary * 1.05;
				System.out.println("Your bonus is : " + bonus  );
				System.out.println("Your next salary is : " + salaryWithBonus );
						
			}
		
		}
	}

=======
package weeks03;

import java.util.Scanner;

public class Week3_Assignment03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much is your year of service? ");
		byte year = in.nextByte();
		if (year<5) {
			System.out.println("You will not get the bonus.");
		}
			else {
				System.out.println("Enter your salary: ");
				int salary = in.nextInt();
				double bonus = salary * 0.05;
				double salaryWithBonus = salary * 1.05;
				System.out.println("Your bonus is : " + bonus  );
				System.out.println("Your next salary is : " + salaryWithBonus );
						
			}
		
		}
	}

>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
