import Inheritance.Rectangle;

public class RectangleRunner {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(24,56);
        //System.out.println(rectangle.areaOfRectangle());
        //System.out.println(rectangle.perimeterOfRectangle());
        System.out.println(rectangle);
        rectangle.setLength(50);
        System.out.println(rectangle);
    }
}
