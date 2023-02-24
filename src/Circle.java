public class Circle extends Shape{
    private double r;

    public Circle(Coordinate coordinate, double r) {
        super(coordinate);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return Math.PI *2*r;
    }
}
