import java.util.Scanner; 

class ArrayIndexOutOfBoundsExceptionOperation 
{

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] array)  
    {
        // Access an invalid index to cause ArrayIndexOutOfBoundsException
        System.out.println(array[array.length + 1]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch blocks
    public static void handleArrayIndexOutOfBoundsException(String[] array)  
	{
        try {
            // Access an invalid index to cause ArrayIndexOutOfBoundsException
            System.out.println(array[array.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch and handle ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch and handle generic runtime exception
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args)  
	{
        Scanner sc = new Scanner(System.in); 
        // Create Scanner object for input

        // get the user array input
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        // Consume newline character
        sc.nextLine(); 

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Call the method to create ArrayIndexOutOfBoundsException
        System.out.println("creating the ArrayIndexOutOfBoundsException:");
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (Exception e) {
            System.out.println("Exception caught : " + e.getMessage());
        }

        // Call the method to handle ArrayIndexOutOfBoundsException
        System.out.println("Handles the ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);

        // Close the Scanner object
        sc.close(); 
    }
}