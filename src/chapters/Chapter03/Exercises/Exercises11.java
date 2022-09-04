<<<<<<< HEAD
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises11 {
	public static void main(String[] args) {
	

	Scanner input = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = input.nextInt();
    System.out.println("Enter a month: ");
    int month = input.nextInt();

    boolean isLeapYear = 
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   
    if (isLeapYear) {
    	switch (month) {
		case 1: {
			
			System.out.println("January " + year + ", is 31 day");
			break;
		}
		case 2: {
			
			System.out.println("February " + year + ", is 29 day");
			break;
		}
		case 3: {
			
			System.out.println("March " + year + ", is 31 day");
			break;
    	}
			
		case 4: {
			
			System.out.println("April " + year + ", is 30 day");}
			break;
		case 5: {
			
			System.out.println("May " + year + ", is 31 day");
			break;
		}
	
		case 6: {
			
			System.out.println("June " + year + ", is 30 day");
			break;
		}	
		case 7: {
			
			System.out.println("July " + year + ", is 31 day");}
			break;
		case 8: {
			
			System.out.println("August " + year + ", is 31 day");
			break;
		}
		case 9: {
			
			System.out.println("September " + year + ", is 30 day");
			break;
		}
		case 10 : {
			
			System.out.println("October " + year + ", is 31 day");}
			break;
		case 11: {
			
			System.out.println("November " + year + ", is 30 day");
			break;
		}
		case 12: {
			
			System.out.println("December " + year + ", is 31 day");
			break;
		}
    	}
    }
    	
    
    	
    	else 
    		switch (month) {
    		case 1: {
    			
    			System.out.println("January " + year + ", is 31 day");
    			break;
    		}
    		case 2: {
    			
    			System.out.println("February " + year + ", is 28 day");
    			break;
    
    		}
    		case 3: {
    			
    			System.out.println("March " + year + ", is 31 day");
    			break;
    			
    		}
    		case 4: {
    			
    			System.out.println("April " + year + ", is 30 day");}
    			break;
    		case 5: {
    			
    			System.out.println("May " + year + ", is 31 day");
    			break;
    		}
    		case 6: {
    			
    			System.out.println("June " + year + ", is 30 day");
    			break;
    		
    		}	
    		case 7: {
    			
    			System.out.println("July " + year + ", is 31 day");}
    			break;
    		case 8: {
    			
    			System.out.println("August " + year + ", is 31 day");
    			break;
    		}
    		case 9: {
    			
    			System.out.println("September " + year + ", is 30 day");
    			break;
    		}
    		case 10 : {
    			
    			System.out.println("October " + year + ", is 31 day");}
    			break;
    		case 11: {
    			
    			System.out.println("November " + year + ", is 30 day");
    			break;
    		}
    		case 12: {
    			
    			System.out.println("December " + year + ", is 31 day");
    			break;
    		}
    
    }
	}
=======
package chapters.Chapter03.Exercises;

import java.util.Scanner;

public class Exercises11 {
	public static void main(String[] args) {
	

	Scanner input = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = input.nextInt();
    System.out.println("Enter a month: ");
    int month = input.nextInt();

    boolean isLeapYear = 
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   
    if (isLeapYear) {
    	switch (month) {
		case 1: {
			
			System.out.println("January " + year + ", is 31 day");
			break;
		}
		case 2: {
			
			System.out.println("February " + year + ", is 29 day");
			break;
		}
		case 3: {
			
			System.out.println("March " + year + ", is 31 day");
			break;
    	}
			
		case 4: {
			
			System.out.println("April " + year + ", is 30 day");}
			break;
		case 5: {
			
			System.out.println("May " + year + ", is 31 day");
			break;
		}
	
		case 6: {
			
			System.out.println("June " + year + ", is 30 day");
			break;
		}	
		case 7: {
			
			System.out.println("July " + year + ", is 31 day");}
			break;
		case 8: {
			
			System.out.println("August " + year + ", is 31 day");
			break;
		}
		case 9: {
			
			System.out.println("September " + year + ", is 30 day");
			break;
		}
		case 10 : {
			
			System.out.println("October " + year + ", is 31 day");}
			break;
		case 11: {
			
			System.out.println("November " + year + ", is 30 day");
			break;
		}
		case 12: {
			
			System.out.println("December " + year + ", is 31 day");
			break;
		}
    	}
    }
    	
    
    	
    	else 
    		switch (month) {
    		case 1: {
    			
    			System.out.println("January " + year + ", is 31 day");
    			break;
    		}
    		case 2: {
    			
    			System.out.println("February " + year + ", is 28 day");
    			break;
    
    		}
    		case 3: {
    			
    			System.out.println("March " + year + ", is 31 day");
    			break;
    			
    		}
    		case 4: {
    			
    			System.out.println("April " + year + ", is 30 day");}
    			break;
    		case 5: {
    			
    			System.out.println("May " + year + ", is 31 day");
    			break;
    		}
    		case 6: {
    			
    			System.out.println("June " + year + ", is 30 day");
    			break;
    		
    		}	
    		case 7: {
    			
    			System.out.println("July " + year + ", is 31 day");}
    			break;
    		case 8: {
    			
    			System.out.println("August " + year + ", is 31 day");
    			break;
    		}
    		case 9: {
    			
    			System.out.println("September " + year + ", is 30 day");
    			break;
    		}
    		case 10 : {
    			
    			System.out.println("October " + year + ", is 31 day");}
    			break;
    		case 11: {
    			
    			System.out.println("November " + year + ", is 30 day");
    			break;
    		}
    		case 12: {
    			
    			System.out.println("December " + year + ", is 31 day");
    			break;
    		}
    
    }
	}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
}