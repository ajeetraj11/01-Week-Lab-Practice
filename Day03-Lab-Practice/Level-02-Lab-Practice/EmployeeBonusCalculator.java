import java.util.Scanner;

// Program to calculate bonus, new salary, and total bonus payout for employees.

public class EmployeeBonusCalculator 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Arrays to store salaries, years of service, bonuses, and updated salaries
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] updatedSalaries = new double[10];

        // Variables to track totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input salary and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the salary of employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            while (salary <= 0) {
                System.out.println("Invalid salary! Please enter a positive value.");
                salary = scanner.nextDouble();
            }
            salaries[i] = salary;

            System.out.print("Enter the years of service for employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();
            while (years < 0) {
                System.out.println("Invalid years of service! Please enter a non-negative value.");
                years = scanner.nextDouble();
            }
            yearsOfService[i] = years;
        }

        // Calculate bonuses, updated salaries, and totals
        for (int i = 0; i < 10; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            updatedSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += updatedSalaries[i];
        }

        // Output results
        System.out.println("\nSummary of Employee Bonuses:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] +
                    ", Bonus = " + bonuses[i] + ", New Salary = " + updatedSalaries[i]);
        }
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
		
		//Close the Scanner object
		scanner.close();
    }
}
