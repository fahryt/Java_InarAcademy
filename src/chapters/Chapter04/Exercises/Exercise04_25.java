package chapters.Chapter04.Exercises;

public class Exercise04_25 {
	public static void main(String[] args) {
		int i = (int)((Math.random() * 26) + 65);
		char ch = (char)i ;
		
		int i1 = (int)((Math.random() * 26) + 65);
		char ch1 = (char)i1 ;
		
		int i2 = (int)((Math.random() * 26) + 65);
		char ch2 = (char)i2 ;
		
		int n = (int)((Math.random() * 9) + 1);
		int n1 = (int)((Math.random() * 9) + 1);
		int n2 = (int)((Math.random() * 9) + 1);
		int n3 = (int)((Math.random() * 9) + 1);
		
		System.out.println("The vehicle plate is : " + ch + ch1 + ch2 + n + n1 + n2 + n3 );
	}
}
