package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises05 {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter the subtotal: ");
	double subtotal = keyboard.nextDouble();
	System.out.println("Enter the gratuity rate : ");
	double gratuity = keyboard.nextDouble();
	double gratuityValue = subtotal / 100 * gratuity;
	double total = gratuityValue + subtotal; 
	System.out.println("The gratuity is $" + gratuityValue + " and total is $" + subtotal);
	}
	
}
