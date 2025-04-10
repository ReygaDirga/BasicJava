public class Rectangle extends Geometri {
    private float side;
    private float height;
    public Rectangle(float side, float height) {
        super();
        this.side = side;
        this.height = height;
    }

    @Override
    public void Recalculate() {
        // TODO Auto-generated method stub
        this.area = this.side * this.height;
        this.circumference = 2 * (this.side + this.height);
        System.out.println("RECTANGLE");
        System.out.println("Rectangle Area: " + this.area);
        System.out.println("Rectangle Circumference: " + this.circumference);
    }
}
