public class RectangleSortTest.java

    public static void main(String [] args) {
            
        // Test to see if class is working correctly
        Rectangle recTest1 = new Rectangle(10, 15);
        System.out.println("Rectangle 1 :::::::::::::::");
        System.out.println("Area: " + recTest1.calcArea());

        Rectangle rectTest2 = new Rectangle(11, 15);
        System.out.println("Rectangle 2 :::::::::::::::");
        System.out.println("Area: " + rectTest2.calcArea());

        System.out.println(recTest1.area.compareTo(rectTest2.area));
    }
}