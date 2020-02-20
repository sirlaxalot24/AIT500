import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables;
        int miles;
        int gallons;

        // Prompt user for initial input
        System.out.print("Miles driven (-1 to quit): ");
        miles = input.nextInt();

        // Enter loop if the user did not enter the sentinal value
        while (miles != -1) {
            // Prompt user for gallons
            System.out.print("Gallons used: ");
            gallons = input.nextInt();

            // Perform calculation and display the results
            int mpg = miles / gallons;
            System.out.printf("Miles per Gallon: %d%n", mpg);

            // Prompt user for input again
            System.out.print("Miles driven (-1 to quit): ");
            miles = input.nextInt();
        }
    }
}