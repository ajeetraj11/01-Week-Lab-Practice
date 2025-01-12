// Importing Scanner class to allow user input from console
import java.util.Scanner;
  
// This class contains methods to find the factors of 
// a number and perform various calculations on those factors

public class FactorFinder 
{

    // Method to find factors of the given number
    public static int[] findFactors(int number) 
	{
	    // Initialize the counter to zero, which will track the number of factors
        int count = 0;  
        // Loop through all numbers from 1 to the given number to check if they are factors
        for (int i = 1; i <= number; i++) 
		{
		    // If the number is divisible by 'i', then 'i' is a factor of 'number'
            if (number % i == 0) 
			{ 
			    // Increment the factor count for each factor found
                count++;  
            }
        }

        // Create an array to store the factors of the 
		// number, with the size equal to the number of factors
        int[] factors = new int[count];
		
		// Initialize the index variable to store factors in the array
        int index = 0;  
		
        // Loop again to store each factor in the array
        for (int i = 1; i <= number; i++) 
		{
		    // Check if 'i' is a factor of 'number'
            if (number % i == 0) 
			{  
			    // Store the factor at the current index in the factors array
                factors[index] = i; 
				
				// Move to the next index to store the next factor
                index++;  
            }
        }
		// Return the array containing the factors of the number
        return factors;  
    }

    // Method to calculate the sum of the factors from the factors array
    public static int sumFactors(int[] factors) 
	{
	    // Initialize the sum to zero
        int sum = 0;  
        // Loop through each element of the factors array and add it to the sum
        for (int factor : factors) 
		{
		    // Add the value of the current factor to the sum
            sum += factor;  
        }
		// Return the calculated sum of factors
        return sum;  
    }

    // Method to calculate the sum of squares of the factors
    public static int sumSquareFactors(int[] factors) 
	{
	    // Initialize the sum to zero
        int sum = 0;  
        // Loop through each factor and add its square to the sum
        for (int factor : factors) 
		{
		    // Add the square of the current factor to the sum
            sum += Math.pow(factor, 2);  
        }
		// Return the sum of squares of factors
        return sum;  
    }

    // Method to calculate the product of the factors
    public static int productFactors(int[] factors) 
	{
	    // Initialize the product to 1
        int product = 1;  
		
        // Loop through the factors array and multiply each factor to the product
        for (int factor : factors) 
		{
		    // Multiply the current factor to the product
            product *= factor;  
        }
		// Return the final product of the factors
        return product;  
    }

    // Main method to drive the program
    public static void main(String[] args) 
	{
	    // Create a Scanner object for reading user input
        Scanner sc = new Scanner(System.in); 

        // Prompt the user to enter a number		
        System.out.print("Enter a number: ");  
        int number = sc.nextInt();  

        // Call the findFactors method to get the factors of the number
        int[] factors = findFactors(number);
		
        // Call the sumFactors method to calculate the sum of factors
        int sum = sumFactors(factors);
		
        // Call the sumSquareFactors method to calculate the sum of squares of factors
        int sumOfSquares = sumSquareFactors(factors);
		
        // Call the productFactors method to calculate the product of factors
        int product = productFactors(factors);

        // Display the results of all calculations in a single line using concatenation
        System.out.println("Factors: " + java.util.Arrays.toString(factors) + 
                           "\nSum of Factors: " + sum + 
                           "\nSum of Squares of Factors: " + sumOfSquares + 
                           "\nProduct of Factors: " + product);

        // Close the Scanner object
		sc.close();  
    }
}
