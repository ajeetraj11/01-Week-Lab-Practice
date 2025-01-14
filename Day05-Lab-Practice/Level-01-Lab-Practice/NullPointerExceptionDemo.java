// Import Scanner class for taking input from the user
import java.util.Scanner;  

// Public class definition with the name matching the file name
public class NullPointerExceptionDemo 
{

    // Method to generate a NullPointerException by calling a method on a null object
    public static void generateNullPointerException() 
	{
	    // Initialize a string to null
        String text = null; 
        
		// This will throw a NullPointerException
        System.out.println(text.length());  
    }

    public static void main(String[] args) 
	{
        
        // Create Scanner object for reading input from the user
        Scanner sc = new Scanner(System.in);
        
        // Call the method that generates a NullPointerException
        try {
		    // This will throw the exception
            generateNullPointerException();  
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.out.println("Caught NullPointerException: Cannot call methods on a null object.");
        }
        
        // Close the Scanner object 
        sc.close();
    }
}
