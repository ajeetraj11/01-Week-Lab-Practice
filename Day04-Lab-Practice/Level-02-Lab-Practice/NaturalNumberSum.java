// Importing Scanner class to handle user input 
import java.util.Scanner;

// This class contains methods to calculate the 
// sum of natural numbers using both recursion and a formula

public class NaturalNumberSum 
{

    // Method to calculate the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) 
	{
        if (n <= 0) 
		{  
            return 0;
        } 
		else 
		{  
		    // Recursively call the method with n - 1
            return n + sumUsingRecursion(n - 1);  
        }
    }

    // Method to calculate the sum of n natural numbers 
	// using the formula n * (n + 1) / 2
    public static int sumUsingFormula(int n) 
	{
	    // Formula-based calculation for the sum of n natural numbers
        return (n * (n + 1)) / 2;  
    }

    // Main method to drive the program
    public static void main(String[] args) 
	{
	    // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
		
		// Prompt user to input a natural number
        System.out.print("Enter a natural number: ");  
        int n = sc.nextInt();  

        // Call the sumUsingRecursion method 
		// to calculate the sum using recursion
        int recursiveSum = sumUsingRecursion(n);
		
        // Call the sumUsingFormula method 
		// to calculate the sum using the formula
        int formulaSum = sumUsingFormula(n);

        // Display both results in a single line
		// and compare whether the sums match
        System.out.println("Sum using recursion: " + recursiveSum + 
                           "\nSum using formula: " + formulaSum + 
                           "\nBoth sums match: " + (recursiveSum == formulaSum));

        // Close the Scanner object 
        sc.close(); 
    }
}
