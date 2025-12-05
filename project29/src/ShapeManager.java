public class ShapeManager {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);
        Shape[] shapes = {circle, rectangle, triangle};
        for (Shape shape : shapes) {
            shape.displayInfo();
        }
    }
}
