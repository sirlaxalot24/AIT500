public class CompareArraysTest {
    public static void main(String [] args) {
        // Compare equal arrays
        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        System.out.println("Expect true " + CompareArrays.compare(a, b));

        // Describe what I'm about to test
        int [] c = {};
        int [] d = {};
        System.out.println("Expect xxxxxx " + CompareArrays.compare(c, d));
    }
}