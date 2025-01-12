import java.util.Scanner;

// Class to calculate the roots of a quadratic equation

public class Quadratic 
{

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) 
	{
        double delta = Math.pow(b, 2) - (4 * a * c); // Calculate delta

        // Check the nature of the roots based on delta
        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[] { root };
        } else {
            // No real roots
            return new double[] {}; // Return an empty array
        }
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Validate if 'a' is non-zero to avoid division by zero
        if (a == 0) {
            System.out.println("This is not a quadratic equation as a = 0.");
        } else {
            // Call the method to find roots
            double[] roots = findRoots(a, b, c);

            // Display results
            if (roots.length == 2) {
                System.out.println("The roots of the equation are:");
                System.out.println("Root 1: " + roots[0] + "\nRoot 2: " + roots[1]);
            } else if (roots.length == 1) {
                System.out.println("The root of the equation is:");
                System.out.println("Root: " + roots[0]);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
