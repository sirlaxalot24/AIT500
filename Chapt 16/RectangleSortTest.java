import java.util.*;

public class RectangleSortTest{

    public static void main(String [] args) {
             
        List<Rectangle> rectList = new ArrayList<>();
        Rectangle rectTest1 = new Rectangle(10, 15);
        Rectangle rectTest2 = new Rectangle(9, 15);
        Rectangle rectTest3 = new Rectangle(11, 15);
        Rectangle rectTest4 = new Rectangle(8, 15);
        Rectangle rectTest5 = new Rectangle(12, 15);
        rectList.add(rectTest1);
        rectList.add(rectTest2);
        rectList.add(rectTest3);
        rectList.add(rectTest4);
        rectList.add(rectTest5);


        System.out.println("Pre-sorted List");
        for (Rectangle rectangle : rectList) {
            System.out.println(rectangle.getArea());
        }
        
        System.out.println("List After Comparator");
        
        RectangleComparator rectComp = new RectangleComparator();
        Collections.sort(rectList, rectComp);
        
        for (Rectangle rectangle : rectList) {
            System.out.println(rectangle.getArea());
        }


        /* RectangleComparator areaResults = new RectangleComparator();
*/
    }
}