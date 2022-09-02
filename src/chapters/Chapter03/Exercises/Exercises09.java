package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises09 {
	public static void main(String[] args) {
		Scanner ınput = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer : ");
		int ısbn = ınput.nextInt();
		
		int d1 = ısbn / 100000000;
		int d2 = ısbn / 10000000 % 10 ;
		int d3 = ısbn / 1000000 % 10 ;
		int d4 = ısbn / 100000 % 10 ;
		int d5 = ısbn / 10000 % 10 ;
		int d6 = ısbn / 1000 % 10 ;
		int d7 = ısbn / 100 % 10 ;
		int d8 = ısbn / 10 % 10 ;
		int d9  = ısbn % 10 ;
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6  * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (d10 == 10) {
			System.out.println(d1 +""+ d2+""+ d3 + "" + d4 +""+ d5 +""+ d6 +"" +d7 +""+ d8 +""+ d9 + "X" );
				
		}
			else 
				System.out.println(d1 +""+ d2+""+ d3 + "" + d4 +""+ d5 +""+ d6 +"" +d7 +""+ d8 +""+ d9+"" + d10);
		
	}

}
