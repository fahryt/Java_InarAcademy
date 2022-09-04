<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		double x4 = in.nextDouble();
		double y4 = in.nextDouble();
		
		double a = y1 - y2;
		double b = -(x1 - x2);
		double c = y3 - y4;
		double d = -(x3-x4);
		double e = a * x1 + b * y1;
		double f = c * x3 + d * y3;
		
		double intercept = a * d - b * c ;
		
		if (intercept < 0.0) {
			System.out.println("The equation has no solution because the lines are parallel.")
			;
		}else  {
			double x = (e * d - b * f) / intercept;
			double y = (a * f - e * c) / intercept;
			System.out.println("The intersecting point is at (" + x + "," + y + ")");
			
		}
	
	}
	

}
=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		double x4 = in.nextDouble();
		double y4 = in.nextDouble();
		
		double a = y1 - y2;
		double b = -(x1 - x2);
		double c = y3 - y4;
		double d = -(x3-x4);
		double e = a * x1 + b * y1;
		double f = c * x3 + d * y3;
		
		double intercept = a * d - b * c ;
		
		if (intercept < 0.0) {
			System.out.println("The equation has no solution because the lines are parallel.")
			;
		}else  {
			double x = (e * d - b * f) / intercept;
			double y = (a * f - e * c) / intercept;
			System.out.println("The intersecting point is at (" + x + "," + y + ")");
			
		}
	
	}
	

}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
