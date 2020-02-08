public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Update the code to ensure this.monthlySalary is always positive
		this.monthlySalary = monthlySalary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	// create the other two get methods
}