import java.util.Scanner; 

 class IllegalArgumentExceptionOpearation
{

    // Method to generate IllegalArgumentException by using substring with incorrect indices
    public static void generateIllegalArgumentException(String text) 
	{
        // Start index is greater than the end index, causing IllegalArgumentException
        System.out.println(text.substring(5, 3));
    }

    // Method to handle IllegalArgumentException using try-catch blocks
    public static void handleIllegalArgumentException(String text)  
    {
        try {
            // Attempt to generate IllegalArgumentException
            System.out.println(text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            // Catch and handle IllegalArgumentException
            System.out.println("IllegalArgumentException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch and handle generic runtime exception
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args)  
	{
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Prompt user for string input
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Call the method to generate IllegalArgumentException
        System.out.println("Generating IllegalArgumentException:");
        try {
            generateIllegalArgumentException(userInput);
        } catch (Exception e) {
            System.out.println("Exception caught during generation: " + e.getMessage());
        }

        // Call the method to handle IllegalArgumentException
        System.out.println("Handling IllegalArgumentException:");
        handleIllegalArgumentException(userInput);

        sc.close(); // Close the Scanner object
    }
}