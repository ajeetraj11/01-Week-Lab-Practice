import java.util.Scanner;

public class PalindromeChecker 
{

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String text) 
	{
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input: String to check
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close();
    }
}
