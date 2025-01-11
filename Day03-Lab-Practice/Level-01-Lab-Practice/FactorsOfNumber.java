// Class to find factors of a number and display them
import java.util.Scanner;

class FactorsOfNumber 
{
    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initializing factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                if (index == maxFactor) 
				{
                    maxFactor *= 2; // Double the size if array is full
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) 
		{
            System.out.print(factors[i] + " ");
        }

        // Close Scanner
        input.close();
    }
}
