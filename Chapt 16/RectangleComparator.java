import java.util.*;


public class RectangleComparator implements Comparator<Rectangle>{
    
    @Override
    public int compare(Rectangle rect1, Rectangle rect2) {
        return ((int)rect1.getArea() - (int)rect2.getArea());
    }
}