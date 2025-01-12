// Importing Scanner for user input
import java.util.Scanner; 

// Class to calculate the number of rounds an athlete 
// needs to complete a 5km run in a triangular park
public class AthleteRounds 
{

    // Method to calculate the number of rounds required
    public static double calculateRounds(double side1, double side2, double side3) 
	{
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3; // Sum of all three sides

        // Convert 5 km to meters (as the sides are in meters)
        double totalDistance = 5000; // 5 km = 5000 meters

        // Calculate the number of rounds needed
		double round = totalDistance / perimeter;
		
		// return the calculated value 
        return round;
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first side of the triangular park
        System.out.print("Enter the first side of the triangle in meters: ");
        double side1 = sc.nextDouble();

        // Prompt the user to enter the second side of the triangular park
        System.out.print("Enter the second side of the triangle in meters: ");
        double side2 = sc.nextDouble(); 

        // Prompt the user to enter the third side of the triangular park
        System.out.print("Enter the third side of the triangle in meters: ");
        double side3 = sc.nextDouble(); 

        // Call the method to calculate the number of rounds required
        double rounds = calculateRounds(side1, side2, side3);

        // Display the number of rounds required
        System.out.println("The athlete needs to complete approximately " + 
                           Math.ceil(rounds) + " rounds to cover 5 km.");

        // Close the Scanner object 
        sc.close();
    }
}
