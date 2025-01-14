// Import Scanner class for taking input from the user
import java.util.Scanner;  

// Public class definition with the name matching the file name
public class StringToCharArrayComparison 
{

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharactersUsingCustomMethod(String inputText) 
	{
        // Create a character array with the same length as the string
		char[] charArray = new char[inputText.length()];  
        
        // Loop through the string and store each character in the array
        for (int i = 0; i < inputText.length(); i++) {
            // Store each character at the corresponding index
			charArray[i] = inputText.charAt(i);  
        }
        
        // Return the character array
        return charArray;
    }

    public static void main(String[] args) 
	{
        
        // Create Scanner object for reading input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userInputText = sc.nextLine();  
        
        // Call the custom method to get the character array
        char[] customCharArray = getCharactersUsingCustomMethod(userInputText);
        
        // Call String's built-in toCharArray() method to get the character array
        char[] builtInCharArray = userInputText.toCharArray();
        
        // Compare the two character arrays and display if they are equal
		// Assume arrays are equal initially
        boolean areArraysEqual = true;  
        if (customCharArray.length == builtInCharArray.length) {
            for (int i = 0; i < customCharArray.length; i++) {
                if (customCharArray[i] != builtInCharArray[i]) {
                    areArraysEqual = false;  
                    break;
                }
            }
        } else {
            areArraysEqual = false;  
        }
        
        // Display the result of comparison
        System.out.println("Are both character arrays equal? " + areArraysEqual);
        
        // Close the Scanner object 
        sc.close();
    }
}
