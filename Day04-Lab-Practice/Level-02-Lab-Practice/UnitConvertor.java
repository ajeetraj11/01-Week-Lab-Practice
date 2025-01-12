import java.util.Scanner;

// Create a class named UnitConvertor to convert from one unit to another unit

public class UnitConvertor 
{

    // Method to convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) 
	{
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers and return the value
    public static double convertMilesToKm(double miles) 
	{
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet and return the value
    public static double convertMetersToFeet(double meters) 
	{
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters and return the value
    public static double convertFeetToMeters(double feet) 
	{
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt for take user inputs for kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = convertKmToMiles(km);

        // Prompt for take user inputs for miles
        System.out.print("Enter the distance in miles: ");
        double milesInput = sc.nextDouble();
        double kmConverted = convertMilesToKm(milesInput);
 
        // Prompt for take user inputs for meters
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();
        double feet = convertMetersToFeet(meters);
 
        // Prompt for take user inputs for feet
        System.out.print("Enter the distance in feet: ");
        double feetInput = sc.nextDouble();
        double metersConverted = convertFeetToMeters(feetInput);

        // Print all the results 
        System.out.println(km + " kilometers is equal to " + miles + " miles. " + 
		                   "\n" + milesInput + " miles is equal to " + kmConverted + " kilometers. " + 
						   "\n" + meters + " meters is equal to " + feet + " feet. " + 
						   "\n" + feetInput + " feet is equal to " + metersConverted + " meters.");

        // Close the Scanner object 
        sc.close();
    }
}
