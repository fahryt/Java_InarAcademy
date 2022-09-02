package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			System.out.println("Enter a point with two coordinates: ");
			double x1 = 0;
			double y1 = 0;
			
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			
			double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			
			String x= "";
			if (distance <=10) {
				x += "is in the circle";
				
			}else {
				x += "is not in the circle";
				
			}
			System.out.println("Point (" + x2 + ", " + y2 + ") " + x);
	
	}

}
