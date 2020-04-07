
public class RectangleTest{
    
    public static void main(String [] args) {
        
        Rectangle recTest1 = new Rectangle(10, 15);
        System.out.println("Width: " + recTest1.getWidth());
        System.out.println("Height: " + recTest1.getHeight());
        System.out.println("Perimeter: " + recTest1.calcPerimeter());
        System.out.println("Area: " + recTest1.calcArea());

        recTest1.setParams(5, 5);
        System.out.println("Width: " + recTest1.getWidth());
        System.out.println("Height: " + recTest1.getHeight());
        System.out.println("Perimeter: " + recTest1.calcPerimeter());
        System.out.println("Area: " + recTest1.calcArea());

        Rectangle recTestFail = new Rectangle(100, 10);

        recTestFail.setParams(10, 100);

    }
} 