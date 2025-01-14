import java.util.Scanner; 

public class SplitWordsWithLengths 
{

    // Method to split the text into words without using split() method
    public static String[] splitTextIntoWords(String text) 
	{
        StringBuilder word = new StringBuilder(); 
        String[] words = new String[100]; 
        int wordCount = 0; 

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // Get the character at index i
            if (ch == ' ' || i == text.length() - 1) {
                // Add the last character of the word
                if (i == text.length() - 1 && ch != ' ') {
                    word.append(ch);
                }
                words[wordCount++] = word.toString(); 
                word = new StringBuilder(); 
            } else {
                word.append(ch); 
            }
        }
        String[] result = new String[wordCount]; 
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to find the length of a string without using length() method
    public static int getLength(String text) {
        int length = 0; 
        for (char ch : text.toCharArray()) {
            length++; 
        }
        return length; 
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) 
	{
        // 2D array for words and lengths
		String[][] wordLengthArray = new String[words.length][2]; 
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Store word
            wordLengthArray[i][1] = String.valueOf(getLength(words[i])); 
        }
        return wordLengthArray;
    }

    public static void main(String[] args) 
	{
        // Create Scanner object for input
		Scanner sc = new Scanner(System.in); 

        // Prompt user to enter a string
        System.out.print("Enter a sentence: ");
        String userInput = sc.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(userInput);

        // Create a 2D array with words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display the result in tabular format
        System.out.println("Word\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        // Close the Scanner object
		sc.close(); 
    }
}
