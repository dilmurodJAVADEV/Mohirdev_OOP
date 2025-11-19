package Task7;

public class Main {
    public static void main(String[] args) {

        GeometricFigure triangle = new Triangle(3,4,5);
        GeometricFigure trapezium = new Trapezium(10,6,4);
        GeometricFigure rectangle = new Rectangle(5,7);

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println();
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println();
        System.out.println("Trapezium Area: " + trapezium.area());
        System.out.println("Trapezium Perimeter: " + trapezium.perimeter());

    }
}
