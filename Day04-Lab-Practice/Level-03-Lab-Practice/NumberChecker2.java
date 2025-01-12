import java.util.Arrays;
import java.util.Scanner;

// This class named NumberChecker2 performs various operations on a number, 
// including digit analysis, sum calculations, Harshad number check, 
// and digit frequency analysis.

public class NumberChecker2 
{

    // Method to find the count of digits in a number
    public static int countDigits(int number) 
	{
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) 
	{
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) 
	{
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquares(int[] digits) 
	{
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) 
	{
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) 
	{
	    // 10 rows for digits 0-9, 2 columns for digit and its frequency
        int[][] frequency = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; 
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
		// Get the count of number
		int count = countDigits(number);

        // Get the digit
        int[] digits = getDigitsArray(number);
		
		// Get the sum of digit
        int sumDigits = sumOfDigits(digits);
		
		// Get the sum of squares
        int sumSquares = sumOfSquares(digits);
		
		// check if number and sumDigits is harshad number
        boolean isHarshad = isHarshadNumber(number, sumDigits);
		
		// Create digitFrequency 2d array to find the frequency and digit
        int[][] digitFrequency = findDigitFrequency(digits);

        // Display results
        System.out.println("Number: " + number +
		                   "\nCount: " + count +
                           "\nDigits: " + Arrays.toString(digits) +
                           "\nSum of Digits: " + sumDigits +
                           "\nSum of Squares of Digits: " + sumSquares +
                           "\nIs Harshad Number: " + isHarshad +
                           "\nDigit Frequencies:");
        for (int[] row : digitFrequency) {
			// Display only digits with non-zero frequency
            if (row[1] > 0) { 
                System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
