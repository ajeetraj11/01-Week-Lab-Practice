import java.util.Scanner;

// Calculates BMI and determines weight status for multiple persons.

public class BMICalculator 
{
    public static void main(String[] args) 
	{
	  // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Input height and weight for each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) of person " + 
                              (i + 1) + ": ");
            heights[i] = scanner.nextDouble();

            System.out.print("Enter weight (in kg) of person " + 
                             (i + 1) + ": ");
            weights[i] = scanner.nextDouble();

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display results for each person
        System.out.println("\nBMI Results:");

       for (int i = 0; i < n; i++) 
        {
             System.out.println("Person " + (i + 1) + ": Height = " + 
                                heights[i] + " m, Weight = " + weights[i] + 
                       " kg, BMI = " + bmis[i] + ", Status = " + statuses[i]);
        }

		
	  // Close the Scanner object
	  scanner.close();
    }
}
