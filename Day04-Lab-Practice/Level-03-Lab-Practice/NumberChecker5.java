import java.util.Scanner;

// This class named NumberChecker5 performs operations such as 
// finding factors, checking if a number is perfect, abundant, deficient, and strong.

public class NumberChecker5 
{

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) 
	{
        int count = 0;
        
        // Count the number of factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) count++;
        }
        
        // Create an array to store factors
        int[] factors = new int[count];
        int index = 0;
        
        // Store the factors in the array
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors; // Return the factors array
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) 
	{
        int[] factors = findFactors(number);
        int greatest = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatest) greatest = factors[i];
        }
        return greatest; // Return the greatest factor
    }

    // Method to find the sum of the factors using the factors array and return the sum
    public static int sumOfFactors(int number) 
	{
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor; // Sum the factors
        }
        return sum; // Return the sum of factors
    }

    // Method to find the product of the factors using 
	// the factors array and return the product
    public static int productOfFactors(int number) 
	{
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor; // Multiply the factors
        }
        return product; // Return the product of factors
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubeOfFactors(int number) 
	{
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube each factor and multiply
        }
        return product; // Return the product of the cubes of factors
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) 
	{
        int sum = sumOfFactors(number);
        return sum == number; 
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundant(int number) 
	{
        int sum = sumOfFactors(number);
        return sum > number; 
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficient(int number) 
	{
        int sum = sumOfFactors(number);
        return sum < number; 
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int number) 
	{
        int sum = 0;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit); 
            temp /= 10;
        }
        
        return sum == number; 
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int n) 
	{
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // Calculate factorial
        }
        return fact;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call methods and display results in one println method
        System.out.println(
            "Number: " + number + "\n" +
            "Factors: " + java.util.Arrays.toString(findFactors(number)) + "\n" +
            "Greatest Factor: " + greatestFactor(number) + "\n" +
            "Sum of Factors: " + sumOfFactors(number) + "\n" +
            "Product of Factors: " + productOfFactors(number) + "\n" +
            "Product of Cube of Factors: " + productOfCubeOfFactors(number) + "\n" +
            "Is Perfect: " + isPerfect(number) + "\n" +
            "Is Abundant: " + isAbundant(number) + "\n" +
            "Is Deficient: " + isDeficient(number) + "\n" +
            "Is Strong: " + isStrong(number)
        );
    
	    // Close the scanner
        sc.close();
    }
}
