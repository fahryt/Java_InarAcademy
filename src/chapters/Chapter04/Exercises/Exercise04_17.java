package chapters.Chapter04.Exercises;

import java.util.Scanner;

public class Exercise04_17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a year: ");
	    int year = input.nextInt();
	    System.out.println("Enter a month: ");
	    String month = input.next();

	    boolean isLeapYear = 
	      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	   
	    if (isLeapYear) {
	    	switch (month) {
			case "Jan": {
				
				System.out.println("January " + year + ", is 31 day");
				break;
			}
			case "Feb": {
				
				System.out.println("February " + year + ", is 29 day");
				break;
			}
			case "Mar": {
				
				System.out.println("March " + year + ", is 31 day");
				break;
	    	}
				
			case "Apr": {
				
				System.out.println("April " + year + ", is 30 day");}
				break;
			case "May": {
				
				System.out.println("May " + year + ", is 31 day");
				break;
			}
		
			case "Jun": {
				
				System.out.println("June " + year + ", is 30 day");
				break;
			}	
			case "Jul": {
				
				System.out.println("July " + year + ", is 31 day");}
				break;
			case "Aug": {
				
				System.out.println("August " + year + ", is 31 day");
				break;
			}
			case "Sep": {
				
				System.out.println("September " + year + ", is 30 day");
				break;
			}
			case "Oct": {
				
				System.out.println("October " + year + ", is 31 day");}
				break;
			case "Nov": {
				
				System.out.println("November " + year + ", is 30 day");
				break;
			}
			case "Dec": {
				
				System.out.println("December " + year + ", is 31 day");
				break;
			}
	    	}
	    }
	    	
	    
	    	
	    	else 
	    		switch (month) {
	    		case "Jan": {
	    			
	    			System.out.println("January " + year + ", is 31 day");
	    			break;
	    		}
	    		case "Feb": {
	    			
	    			System.out.println("February " + year + ", is 28 day");
	    			break;
	    
	    		}
	    		case "Mar": {
	    			
	    			System.out.println("March " + year + ", is 31 day");
	    			break;
	    			
	    		}
	    		case "Apr": {
	    			
	    			System.out.println("April " + year + ", is 30 day");}
	    			break;
	    		case "May": {
	    			
	    			System.out.println("May " + year + ", is 31 day");
	    			break;
	    		}
	    		case "Jun": {
	    			
	    			System.out.println("June " + year + ", is 30 day");
	    			break;
	    		
	    		}	
	    		case "Jul": {
	    			
	    			System.out.println("July " + year + ", is 31 day");}
	    			break;
	    		case "Aug": {
	    			
	    			System.out.println("August " + year + ", is 31 day");
	    			break;
	    		}
	    		case "Sep": {
	    			
	    			System.out.println("September " + year + ", is 30 day");
	    			break;
	    		}
	    		case "Oct" : {
	    			
	    			System.out.println("October " + year + ", is 31 day");}
	    			break;
	    		case "Nov": {
	    			
	    			System.out.println("November " + year + ", is 30 day");
	    			break;
	    		}
	    		case "Dec": {
	    			
	    			System.out.println("December " + year + ", is 31 day");
	    			break;
	    		}
	    
	    }
	}

}
