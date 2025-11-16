package Task5;

public class Main {
    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions();

        System.out.println("ADD = " + mathFunctions.add(4, 5));
        System.out.println("SUB = " + mathFunctions.sub(6, 7));
        System.out.println("MULTIPLY = " + mathFunctions.multiply(4.5, 7.5));
        System.out.println("DIV = " + mathFunctions.div(6.6, 3.3));
        System.out.println("ABS = " + mathFunctions.abs(-9));
        System.out.println("POW = " + mathFunctions.pow(9));
    }
}
