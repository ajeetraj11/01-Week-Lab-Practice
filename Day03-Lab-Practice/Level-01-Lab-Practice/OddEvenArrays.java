// Class to separate odd and even numbers into different arrays
import java.util.Scanner;

class OddEvenArrays {

    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input a natural number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) 
		{
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return;
        }

        // Arrays to store odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        // Separate numbers into odd and even arrays
        for (int i = 1; i <= number; i++) 
		{
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Display odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) 
		{
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Display even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) 
		{
            System.out.print(evenNumbers[i] + " ");
        }

        // Close Scanner
        input.close();
    }
}
