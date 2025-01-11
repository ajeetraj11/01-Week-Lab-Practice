import java.util.Scanner;

// Finds the largest and second-largest digits in a number
// by dynamically resizing the array when needed.
 
public class DynamicLargestDigits 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initial size of the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from the number
        while (number > 0) {
            // Check if the current array is full
            if (index == maxDigit) {
                maxDigit += 10; // Increase the size by 10
                int[] temp = new int[maxDigit]; // Create a new temporary array
                // Copy current digits into the new array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp; // Assign the new array to digits
            }
            // Store the digit and increment the index
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
