import java.util.Scanner;
import java.rmi.registry.LocateRegistry;
import java.util.Arrays;

public class ThreeIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int sum;
		int product;
		int average;
		int smallest;
		int largest;
		int captArray [];

		// Prompt for three integers
		System.out.print("Enter an integer: ");
		number1 = input.nextInt();
		System.out.print("Enter an integer: ");
		number2 = input.nextInt();
		System.out.print("Enter an integer: ");
		number3 = input.nextInt();

		// close input
		input.close();

		// Creat array

		captArray = new int[] {number1, number2, number3};

		// Calculate the sum
		sum = number1 + number2 + number3;

		// Calculate product
		
		product = number1 * number2 * number3;

		// Calculate average

		average = sum / captArray.length;

		// Sort captArray for smallest and largest
		
		Arrays.sort(captArray);
		
		// Determine smallest

		smallest = captArray[0];


		// Determine largest

		largest = captArray[captArray.length - 1];

		// Display results
		System.out.printf("sum = %d%n", sum);
		System.out.printf("product = %d%n", product);
		System.out.printf("average = %d%n", average);
		System.out.printf("smallest = %d%n", smallest);
		System.out.printf("largest = %d%n", largest);

	}

}