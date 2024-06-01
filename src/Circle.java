public class Circle extends Figure implements Printing{

    Circle() {}
    Circle(double x){ r = x; }

    double r;
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() { return 2 * Math.PI * r; }

    @Override
    public void print() {
        System.out.println("Type of figure: Circle");

        System.out.println("\tRadius = " + r);

        System.out.println("\tArea = " + calculateArea());

        System.out.println("\tPerimeter = " + calculatePerimeter());
    }
}
