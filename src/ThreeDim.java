public class ThreeDim extends Figure implements Printing {

    ThreeDim() {}

    ThreeDim(Figure f, double h) { base = f; height = h; }

    Figure base;
    double height;
    @Override
    public double calculateArea() { return base.calculateArea() * height; }

    @Override
    public double calculatePerimeter() { return base.calculatePerimeter() * height + 2 * base.calculateArea(); }

    @Override
    public void print() {
        System.out.println("Type of figure: Prism");

        System.out.println("\tType of base and its parameters: ");
        System.out.print("\t");
        base.print();
        System.out.println();

        System.out.println("\theight = " + height);

        System.out.println("\tVolume = " + calculateArea());

        System.out.println("\tArea = " + calculatePerimeter());
    }
}
