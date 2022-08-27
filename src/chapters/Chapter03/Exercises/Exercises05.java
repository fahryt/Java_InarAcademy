package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises05 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int today = keyboard.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsedDay = keyboard.nextInt();
		int futureDay = (today + elapsedDay) % 7;
		
	switch (today) {
		case 0: 
			
			System.out.println("Today is Sunday and the future day is ");
			break;
		case 1: 
			
			System.out.println("Today is Monday and the future day is ");
						
			break;
		case 2: 
			
			System.out.println("Today is Tuesday and the future day is ");
			break;
		case 3: 
			
			System.out.println("Today is Wednesday and the future day is ");
			break;
		case 4: 
	
			System.out.println("Today is Thursday and the future day is ");
			break;
	
		case 5: 
	
			System.out.println("Today is Friday and the future day is ");
			break;
		case 6: 
	
			System.out.println("Today is Saturday and the future day is ");
			break;
		}
	
		switch (futureDay) {
		case 0: 
			
			System.out.println("Sunday");
			break;
		case 1: 
			
			System.out.println("Monday");
			break;
		case 2: 
	
			System.out.println("Tuesday");
			break;
		case 3: 
	
			System.out.println("Wednesday");
			break;
		case 4: 
	
			System.out.println("Thursday");
			break;
		case 5: 
	
			System.out.println("Friday");
			break;
		case 6: 
			
			System.out.println("Saturday");
			break;
	
		}
	

		
			   
		
			
		}
	}


