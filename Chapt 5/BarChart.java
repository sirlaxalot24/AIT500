public class BarChart {
    private int numberOfStars;

    public BarChart(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public void displayBar() {

        // Create a loop to execute the following statement this.numberOfStars times
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");    
        }
        

        // After the loop
        System.out.println();
    }
}