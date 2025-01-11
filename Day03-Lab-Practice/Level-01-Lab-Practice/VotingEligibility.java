// Class to check voting eligibility for 10 students
import java.util.Scanner;

class VotingEligibility 
{
    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] studentAges = new int[10];

        // Input ages of 10 students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) 
		{
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        for (int age : studentAges) 
		{
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }

        // Close Scanner object to release resources
        input.close();
    }
}
