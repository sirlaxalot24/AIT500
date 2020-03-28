public class CompareArraysTest {
    public static void main(String [] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);


        
        
        // Compare equal arrays
        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        System.out.println("Expect true: " + CompareArrays.compare(a, b));

        // Describe what I'm about to test

        // Test CompareArrays.compare to ensure order must match
        int [] c = {1, 2, 3, 4};
        int [] d = {4, 3, 2, 1};
        System.out.println("Expect flase due to order: " + CompareArrays.compare(c, d));

        // Test CompareArrays.compare to ensure lenght will fail
        int [] e = {1, 2, 3, 4, 5};
        int [] f = {4, 3, 2, 1};
        System.out.println("Expect flase due to length: " + CompareArrays.compare(e, f));

        // Test CompareArrays.compare to ensure full value will fail
        int [] g = {1, 2, 3, 4};
        int [] h = {10, 20, 30, 40};
        System.out.println("Expect flase due to full value: " + CompareArrays.compare(g, h));

        // Test CompareArrays.compare to ensure empty will fail
        int [] i = {};
        int [] j = {};
        System.out.println("Expect flase due to empty: " + CompareArrays.compare(i, j));
    }
}