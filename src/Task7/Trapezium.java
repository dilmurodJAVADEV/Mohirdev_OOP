package Task7;

public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double hidh;

    public Trapezium(double sideA, double sideB, double hidh) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.hidh = hidh;
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

    public double getHidh() {
        return hidh;
    }

    public void setHidh(double hidh) {
        this.hidh = hidh;
    }

    @Override
    public double area() {
        return (sideA + sideB) * hidh / 2;
    }

    @Override
    public double perimeter() {
        double sideC = Math.sqrt(Math.pow(hidh,2) + Math.pow((sideA - sideB) / 2, 2));
        return sideA + sideB + 2 * sideC;
    }
}
