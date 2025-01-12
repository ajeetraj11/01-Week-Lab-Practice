import java.util.Scanner;

// This class named NumberChecker4 performs operations such as 
// checking if a number is prime, neon, spy, automorphic, or buzz.

public class NumberChecker4 
{

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) 
	{
        if (number <= 1) return false; // Prime numbers are greater than 1
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // If divisible, not prime
        }
        return true; // If no divisor found, number is prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) 
	{
        int square = number * number; // Calculate the square of the number
        int sum = 0;
        while (square > 0) {
            sum += square % 10; // Sum of digits of the square
            square /= 10;
        }
        return sum == number; // Check if the sum equals the original number
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) 
	{
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit; // Sum of digits
            product *= digit; // Product of digits
            number /= 10;
        }
        return sum == product; // Check if sum equals product
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) 
	{
	    // Calculate the square of the number
        int square = number * number; 
        return String.valueOf(square).endsWith(String.valueOf(number)); 
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) 
	{
	    // Divisible by 7 or ends with 7
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call methods and display results
        System.out.println("Number: " + number + "\n" +
                "Is Prime: " + isPrime(number) + "\n" +
                "Is Neon: " + isNeon(number) + "\n" +
                "Is Spy: " + isSpy(number) + "\n" +
                "Is Automorphic: " + isAutomorphic(number) + "\n" +
                "Is Buzz: " + isBuzz(number));

        // Close the scanner
		sc.close();
    }
}
