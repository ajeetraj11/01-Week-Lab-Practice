import java.util.Arrays;

// This class named FootballTeamHeights calculates the 
// shortest, tallest, and mean height of players on a football team.

public class FootballTeamHeights 
{

    // Method to generate random heights for players
    public static int[] generatePlayerHeights(int size) 
	{
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) 
		{
		    // Random height between 150 and 250
            heights[i] = (int) (Math.random() * 101) + 150; 
        }
        return heights;
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) 
	{
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double calculateMean(int[] array) 
	{
	    // Calculate the sum of heights
        int sum = calculateSum(array); 
		// Calculate the mean and return 
        return (double) sum / array.length; 
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] array) 
	{
        int shortest = array[0];
        for (int height : array) 
		{
            // Update the shortest height
			shortest = Math.min(shortest, height); 
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] array) 
	{
        int tallest = array[0];
        for (int height : array) 
		{
		    // Update the tallest height
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) 
	{
        // Generate random heights for 11 players
        int[] heights = generatePlayerHeights(11);
        System.out.println("Player Heights: " + Arrays.toString(heights));

        // Calculate sum, mean, shortest, and tallest heights
        double meanHeight = calculateMean(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        // Display the results
        System.out.println(
            "Mean Height: " + meanHeight + " cm\n" +
            "Shortest Height: " + shortestHeight + " cm\n" +
            "Tallest Height: " + tallestHeight + " cm"
        );
    }
}
