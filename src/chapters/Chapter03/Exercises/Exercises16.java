package chapters.Chapter03.Exercises;

public class Exercises16 {
	public static void main(String[] args) {
		int x1 = (int)(Math.random() * 2);
		int y1 = (int)(Math.random() * 2);
		
		double x = (double)(Math.random()* 50);
		double y = (double)(Math.random()* 100);
		
		if(x1 == 0) {
			x *= -1;
		}
		if(y1 == 0) {
			y *= -1;	
		}
		System.out.println("The coordinate of the point is x: " + x + " , y " + y);
			
					
		
		
	}
}
