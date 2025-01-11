// Class to calculate the mean height of a football team
import java.util.Scanner;

class FootballTeamMeanHeight 
{
    public static void main(String[] args) 
	{
        // Array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input heights of players
        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < heights.length; i++) 
		{
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / 11;

        // Display mean height
        System.out.println("Mean height of the football team: " + meanHeight + " cm");

        // Close Scanner
        input.close();
    }
}
