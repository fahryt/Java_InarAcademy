<<<<<<< HEAD
package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises11 {
	public static void main(String[] args) {
		long currentpopulation = 312032486;
    	double secondsofyear = 365 * 24 * 60 * 60 ;
    	double birthsec = 1.0/7 ;
    	double deathsec = 1.0/13 ;
    	double imigrantsec = 1.0/45 ;
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Enter the number of years: ");
    	int numofYears = keyboard.nextInt();
    	currentpopulation += ( numofYears * secondsofyear * (birthsec + deathsec - imigrantsec ));
    	System.out.println("The population in " + numofYears + " years is " + currentpopulation);
	}

}
=======
package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises11 {
	public static void main(String[] args) {
		long currentpopulation = 312032486;
    	double secondsofyear = 365 * 24 * 60 * 60 ;
    	double birthsec = 1.0/7 ;
    	double deathsec = 1.0/13 ;
    	double imigrantsec = 1.0/45 ;
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Enter the number of years: ");
    	int numofYears = keyboard.nextInt();
    	currentpopulation += ( numofYears * secondsofyear * (birthsec + deathsec - imigrantsec ));
    	System.out.println("The population in " + numofYears + " years is " + currentpopulation);
	}

}
>>>>>>> 0f162954b3bcf0bc923c8ba45f1c609d3cca264e
