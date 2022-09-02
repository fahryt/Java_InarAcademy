package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises29 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double x1, y1, x2, y2, r1, r2;
	        System.out.print("\nEnter circle1's center x-, y-coordinates, and radius: ");
	        x1 = input.nextDouble();
	        y1 = input.nextDouble();
	        r1 = input.nextDouble();

	        System.out.print("\nEnter circle2's center x-, y-coordinates, and radius: ");
	        x2 = input.nextDouble();
	        y2 = input.nextDouble();
	        r2 = input.nextDouble();


	        if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) 
	    			<= Math.abs(r1 - r2))
	    			System.out.println("circle2 is inside circle1");
	    		else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5)
	    					<= r1 + r2)
	    			System.out.println("circle2 overlaps circle1");
	    		else
	    			System.out.println("circle2 does not overlap circle1");


	    }
}
