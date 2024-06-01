public class Triangle extends Figure implements Printing{

    Triangle() {}

    Triangle(double x, double y, double z) { a = x; b = y; c = z; }
    double a, b, c;
    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() { return a + b + c; }

    @Override
    public void print() {
        System.out.println("Type of figure: Triangle");

        System.out.println("\ta wall = " + a + ", b wall = " + b + ", c wall = " + c);

        System.out.println("\tArea = " + calculateArea());

        System.out.println("\tPerimeter = " + calculatePerimeter());
    }
}
