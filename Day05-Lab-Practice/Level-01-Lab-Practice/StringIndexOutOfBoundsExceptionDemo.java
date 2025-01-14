// Importing Scanner class for user input
import java.util.Scanner; 

// Class to demonstrate StringIndexOutOfBoundsException

public class StringIndexOutOfBoundsExceptionDemo 
{

    // Method to generate StringIndexOutOfBoundsException
    // Parameter: inputText (String)
    public static void generateException(String inputText) 
	{
        // Attempting to access an invalid index
        // This will cause a StringIndexOutOfBoundsException and stop the program
        char invalidChar = inputText.charAt(inputText.length());
        System.out.println("Character at invalid index: " + invalidChar);
    }

    // Method to handle StringIndexOutOfBoundsException
    // Parameter: inputText (String)
    public static void handleException(String inputText) {
        try 
		{
            // Attempting to access an invalid index inside a try block
            char invalidChar = inputText.charAt(inputText.length());
            System.out.println("Character at invalid index: " + invalidChar);
        } 
		catch (StringIndexOutOfBoundsException e)
		{
            // Catching and handling the exception
            System.out.println("Exception caught: " + e.toString());
            System.out.println("Invalid index accessed. Valid indices are from 0 to "
                    			+ (inputText.length() - 1));
        }
    }

    public static void main(String[] args) 
	{
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Call the method to generate the exception
        System.out.println("\nCalling generateException() method:");
        try 
		{
            generateException(userInput);
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            System.out.println("Exception caught in main: " + e.toString());
        }

        // Call the method to handle the exception
        System.out.println("\nCalling handleException() method:");
        handleException(userInput);

        // Close the Scanner object
        sc.close();
    }
}
