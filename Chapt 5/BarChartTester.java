import java.util.Scanner;

//import javafx.scene.chart.BarChart;

public class BarChartTester {

    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a value");
            int numStars = input.nextInt();
            BarChart chart = new BarChart(numStars);
            chart.displayBar();
        }
        // Loop five times, and within the loop do the following:
        // Prompt for a number
        // create a BarChart object
        // call your object's displayBar method
    }

}