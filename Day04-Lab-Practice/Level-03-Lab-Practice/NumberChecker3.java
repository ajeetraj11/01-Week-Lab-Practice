import java.util.Arrays;
import java.util.Scanner;

// This class named NumberChecker3 performs operations such as digit analysis,
// reversing arrays, palindrome check, and duck number validation.

public class NumberChecker3 
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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] array) 
	{
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) 
	{
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) 
	{
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) 
	{
        int[] digits = getDigitsArray(number);
		
		// Duck number must have a '0' not at the start
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
		// Get count of the number
        int count = countDigits(number);

        // Get digits array
        int[] digits = getDigitsArray(number);

        // Reverse digits array
        int[] reversedDigits = reverseArray(digits);
		
	    // Compare if the two array is a equal
        boolean compareToArray = areArraysEqual(digits, reversedDigits);

        // Check if the number is a palindrome
        boolean palindrome = isPalindrome(number);

        // Check if the number is a duck number
        boolean duckNumber = isDuckNumber(number);

        // Display results
        System.out.println("Number: " + number +
		                   "\nCount: " + count +
                           "\nDigits: " + Arrays.toString(digits) +
                           "\nReversed Digits: " + Arrays.toString(reversedDigits) +
						   "\nCompare two Array: " + compareToArray +
                           "\nIs Palindrome: " + palindrome +
                           "\nIs Duck Number: " + duckNumber);

        // Close the scanner
        scanner.close();
    }
}
