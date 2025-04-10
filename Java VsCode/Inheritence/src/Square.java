public class Square extends Geometri {
    private float side;
    public Square(float side) {
        super();
        this.side = side;
    }


    @Override
    public void Recalculate() {
        // TODO Auto-generated method stub
        this.area = this.side * this.side;
        this.circumference = 4 * this.side;
        System.out.println("SQUARE");
        System.out.println("Square Area: " + this.area);
        System.out.println("Square Circumference: " + this.circumference);
    }
}
