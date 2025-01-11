import java.util.Scanner;

// Finds the largest and second-largest digits in a number.

public class LargestDigits 
{
    public static void main(String[] args) 
	{
	    // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Array to store digits
        int[] digits = new int[10];
        int index = 0;

        // Extract digits from the number
        while (number > 0) 
		{
            digits[index++] = number % 10;
            number /= 10;
        }

        // Variables to track the largest and second-largest digits
        int largest = -1, secondLargest = -1;

        // Find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second-largest digit: " + secondLargest);
		
		// Close the Scanner object
		scanner.close();
    }
}
