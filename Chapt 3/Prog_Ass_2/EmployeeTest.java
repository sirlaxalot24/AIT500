import java.util.Scanner;

public class EmployeeTest {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt for employee one's information and
		// create the Employee object
		System.out.print("Enter employee one's first name: ");
		String firstName = input.nextLine();
		System.out.print("Enter employee one's last name: ");
		String lastName = input.nextLine();
		System.out.print("Enter employee one's monthly salary: ");
		double monthlySalary = input.nextDouble();
		// Create the object
		Employee employeeOne = new Employee(firstName, lastName, monthlySalary);
		
		// Clear the Scanner's input buffer
		input.nextLine();
		
		// Prompt for employee two's information and
		// create the Employee object
		System.out.print("Enter employee two's first name: ");
		firstName = input.nextLine();
		
		// Display results
	}
}