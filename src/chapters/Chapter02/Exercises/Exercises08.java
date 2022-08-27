package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises08 {
	public static void main(String[] args) {
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds /1000 ;
		long currentSeconds = totalSeconds % 60 ;
		long totalMin = totalSeconds / 60 ;
		long currentMin = totalMin % 60 ; 
		long totalHours = totalMin / 60 ;
		long currentHours = totalHours % 24 ;
		System.out.println("Enter the time zone offset to GMT: ");
		Scanner keyboard = new Scanner (System.in);
		int gmt = keyboard.nextInt();
		System.out.println("The current time is " + (currentHours + gmt ) + " : " + currentMin + " : " + currentSeconds );
		
	}

}
