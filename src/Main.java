import java.util.Scanner;

public class Main {
    public static boolean check_dimensions(double a, double b, double c) {
        double shortest = Math.min(a, b);
        shortest = Math.min(shortest, c);
        double longest = 0, middle = 0;
        if (shortest == a) {
            longest = Math.max(b, c);
            if (longest == b)
                middle = c;
            else middle = b;
        }
        else if (shortest == b) {
            longest = Math.max(a, c);
            if (longest == a)
                middle = c;
            else middle = a;
        }
        else if (shortest == c){
            longest = Math.max(a, b);
            if (longest == b)
                middle = a;
            else middle = b;
        }
        return shortest + middle > longest;
    }
    public static void main(String[] args) {

        int choice = 0, choice1 = 0, base_choice = 0;
        Figure figure = null;
        Figure base = null;
        double area, perimeter;

        do{
            System.out.println("Choose option:");
            System.out.println("1. Choose figure");
            System.out.println("2. Enter data");
            System.out.println("3. Show information");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\t1. Triangle");
                    System.out.println("\t2. Square");
                    System.out.println("\t3. Circle");
                    System.out.println("\t4. Prism");

                    choice1 = scanner.nextInt();

                    switch (choice1) {
                        case 1:
                            figure = new Triangle();
                            break;
                        case 2:
                            figure = new Square();
                            break;
                        case 3:
                            figure = new Circle();
                            break;
                        case 4:
                            figure = new ThreeDim();
                            System.out.println("Choose base: ");
                            System.out.println("\t1. Triangle");
                            System.out.println("\t2. Square");
                            System.out.println("\t3. Circle");
                            base_choice = scanner.nextInt();
//                            Figure base;
                            if (base_choice == 1) {
                                base = new Triangle();
                            } else if (base_choice == 2) {
                                base = new Square();
                            } else {
                                base = new Circle();
                            }
                            break;
                    }
                    break;
                case 2:
                    if (choice1 == 1) {
                        System.out.println("Enter walls lengths: ");
                        System.out.print("\t wall a = ");
                        double a = scanner.nextDouble();
                        System.out.print("\t wall b = ");
                        double b = scanner.nextDouble();
                        System.out.print("\t wall c = ");
                        double c = scanner.nextDouble();
                        while (! check_dimensions(a, b, c)){
                            System.out.println("Entered data is wrong - cannot create a triangle");
                            System.out.println("\tEnter new data:");

                            System.out.print("\t wall a = ");
                            a = scanner.nextDouble();
                            System.out.print("\t wall b = ");
                            b = scanner.nextDouble();
                            System.out.print("\t wall c = ");
                            c = scanner.nextDouble();
                        }
                        figure = new Triangle(a, b, c);
                    }
                    else if (choice1 == 2) {
                        System.out.println("Enter wall's length: ");
                        System.out.print("\t wall a = ");
                        double d = scanner.nextDouble();
                        figure = new Square(d);
                    }
                    else if (choice1 == 3) {
                        System.out.println("Enter radius's length: ");
                        System.out.print("\t radius = ");
                        double r = scanner.nextDouble();
                        figure = new Circle(r);
                    }
                    else if (choice1 == 4) {
//                        Figure base;
                        if (base_choice == 1) {
                            System.out.println("Enter base walls lengths: ");
                            System.out.print("\t wall a = ");
                            double x = scanner.nextDouble();
                            System.out.print("\t wall b = ");
                            double y = scanner.nextDouble();
                            System.out.print("\t wall c = ");
                            double z = scanner.nextDouble();
                            while (! check_dimensions(x, y, z)){
                                System.out.println("Entered data is wrong - cannot create a triangle");
                                System.out.println("\tEnter new data:");

                                System.out.print("\t wall a = ");
                                x = scanner.nextDouble();
                                System.out.print("\t wall b = ");
                                y = scanner.nextDouble();
                                System.out.print("\t wall c = ");
                                z = scanner.nextDouble();
                            }
                            base = new Triangle(x, y, z);
                        } else if (base_choice == 2) {
                            System.out.println("Enter base wall's length: ");
                            System.out.print("\t wall a = ");
                            double q = scanner.nextDouble();
                            base = new Square(q);
                        } else {
                            System.out.println("Enter base radius's length: ");
                            System.out.print("\t radius = ");
                            double o = scanner.nextDouble();
                            base = new Circle(o);
                        }
                        System.out.println("Enter height: ");
                        System.out.print("\t height = ");
                        double h = scanner.nextDouble();
                        figure = new ThreeDim(base, h);
                    }
                    area = figure.calculateArea();
                    perimeter = figure.calculatePerimeter();
                    break;
                case 3:
                    figure.print();
                    break;
            }
        } while (choice != 4);
    }
}
