
import java.util.Scanner;
import java.util.Arrays;

// This class named NumberChecker performs various operations on a number
// such as digit analysis, duck number check, Armstrong check, and finding 
// largest/smallest digits.

public class NumberChecker 
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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) 
    {
	    // Start from the second digit
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) 
    {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest digits in the array
    public static int[] findLargestAndSecondLargest(int[] digits) 
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits in the array
    public static int[] findSmallestAndSecondSmallest(int[] digits) 
    {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Number: " + number);

        // Get count of number
        int count = countDigits(number);
        System.out.println("Count: " + count);

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Check if duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find largest and second largest
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestAndSecondLargest[0] + 
                           "\nSecond Largest Digit: " + largestAndSecondLargest[1]);

        // Find smallest and second smallest
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestAndSecondSmallest[0] + 
                           "\nSecond Smallest Digit: " + smallestAndSecondSmallest[1]);

        // Close scanner
        scanner.close();
    }
}



