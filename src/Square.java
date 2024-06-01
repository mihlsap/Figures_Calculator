public class Square extends Figure implements Printing{

    Square() {}
    Square(double x){ a = x; }

    double a;
    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public void print() {
        System.out.println("Type of figure: Square");

        System.out.println("\ta wall = " + a);

        System.out.println("\tArea = " + calculateArea());

        System.out.println("\tPerimeter = " + calculatePerimeter());
    }
}
