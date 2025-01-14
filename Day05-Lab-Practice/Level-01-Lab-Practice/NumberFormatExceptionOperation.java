import java.util.Scanner; 

class NumberFormatExceptionOperation
{

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text)  
	{
        // Attempt to parse non-numeric text to an integer 
		// it create an exception 
        System.out.println(Integer.parseInt(text));
    }

    // Method to handle NumberFormatException using try-catch blocks
    public static void handleNumberFormatException(String text)  
	{
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            // Catch and handle NumberFormatException
            System.out.println("NumberFormatException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch and handle generic runtime exception
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
    {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);  

        // Get user string input
        System.out.print("Enter a value: ");
        String userInput = sc.nextLine();

        // Call the method to generate NumberFormatException
        System.out.println("Generating NumberFormatException:");
        try {
            generateNumberFormatException(userInput);
        } catch (Exception e) {
            System.out.println("Exception caught during generation: " + e.getMessage());
        }

        // Call the method to handle NumberFormatException
        System.out.println("Handling NumberFormatException:");
        handleNumberFormatException(userInput);

        // Close the Scanner object
        sc.close();
    }
}