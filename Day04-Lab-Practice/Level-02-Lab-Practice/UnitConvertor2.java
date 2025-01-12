import java.util.Scanner;

// Create a class named UnitConvertor2 to convert from one unit to another unit

public class UnitConvertor2 {

    // Method to convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) 
	{
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards and return the value
    public static double convertFeetToYards(double feet) 
	{
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches and return the value
    public static double convertMetersToInches(double meters) 
	{
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters and return the value
    public static double convertInchesToMeters(double inches) 
	{
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters and return the value
    public static double convertInchesToCm(double inches) 
	{
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method to interact with the user and perform conversions
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt for take user inputs for yards
        System.out.print("Enter the distance in yards: ");
        double yards = sc.nextDouble();
        double feetFromYards = convertYardsToFeet(yards);
 
        // Prompt for take user inputs for feet
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        double yardsFromFeet = convertFeetToYards(feet);

        // Prompt for take user inputs for meters
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();
        double inchesFromMeters = convertMetersToInches(meters);

        // Prompt for take user inputs for inches
        System.out.print("Enter the distance in inches: ");
        double inches = sc.nextDouble();
        double metersFromInches = convertInchesToMeters(inches);
        double cmFromInches = convertInchesToCm(inches);

        // Print all the results 
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet. " +
                "\n" + feet + " feet is equal to " + yardsFromFeet + " yards. " +
                "\n" + meters + " meters is equal to " + inchesFromMeters + " inches. " +
                "\n" + inches + " inches is equal to " + metersFromInches + " meters. " +
                "\n" + inches + " inches is equal to " + cmFromInches + " centimeters.");

        // Close the Scanner object to prevent resource leak
        sc.close();
    }
}
