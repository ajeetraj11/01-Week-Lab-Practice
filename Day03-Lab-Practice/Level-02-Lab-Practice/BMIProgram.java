import java.util.Scanner;

// Create a class named BMIProgram to calculates BMI and 
// determines weight status for multiple persons using multi-dimensional array.

public class BMIProgram 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();
        
        // Create a multi-dimensional array to store weight, height, and BMI
		// personData[i][0] = height, personData[i][1] = weight, personData[i][2] = BMI
        double[][] personData = new double[number][3]; 
		
		// To store weight status for each person
        String[] weightStatus = new String[number]; 
        
        // Input for height and weight
        for (int i = 0; i < number; i++) {
            double height, weight;
            
            // Ensure height and weight are positive
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);
            
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);
            
            // Store height and weight in the personData array
            personData[i][0] = height;
            personData[i][1] = weight;
            
            // Calculate BMI: BMI = weight / (height * height)
            personData[i][2] = weight / (height * height);
            
            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        
        // Display the height, weight, BMI, and weight status of each person
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " 
			                   + personData[i][0] + " m, Weight = " + personData[i][1] + 
                               " kg, BMI = " + personData[i][2] +
 							   ", Status = " + weightStatus[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
