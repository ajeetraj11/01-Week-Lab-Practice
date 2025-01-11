// Class to analyze 5 numbers for positivity, parity, and comparison
import java.util.Scanner;

class NumberAnalysis 
{
    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) 
		{
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Analyze each number for positivity and parity
        for (int number : numbers) 
		{
            if (number > 0) 
			{
                if (number % 2 == 0) {
                    System.out.println("Number " + number + " is positive and even.");
                } else {
                    System.out.println("Number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println("Number " + number + " is negative.");
            } else {
                System.out.println("Number " + number + " is zero.");
            }
        }

        // Compare the first and last numbers in the array
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first number is greater than the last number.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first and last numbers are equal.");
        }

        // Close Scanner object to release resources
        input.close();
    }
}
