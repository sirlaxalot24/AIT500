import java.util.Arrays;
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
		System.out.print("Enter employee two's last name: ");
		lastName = input.nextLine();
		System.out.print("Enter employee two's monthly salary: ");
		monthlySalary = input.nextDouble();
		// Create the object
		Employee employeeTwo = new Employee(firstName, lastName, monthlySalary);
		
		//Print employeeOne and employeeTwo information
		System.out.println("Employee One's First Name = " + employeeOne.getFirstName());
		System.out.println("Employee One's Last Name = " + employeeOne.getLastName());
		System.out.println("Employee One's Monthly Salary = " + employeeOne.getMonthlySalary());
		System.out.println("");
		System.out.println("Employee Two's First Name = " + employeeTwo.getFirstName());
		System.out.println("Employee Two's Last Name = " + employeeTwo.getLastName());
		System.out.println("Employee Two's Monthly Salary = " + employeeTwo.getMonthlySalary());
	}
}