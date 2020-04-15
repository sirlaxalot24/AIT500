public class RectangleTest{
    
    public static void main(String [] args) {
        
        // Test to see if class is working correctly
        Rectangle recTest1 = new Rectangle(10, 15);
        System.out.println("Rectangle 1 should work!!!!!!!!!!!!!");
        System.out.println("Width: " + recTest1.getWidth());
        System.out.println("Height: " + recTest1.getHeight());
        System.out.println("Perimeter: " + recTest1.calcPerimeter());
        System.out.println("Area: " + recTest1.calcArea());

        recTest1.setParams(5, 5);
        System.out.println("Rectangle working with changed params!!!!!!!!!!!!!");
        System.out.println("Width: " + recTest1.getWidth());
        System.out.println("Height: " + recTest1.getHeight());
        System.out.println("Perimeter: " + recTest1.calcPerimeter());
        System.out.println("Area: " + recTest1.calcArea());

        System.out.println("This rectangle will need to be handled");
        
        try {
            Rectangle recTestFail = new Rectangle(100, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Exeption should be thrown for width out of bounds");
            System.out.println(e);
        }

        Rectangle recTestFail = new Rectangle(10, 10);

        System.out.println("This will reset params and need to be handled !!!!!");
        try {
            recTestFail.setParams(10, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Params have been reset and height is out of bounds");
            System.out.println(e);
        }

    }
} 