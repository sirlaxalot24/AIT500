public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width > 0.0 && width <= 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("width is out of range");
        }

        if (height > 0.0 && height <= 20.0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("height is out of range");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width > 0.00 && width <= 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("width is out of range");
        }
    }

    public void setHeight(double height) {
        if (height > 0.0 && height <= 20.0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("height is out of range");
        }
    }

    public double calculatePerimeter() {
        return this.width * 2 + this.height * 2;
    }

    public double calculateArea() {
        return this.width * this.height;
    }
}