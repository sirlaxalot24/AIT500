

public class TestShape{
    
    public static void main(String[] args) {
        Shape[] shapeArr = new Shape[3];
            shapeArr[0] = new Circle(10);
            shapeArr[1] = new Square(5);
            shapeArr[2] = new Triangle(3);

        for(Shape x: shapeArr){
            System.out.println("The Object is: " + x);
            System.out.println(x.getName());
            System.out.println(x.getArea());
            System.out.println(x.getPerimeter());
            
        }
    }
}