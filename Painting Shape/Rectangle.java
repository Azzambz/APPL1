public class Rectangle extends Shape {
    private double p;
    private double l;

    public Rectangle(double pjg, double lbr) {
        super("Rectangle");
        p = pjg;
        l = lbr;
    }

    public double area() {
        return p*l;
    }

    public String toString() {
        return super.toString();
    }
}