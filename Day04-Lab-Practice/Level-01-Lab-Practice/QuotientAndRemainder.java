// Importing Scanner for user input
import java.util.Scanner; 

// Class to find the quotient and remainder of two numbers

public class QuotientAndRemainder 
{

    // Method to find the quotient and remainder of two numbers
    public static int[] findQuotientAndRemainder(int dividend, int divisor) 
	{
        // Calculate the quotient using division
        int quotient = dividend / divisor; 

        // Calculate the remainder using modulus operator
        int remainder = dividend % divisor; 

        // Return the results as an array
		// Array contains quotient and remainder
        return new int[]{quotient, remainder}; 
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the dividend
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt(); 

        // Prompt the user to enter the divisor
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt(); 

        // Call the method to find the quotient 
		// and remainder and store the result array
        int[] result = findQuotientAndRemainder(dividend, divisor); 

        // Display the quotient and remainder
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);

        // Close the Scanner object 
        sc.close();
    }
}
