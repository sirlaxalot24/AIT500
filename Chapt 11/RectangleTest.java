public class RectangleTest {

    public static void main(String[] args) {
        System.out.println("Test Normal Conditions");
        System.out.println("Test constructor");
        Rectangle r1 = new Rectangle(2.0, 3.0);
        System.out.println("Expect 2.0: " + r1.getWidth());
        System.out.println("Expect 3.0: " + r1.getHeight());
        System.out.println("Expect 6.0: " + r1.calculateArea());
        System.out.println("Expect 10.0: " + r1.calculatePerimeter());

        System.out.println("Test setWidth method");
        r1.setWidth(4.0);
        System.out.println("Expect 4.0: " + r1.getWidth());
        System.out.println("Expect 3.0: " + r1.getHeight());
        System.out.println("Expect 12.0: " + r1.calculateArea());
        System.out.println("Expect 14.0: " + r1.calculatePerimeter());

        System.out.println("Test setHeight method");
        r1.setHeight(6.0);
        System.out.println("Expect 4.0: " + r1.getWidth());
        System.out.println("Expect 6.0: " + r1.getHeight());
        System.out.println("Expect 20.0: " + r1.calculateArea());
        System.out.println("Expect 28.0: " + r1.calculatePerimeter());

        System.out.println("Test Error Conditions");
        System.out.println("Test constructor");
        System.out.println("width to low");
        try {
            Rectangle r2 = new Rectangle(-1.0, 3.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expect bad width: " + e.getMessage());
        }

        System.out.println("width too high");
        try {
            Rectangle r2 = new Rectangle(21.0, 3.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expect bad width: " + e.getMessage());
        }

        System.out.println("height too low");
        try {
            Rectangle r2 = new Rectangle(2.0, -1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expect bad height: " + e.getMessage());
        }

        System.out.println("height too high");
        try {
            Rectangle r2 = new Rectangle(2.0, 21.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expect bad height: " + e.getMessage());
        }

        System.out.println("Test set methods");
        Rectangle r2 = new Rectangle(2.0, 3.0);

        System.out.println("width too low");
        try {
            r2.setWidth(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expect bad width: " + e.getMessage());
            System.out.println("Expect 2.0: " + r2.getWidth());
        }

        System.out.println("width too hight");
        try {
            r2.setWidth(21.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expcect bad width: " + e.getMessage());
            System.out.println("Expect 2.0: " + r2.getWidth());
        }

        System.out.println("height too low");
        try {
            r2.setHeight(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expect bad height: " + e.getMessage());
            System.out.println("Expect 3.0: " + r2.getHeight());
        }

        System.out.println("height too heigh");
        try {
            r2.setHeight(21.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expcect bad height: " + e.getMessage());
            System.out.println("Expect 3.0: " + r2.getHeight());
        }
    }
}