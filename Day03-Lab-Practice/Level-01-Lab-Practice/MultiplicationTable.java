// Class to print the multiplication table of a number
import java.util.Scanner;

class MultiplicationTable 
{
    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number for the multiplication table
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Generate multiplication table
        for (int i = 0; i < table.length; i++) 
		{
            table[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i < table.length; i++) 
		{
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        // Close Scanner object to release resources
        input.close();
    }
}
