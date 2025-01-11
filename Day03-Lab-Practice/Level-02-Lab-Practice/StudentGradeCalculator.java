import java.util.Scanner;

// Create a class named StudentGradeCalculator to 
// calculate percentage and grade of the student

public class StudentGradeCalculator 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Create arrays to store marks, percentages, and grades of students
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        
        // Take input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            // Get marks for Physics, Chemistry, and Maths for each student
            do {
                System.out.print("Physics marks: ");
                physicsMarks[i] = scanner.nextInt();
                if (physicsMarks[i] < 0) {
                    System.out.println("Please enter positive marks for Physics.");
                }
            } while (physicsMarks[i] < 0);

            do {
                System.out.print("Chemistry marks: ");
                chemistryMarks[i] = scanner.nextInt();
                if (chemistryMarks[i] < 0) {
                    System.out.println("Please enter positive marks for Chemistry.");
                }
            } while (chemistryMarks[i] < 0);

            do {
                System.out.print("Maths marks: ");
                mathsMarks[i] = scanner.nextInt();
                if (mathsMarks[i] < 0) {
                    System.out.println("Please enter positive marks for Maths.");
                }
            } while (mathsMarks[i] < 0);

            // Calculate the total marks and percentage for the student
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
			
			// percentage is the average of the three subjects
            percentages[i] = (totalMarks / 3.0);
            
            // Assign grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; // Remedial Standards
            }
        }
        
        // Display the marks, percentages, and grades of each student
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics Marks: " + physicsMarks[i]);
            System.out.println("Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("Maths Marks: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}
