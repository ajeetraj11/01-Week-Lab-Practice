import java.util.Arrays;

public class RandomValuesStatistics 
{

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) 
	{
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit random numbers
        }
        return randomNumbers;
    }

    // Method to find the average, min, and max value of an array
    public double[] findAverageMinMax(int[] numbers) 
	{
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number; // Calculate sum
            min = Math.min(min, number); // Update min
            max = Math.max(max, number); // Update max
        }

        double average = (double) sum / numbers.length; // Calculate average
        return new double[] { average, min, max }; // Return average, min, and max
    }

    public static void main(String[] args) 
	{
        RandomValuesStatistics stats = new RandomValuesStatistics();

        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = stats.generate4DigitRandomArray(5);
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max values
        double[] results = stats.findAverageMinMax(randomNumbers);

        // Display results
        System.out.println(
            "Average: " + results[0] + "\n" +
            "Minimum: " + (int) results[1] + "\n" +
            "Maximum: " + (int) results[2]
        );
    }
}
