package opgave04;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        displayRectangle(rectangle1);
        System.out.println();
        displayRectangle(rectangle2);

    }

    public static void displayRectangle(Rectangle rectangle) {
        System.out.println("The rectangle has a width of: " + rectangle.width);
        System.out.println("The rectangle has a height of: " + rectangle.height);
        System.out.println("The rectangle has an area of: " + rectangle.getArea());
        System.out.println("The rectangle has a perimeter of: " + rectangle.getPerimeter());
    }
}
