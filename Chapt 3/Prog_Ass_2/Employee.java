public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;

		// Update the code to ensure this.monthlySalary is always positive
		if (this.monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}else {
			System.out.println("Please start the program again and enter a value larger than 0");
			System.exit(0);
		}
	}
	
	public String getFirstName() {
		return firstName;
	}

	// create the other two get methods
	public String getLastName() {
		return lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
}