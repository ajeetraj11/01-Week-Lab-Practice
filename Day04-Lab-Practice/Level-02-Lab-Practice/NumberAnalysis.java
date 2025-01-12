import java.util.Scanner;

// Class to perform number analysis and comparison

public class NumberAnalysis 
{

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) 
	{
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) 
	{
        return number % 2 == 0;
    }

    // Method to compare two numbers and return 1 if number1 > number2,
    // 0 if both are equal, or -1 if number1 < number2
    public static int compare(int number1, int number2)
	{
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) 
	{
        // Array to store 5 numbers
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Take user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) 
		{
            numbers[i] = scanner.nextInt();
        }

        // Process each number
        System.out.println("\nNumber Analysis Results:");
        for (int i = 0; i < numbers.length; i++) 
		{
            int number = numbers[i];
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println("Number " + number + " is Positive and Even");
                } else {
                    System.out.println("Number " + number + " is Positive and Odd");
                }
            } else {
                System.out.println("Number " + number + " is Negative");
            }
        }

        // Compare the first and last elements of the array
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("\nComparison of first and last elements:");
        if (comparison == 1) {
            System.out.println("The first element is greater than the last element");
        } else if (comparison == 0) {
            System.out.println("The first element is equal to the last element");
        } else {
            System.out.println("The first element is less than the last element");
        }

        // Close the scanner
        scanner.close();
    }
}
