package Task6.A;

public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double height;

    public Trapezium(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (sideA * sideB) / height * 2;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + 2 * height;
    }
}
