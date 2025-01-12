import java.util.Scanner;

// Create a class named StudentVoteChecker to determine 
// if a student is eligible to vote based on age.

public class StudentVoteChecker 
{

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) 
	{
        if (age < 0) {
            // Return false for negative age
            return false;
        } else if (age >= 18) {
            // Return true if age is 18 or above
            return true;
        } else {
            // Return false if age is below 18
            return false;
        }
    }

    public static void main(String[] args) 
	{
        // Create an array to store the age of 10 students
        int[] studentAges = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Create an instance of StudentVoteChecker
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Initialize a StringBuilder to accumulate the output
        StringBuilder output = new StringBuilder();

        // Loop to take user input for each student's age
        for (int i = 0; i < studentAges.length; i++) 
		{
            // Prompt user to enter age
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if the student can vote
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);

            // Append voting eligibility result to output
            if (canVote) {
                output.append("Student ").append(i + 1).append(" can vote.\n"); 
            } else {
                output.append("Student ").append(i + 1).append(" cannot vote.\n"); 
            }
        }

        // Print all results 
        System.out.println(output);

        // Close the scanner 
        scanner.close();
    }
}
