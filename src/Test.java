public class Test {
    public static void main(String[] args) {
        Coordinate cd = new Coordinate(4,6);
        Coordinate cd1 = new Coordinate(6,7);
        Coordinate cd2 = new Coordinate(1,8);


        Shape s1 = new Point(cd);
        Shape s2 = new Circle(cd1,7);
        Shape s3 = new Rectangle(cd2,3,5);

        System.out.println("TEST GET AREA");

        System.out.println(s1.getArea());
        System.out.printf("%.2f\n",s2.getArea());
        System.out.println(s3.getArea());

        System.out.println("TEST GET PERIMETER");

        System.out.println(s1.getPerimeter());
        System.out.printf("%.0f\n",s2.getPerimeter());
        System.out.println(s3.getPerimeter());



    }
}
