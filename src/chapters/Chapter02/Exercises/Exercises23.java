package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises23 {
	public static void main(String[] args) {
		System.out.println("Enter the driving distance: ");
		Scanner ınput = new Scanner(System.in);
		double distance = ınput.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = ınput.nextDouble();
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = ınput.nextDouble();
		double cost = (distance / milesPerGallon) * pricePerGallon ;
		System.out.println("The cost of driving is $" +  (int)(cost * 100) / 100);
	}

}
