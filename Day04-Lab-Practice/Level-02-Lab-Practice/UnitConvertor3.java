import java.util.Scanner;

// Create a class named UnitConvertor3 to convert from one unit to another unit

public class UnitConvertor3 
{

    // Converts Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) 
	{
	    double farhenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Converts Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) 
	{
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
    }

    // Converts pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) 
	{
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Converts kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) 
	{
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Converts gallons to liters
    public static double convertGallonsToLiters(double gallons) 
	{
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Converts liters to gallons
    public static double convertLitersToGallons(double liters) 
	{
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) 
	{
	    // Create a scanner class to take user input
        Scanner scanner = new Scanner(System.in);

        // Input and conversion
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        
		// Input and conversion
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);

        // Input and conversion
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);

        // Input and conversion
        System.out.print("Enter weight in kilograms: ");
        double kilograms = scanner.nextDouble();
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);

        // Input and conversion
        System.out.print("Enter volume in gallons: ");
        double gallons = scanner.nextDouble();
        double litersFromGallons = convertGallonsToLiters(gallons);

        // Input and conversion
        System.out.print("Enter volume in liters: ");
        double liters = scanner.nextDouble();
        double gallonsFromLiters = convertLitersToGallons(liters);

        // Print all results 
        System.out.println(
                "Temperature conversions:\n" +
                "Fahrenheit to Celsius: " + celsiusFromFahrenheit + "\n" +
                "Celsius to Fahrenheit: " + fahrenheitFromCelsius + "\n\n" +
                "Weight conversions:\n" +
                "Pounds to Kilograms: " + kilogramsFromPounds + "\n" +
                "Kilograms to Pounds: " + poundsFromKilograms + "\n\n" +
                "Volume conversions:\n" +
                "Gallons to Liters: " + litersFromGallons + "\n" +
                "Liters to Gallons: " + gallonsFromLiters
        );
		
        // Close the Scanner object
        scanner.close();
    }
}
