public class PowerTest{

    public static void main(String[] args) {
        Power powerRun = new Power();
        System.out.println("Using Recursion: " + powerRun.power(2, 3));
        System.out.println("Using Math.pow():" + Math.pow(2, 3));
        System.out.println("Using Recursion: " + powerRun.power(2, 10));
        System.out.println("Using Math.pow():" + Math.pow(2, 10));
        System.out.println("Using Recursion: " + powerRun.power(2, 5));
        System.out.println("Using Math.pow(): " + Math.pow(2, 5));

    }
}