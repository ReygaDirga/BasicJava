public class Circle extends Geometri {
    private float radius;
    public Circle(float radius){
        super();
        this.radius = radius;
    }

    @Override
    public void Recalculate() {
        // TODO Auto-generated method stub
        this.area = (float) (Math.PI * Math.pow(this.radius, 2));
        this.circumference = (float) (2 * Math.PI * this.radius); 
        System.out.println("CIRCLE");    
        System.out.println("Circle Area: " + this.area);
        System.out.println("Circle Circumference: " + this.circumference);
        
    }
}
