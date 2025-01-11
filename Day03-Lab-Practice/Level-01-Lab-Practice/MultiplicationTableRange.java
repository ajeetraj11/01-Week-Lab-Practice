// Class to calculate and display the multiplication table for a number (6 to 9 range)
import java.util.Scanner;

class MultiplicationTableRange 
{
    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input number for which the multiplication table is to be generated
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store the multiplication results
        int[] multiplicationResult = new int[4];

        // Generate multiplication results for numbers from 6 to 9
        for (int i = 6; i <= 9; i++) 
		{
            multiplicationResult[i - 6] = number * i;
        }

        // Display multiplication table
        for (int i = 6; i <= 9; i++) 
		{
            System.out.println(number + " * " + i + " = "
                     		   + multiplicationResult[i - 6]);
        }

        // Close Scanner
        input.close();
    }
}
