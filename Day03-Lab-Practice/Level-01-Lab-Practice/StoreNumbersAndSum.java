// Class to store numbers in an array and calculate their sum
import java.util.Scanner;

class StoreNumbersAndSum 
{
    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Array to store up to 10 numbers
        double[] numbers = new double[10];

        // Variables to track the total sum and number of entries
        double totalSum = 0.0;
        int index = 0;

        // Input numbers until the user enters 0 or a negative number
        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) 
		{
            if (index >= numbers.length) break; // Stop if array is full

            System.out.print("Enter number " + (index + 1) + ": ");
            double inputNumber = input.nextDouble();

            if (inputNumber <= 0) break; // Stop if user enters 0 or negative number

            numbers[index++] = inputNumber; // Store valid input in the array
        }

        // Calculate the sum of all entered numbers
        for (int i = 0; i < index; i++) 
		{
            totalSum += numbers[i];
        }

        // Display all entered numbers and their total sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal Sum: " + totalSum);

        // Close Scanner object to release resources
        input.close();
    }
}
