import java.util.Random;

// Create a class named EmployeeBonus  to calculate the employee bonus

public class EmployeeBonus 
{

    // Method to generate random salary and years of service for each employee
    public static double[][] generateEmployeeData() 
	{
        Random rand = new Random();
		
		// 2D array to store salary and years of service
        double[][] employeeData = new double[10][2];  
        
        for (int i = 0; i < 10; i++) {
            // Generating a 5-digit salary for each employee (between 10000 and 99999)
            employeeData[i][0] = rand.nextInt(90000) + 10000;
            
            // Generating random years of service (between 1 and 20 years)
            employeeData[i][1] = rand.nextInt(20) + 1;
        }
        
        return employeeData;
    }

    // Method to calculate the new salary and bonus based on the years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) 
	{
       // 2D array to store new salary, bonus, and old salary
	   double[][] updatedData = new double[10][3];  
        
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            
            // Calculate bonus based on years of service
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            
            // Calculate new salary
            double newSalary = oldSalary + bonus;
            
            // Storing the results in updatedData array (Old Salary, New Salary, Bonus)
            updatedData[i][0] = oldSalary;  // Old salary
            updatedData[i][1] = newSalary;  // New salary
            updatedData[i][2] = bonus;      // Bonus
        }
        
        return updatedData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static double[] calculateTotalAmount(double[][] updatedData) 
	{
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }
        
        return new double[] { totalOldSalary, totalNewSalary, totalBonus };
    }

    // Method to print the results in a tabular format
    public static void printResults(double[][] updatedData, double[] totalAmount) 
	{
        System.out.printf("%-10s%-15s%-15s%-15s\n", "Employee", "Old Salary", 
		                  "New Salary", "Bonus");
        
        // Printing the employee-wise data
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-15.2f%-15.2f%-15.2f\n", (i + 1), 
			                  updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }
        
        // Printing the totals
        System.out.println("\nTotal Amounts to be Paid:");
        System.out.printf("%-10s%-15.2f\n", "Total Old Salary ", totalAmount[0]);
        System.out.printf("%-10s%-15.2f\n", "Total New Salary ", totalAmount[1]);
        System.out.printf("%-10s%-15.2f\n", "Total Bonus ", totalAmount[2]);
    }

    public static void main(String[] args) 
	{
        // Generate employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData();
        
        // Calculate new salary and bonus for each employee
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        
        // Calculate total old salary, new salary, and total bonus
        double[] totalAmount = calculateTotalAmount(updatedData);
        
        // Print the results in a tabular format
        printResults(updatedData, totalAmount);
    }
}
