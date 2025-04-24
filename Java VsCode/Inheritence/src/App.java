public class App {
    public static void main(String[] args) throws Exception {
        Geometri circle = new Circle(7f);
        Geometri square = new Square(10f);
        Rectangle rectangle = new Rectangle(5f, 10f);

        square.Recalculate();
        circle.Recalculate();
        rectangle.Recalculate();
    }
}
