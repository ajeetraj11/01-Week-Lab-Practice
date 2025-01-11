// Class to copy a 2D array into a 1D array
import java.util.Scanner;

class Copy2DArrayTo1D 
{
    public static void main(String[] args) 
	{
        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Create and input 2D array
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Copy elements to 1D array
        int[] array = new int[rows * columns];
        int index = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                array[index++] = element;
            }
        }

        // Display 1D array
        System.out.print("1D Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        // Close Scanner
        input.close();
    }
}
