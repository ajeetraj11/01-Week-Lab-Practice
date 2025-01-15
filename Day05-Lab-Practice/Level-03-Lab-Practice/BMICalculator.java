import java.util.Scanner;

public class BMICalculator 
{

    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] heightWeightArray) 
	{
        // Create a 2D string array to store height, weight, BMI, and status for 10 persons
        String[][] bmiData = new String[10][4];

        // Iterate through each person's height and weight to calculate BMI
        for (int i = 0; i < 10; i++) 
		{
            // Extract weight from the 2D array
            double weight = heightWeightArray[i][0];
            // Convert height from centimeters to meters
            double heightInMeters = heightWeightArray[i][1] / 100.0;
            // Calculate BMI using the formula BMI = weight / (height * height)
            double bmi = weight / (heightInMeters * heightInMeters);
            
            // Declare a variable to store the BMI status (e.g., Normal, Overweight)
            String status;

            // Determine BMI status based on the calculated BMI value
            if (bmi <= 18.4) {
                // If BMI is less than and equal to 18.4, the person is underweight
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                // If BMI is between 18.5 and 24.9, the person has a normal weight
                status = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                // If BMI is between 25 and 39.9, the person is overweight
                status = "Overweight";
            } else {
                // If BMI is 40 or higher, the person is obese
                status = "Obese";
            }

            // Store the height in the 2D string array, formatted to two decimal places
            bmiData[i][0] = String.format("%.2f", heightWeightArray[i][1]);
            // Store the weight in the 2D string array, formatted to two decimal places
            bmiData[i][1] = String.format("%.2f", weight);
            // Store the BMI value in the 2D string array, formatted to two decimal places
            bmiData[i][2] = String.format("%.2f", bmi);
            // Store the BMI status in the 2D string array
            bmiData[i][3] = status;
        }
        // Return the populated 2D string array
        return bmiData;
    }

    // Method to display BMI data in a tabular format
    public static void displayBMIData(String[][] bmiData) 
	{
        // Print the table header with column names
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");

        // Iterate through the 2D array and print each row of data
        for (int i = 0; i < 10; i++) {
            // Print height, weight, BMI, and status for each person
            System.out.println(bmiData[i][0] + "\t\t" + bmiData[i][1] + "\t\t" + bmiData[i][2] + "\t\t" + bmiData[i][3]);
        }
    }

    // Main method to take user input and execute the program
    public static void main(String[] args) 
	{
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create a 2D array to store height and weight for 10 persons
        double[][] heightWeightArray = new double[10][2];

        // Prompt the user to enter height and weight for each person
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        // Loop to take input for 10 persons
        for (int i = 0; i < 10; i++) {
            // Prompt the user to enter weight for person i+1
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            heightWeightArray[i][0] = sc.nextDouble();
            // Prompt the user to enter height for person i+1
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            heightWeightArray[i][1] = sc.nextDouble();
        }

        // Call the method to calculate BMI and get the resulting 2D string array
        String[][] bmiData = calculateBMI(heightWeightArray);

        // Call the method to display BMI data in a tabular format
        displayBMIData(bmiData);

        // Close the scanner object
        sc.close();
    }
}
