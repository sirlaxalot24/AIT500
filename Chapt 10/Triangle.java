public class Triangle extends Shape{
    private double side;

    public Triangle(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        double height = side * Math.sqrt(3) / 2;
        return side / 2 * height;
    }

    @Override
    public double getPerimeter(){
        return side * 3;
    }
}