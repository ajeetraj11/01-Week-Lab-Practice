import java.util.Scanner;

public class PalindromeChecker 
{

    // Logic 1: Method to check palindrome by comparing start and end characters
    public static boolean isPalindromeLogic1(String text) 
	{
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method to check palindrome
    public static boolean isPalindromeLogic2(String text, int start, int end) 
	{
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Method to reverse a string using charAt()
    public static String reverseString(String text) 
	{
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    // Method to check palindrome using character arrays
    public static boolean isPalindromeLogic3(String text) 
	{
        char[] originalArray = text.toCharArray();
        String reversedText = reverseString(text);
        char[] reversedArray = reversedText.toCharArray();

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method to execute the program
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Check palindrome using Logic 1
        boolean resultLogic1 = isPalindromeLogic1(text);
        System.out.println("Palindrome check by comparing start and end characters: " + 
		                   (resultLogic1 ? "Yes" : "No"));

        // Check palindrome using Logic 2
        boolean resultLogic2 = isPalindromeLogic2(text, 0, text.length() - 1);
        System.out.println("Palindrome check using Recursive method: " + (resultLogic2 ? "Yes" : "No"));

        // Check palindrome using Logic 3
        boolean resultLogic3 = isPalindromeLogic3(text);
        System.out.println("Palindrome check using character arrays: " + (resultLogic3 ? "Yes" : "No"));

        sc.close();
    }
}
