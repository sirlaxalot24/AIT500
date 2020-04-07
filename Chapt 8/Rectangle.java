public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        if(width <= 0 || width > 20 || height <= 0 || height > 20){
            throw new IllegalArgumentException(
                "Width or Height must be larger than zero and less than or equal to 20");
        }
        
        this.width = width;
        this.height = height;
    }    

    public void setParams(double width, double height){
        if(width <= 0 || width > 20 || height <= 0 || height > 20){
            throw new IllegalArgumentException(
                "Width or Heigh must be larger than zero and less than or equal to 20");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double calcPerimeter(){
        return (width * 2) + (height * 2);
    }

    public double calcArea(){
        return width * height;
    }

}