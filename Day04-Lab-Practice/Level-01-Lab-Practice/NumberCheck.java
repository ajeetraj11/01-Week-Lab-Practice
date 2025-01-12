// Importing the Scanner class for user input
import java.util.Scanner; 

// Class to check whether a number is positive, negative, or zero

public class NumberCheck 
{

    // Method to check if the number is positive, negative, or zero
    public static int checkNumberSign(int number) 
	{
        // Check if the number is negative
        if (number < 0) 
		{
		    // Return -1 if the number is negative
            return -1; 
        }
        // Check if the number is positive
        else if (number > 0) 
		{ 
		    // Return 1 if the number is positive
            return 1; 
        }
        // If neither, the number must be zero
        else 
		{
		    // Return 0 if the number is zero
            return 0; 
        }
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is positive, negative, or zero: ");
        int number = sc.nextInt(); 

        // Call the method to check the sign of the number
		// and store the result of the sign check
        int result = checkNumberSign(number); 
		
        // Display the appropriate message based on the result
        if (result == -1) 
		{
            System.out.println("The number " + number + " is negative.");
        }
		else if (result == 1) 
		{
            System.out.println("The number " + number + " is positive.");
        } 
		else 
		{
            System.out.println("The number " + number + " is zero.");
        }

        // Close the Scanner object 
        sc.close();
    }
}
