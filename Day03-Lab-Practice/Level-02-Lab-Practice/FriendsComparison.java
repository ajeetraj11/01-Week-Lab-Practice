import java.util.Scanner;

// Determines the youngest and tallest among three friends.

public class FriendsComparison 
{
    public static void main(String[] args) 
	{
	    // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3]; // Stores ages of the friends
        double[] heights = new double[3]; // Stores heights of the friends

        // Input ages and heights of the friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Initialize indices for youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find the youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
		
		// Close the Scanner object
		scanner.close();
    }
}
