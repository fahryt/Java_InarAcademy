<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    
		    System.out.print("Enter weight in pounds: ");
		    double weight = input.nextDouble();
		    
		    System.out.print("Enter inches: ");
		    double Inches = input.nextDouble();
		    
		    System.out.println("Enter feet: ");
		    double feet = input.nextDouble();
		    
		    final double KILOGRAMS_PER_POUND = 0.45359237; 
		    final double METERS_PER_INCH = 0.0254;  
		    
		    double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
		    double heightInMeters = (Inches + 12 * feet) * METERS_PER_INCH; 
		    double bmi = weightInKilograms / 
		      (heightInMeters * heightInMeters);

		    System.out.println("BMI is " + bmi);
		    if (bmi < 18.5)
		      System.out.println("Underweight");
		    else if (bmi < 25)
		      System.out.println("Normal");
		    else if (bmi < 30)
		      System.out.println("Overweight");
		    else
		      System.out.println("Obese");
		
	}
		

	}

=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    
		    System.out.print("Enter weight in pounds: ");
		    double weight = input.nextDouble();
		    
		    System.out.print("Enter inches: ");
		    double Inches = input.nextDouble();
		    
		    System.out.println("Enter feet: ");
		    double feet = input.nextDouble();
		    
		    final double KILOGRAMS_PER_POUND = 0.45359237; 
		    final double METERS_PER_INCH = 0.0254;  
		    
		    double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
		    double heightInMeters = (Inches + 12 * feet) * METERS_PER_INCH; 
		    double bmi = weightInKilograms / 
		      (heightInMeters * heightInMeters);

		    System.out.println("BMI is " + bmi);
		    if (bmi < 18.5)
		      System.out.println("Underweight");
		    else if (bmi < 25)
		      System.out.println("Normal");
		    else if (bmi < 30)
		      System.out.println("Overweight");
		    else
		      System.out.println("Obese");
		
	}
		

	}

>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
