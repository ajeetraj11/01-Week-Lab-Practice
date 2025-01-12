import java.util.Scanner;

// Class to determine the youngest and tallest among three friends

public class FriendsComparison 
{

    // Method to find the youngest friend based on ages
    public static String findYoungest(String[] names, int[] ages) 
	{
        int minAge = ages[0];
        int index = 0;

        for (int i = 1; i < ages.length; i++) 
		{
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    // Method to find the tallest friend based on heights
    public static String findTallest(String[] names, double[] heights) 
	{
        double maxHeight = heights[0];
        int index = 0;

        for (int i = 1; i < heights.length; i++) 
		{
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) 
	{
        // Initialize arrays for names, ages, and heights
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for age and height of each friend
        for (int i = 0; i < friends.length; i++) 
		{
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        String youngest = findYoungest(friends, ages);

        // Find the tallest friend
        String tallest = findTallest(friends, heights);

        // Display the results in one output
        System.out.println("Results:\nYoungest friend: " + 
		                    youngest + "\nTallest friend: " + tallest);

        // Close the scanner
        scanner.close();
    }
}
