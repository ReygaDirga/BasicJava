public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(7f);
        Square square = new Square(10f);
        Rectangle rectangle = new Rectangle(5f, 10f);

        square.Recalculate();
        circle.Recalculate();
        rectangle.Recalculate();
    }
}
