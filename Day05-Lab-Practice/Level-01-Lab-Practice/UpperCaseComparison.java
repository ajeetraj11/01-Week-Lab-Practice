import java.util.Scanner; 

public class UpperCaseComparison 
{

    // Method to convert text to uppercase without using built-in methods
    public static String convertToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder(); // To store the result
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // Get the character at index i
            // If the character is lowercase, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }
            upperCaseText.append(ch);
        }
        return upperCaseText.toString(); 
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String text1, String text2) 
	{
        if (text1.length() != text2.length()) {
            return false; 
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) 
	{
        // Create Scanner object for input 
		Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Convert the text to uppercase using a built-in method
        String upperCaseBuiltIn = userInput.toUpperCase();

        // Convert the text to uppercase using the custom method
        String upperCaseCustom = convertToUpperCase(userInput);

        // Compare the two results
        boolean areEqual = compareStrings(upperCaseBuiltIn, upperCaseCustom);

        // Display the results
        System.out.println("Uppercase (Built-in Method): " + upperCaseBuiltIn);
        System.out.println("Uppercase (Custom Method): " + upperCaseCustom);
        System.out.println("Are both uppercase results equal? " + areEqual);

        // Close the Scanner object
		sc.close(); 
    }
}
