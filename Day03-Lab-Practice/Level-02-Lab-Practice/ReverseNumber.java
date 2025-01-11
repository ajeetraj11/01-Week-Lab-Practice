import java.util.Scanner;

// Reverses a number by extracting its digits.

public class ReverseNumber 
{
    public static void main(String[] args) 
	{
	    // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Array to store digits of the number
        int[] digits = new int[10];
        int index = 0;

        // Extract digits from the number
        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
		
	    // Close the Scanner object
		scanner.close();
    }
}
