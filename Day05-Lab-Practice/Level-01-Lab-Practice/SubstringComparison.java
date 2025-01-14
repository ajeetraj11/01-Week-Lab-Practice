// Import Scanner class for taking input from the user
import java.util.Scanner;  

// Public class definition with the name matching the file name
public class SubstringComparison 
{

    // Method to create a substring using charAt()
    // Parameters: inputText (String), startIndex (int), endIndex (int)
    // Returns: String representing the substring from 'startIndex' to 'endIndex'
    public static String createSubstringUsingCharAt(String inputText, int startIndex, int endIndex) 
	{
        
        // Using StringBuilder to store the substring (efficient for concatenation in a loop)
        StringBuilder substringResult = new StringBuilder();
        
        // Loop from startIndex to endIndex to extract characters from inputText
        for (int i = startIndex; i < endIndex; i++) {
            // Append each character at position i of inputText to substringResult
            substringResult.append(inputText.charAt(i));
        }
        
        // Convert StringBuilder to String and return the resulting substring
        return substringResult.toString();
    }

    // Main method where the program execution starts
    public static void main(String[] args) 
	{
        
        // Create Scanner object for reading input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userInputText = sc.nextLine();  
        
        // Prompt user to enter the start index for the substring
        System.out.print("Enter the start index: ");
        int startIndex = sc.nextInt();  
        
        // Prompt user to enter the end index for the substring
        System.out.print("Enter the end index: ");
        int endIndex = sc.nextInt();  
        
        // Call createSubstringUsingCharAt() method to extract substring using charAt()
        String substringUsingCharAt = createSubstringUsingCharAt(userInputText, startIndex, endIndex);
        
        // Call String's built-in substring() method to extract substring
        String substringUsingBuiltInMethod = userInputText.substring(startIndex, endIndex);
        
        // Display the result from charAt() method
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        
        // Display the result from substring() method
        System.out.println("Substring using substring(): " + substringUsingBuiltInMethod);
        
        // Compare both substrings and display the result of comparison
        System.out.println("Are both substrings equal? " + 
		                   substringUsingCharAt.equals(substringUsingBuiltInMethod));
        
        // Close the Scanner object 
        sc.close();
    }
}
