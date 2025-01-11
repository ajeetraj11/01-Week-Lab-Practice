// Class to implement FizzBuzz and store results in an array
import java.util.Scanner;

class FizzBuzzArray 
{
    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input a positive number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) 
		{
            System.out.println("Error: Please enter a positive number.");
            return;
        }

        // String array to store results
        String[] results = new String[number + 1];

        // Generate FizzBuzz results
        for (int i = 0; i <= number; i++) 
		{
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display results
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close Scanner
        input.close();
    }
}
