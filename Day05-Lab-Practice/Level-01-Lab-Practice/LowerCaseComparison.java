import java.util.Scanner;

class LowerCaseComparison 
{

    // Method to convert text to lowercase without using built-in methods
    public static String convertToLowerCase(String text)  
    {
        StringBuilder lowerCaseText = new StringBuilder(); 
        for (int i = 0; i < text.length(); i++) {
            // Get the character at index i
            char ch = text.charAt(i); 
            // If the character is uppercase, convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference
                ch = (char) (ch + 32); 
            }
            lowerCaseText.append(ch); 
        }
        // Return the resulting string
        return lowerCaseText.toString(); 
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String text1, String text2)  
    {
        if (text1.length() != text2.length()) {
            // If lengths are different, strings are not equal
            return false; 
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                // If characters at any index differ, strings are not equal
                return false; 
            }
        }
        // Strings are equal
        return true; 
    }

    public static void main(String[] args)  
	{
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in); 

        // Get the user input a string
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Convert the text to lowercase using a built-in method
        String lowerCaseBuiltIn = userInput.toLowerCase();

        // Convert the text to lowercase using the custom method
        String lowerCaseCustom = convertToLowerCase(userInput);

        // Compare the two results
        boolean areEqual = compareStrings(lowerCaseBuiltIn, lowerCaseCustom);

        // Display the results
        System.out.println("Lowercase (Built-in Method): " + lowerCaseBuiltIn);
        System.out.println("Lowercase (Custom Method): " + lowerCaseCustom);
        System.out.println("Are both lowercase results equal? " + areEqual);

        // Close the Scanner object
        sc.close(); 
    }
}