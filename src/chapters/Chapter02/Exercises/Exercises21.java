package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter year (e.g. 2012) : ");
		int y = in.nextInt();
		
		System.out.println("Enter month 1-12 : ");
		int m = in.nextInt();
		
		System.out.println("Enter the day of the month : ");
		int q = in.nextInt();
		
		int j = y / 100   ;
		int k = (y % 100 ) ;
		
		if (m == 2) {
			m = 14 ;
			y--;
		}
		if (m == 1) {
			m = 13 ;
			y--;
		}
		
		
		
		int h = ( q +((26 * m + 26) /10) + k + (k / 4) + (j / 4) + 5 * j) % 7;
		
		switch (h) {
		case 0: 
			
			System.out.println("Day of the week is Saturday");
			break;
		
		case 1: 
			
			System.out.println("Day of the week is Sunday");
			break;	
		case 2: 
			
			System.out.println("Day of the week is Monday");
			break;	
		case 3: 
	
			System.out.println("Day of the week is Tuesday");
		break;		
		case 4: 
	
			System.out.println("Day of the week is Wednesday");
		break;	
		case 5: 
	
			System.out.println("Day of the week is Thursday");
		break;	
		case 6: 
	
			System.out.println("Day of the week is Friday");
		break;	
		}
	}
}

