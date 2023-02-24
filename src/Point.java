public class Point extends Shape{
    public Point(Coordinate coordinate) {
        super(coordinate);
    }

    @Override
    public double getArea() {
        return 1;
    }

    @Override
    public double getPerimeter() {
        return 1;
    }


}
