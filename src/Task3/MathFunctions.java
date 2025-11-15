package Task3;

import java.util.Scanner;

public class MathFunctions {
    public final static double PI = 3.14159265359;
    public final static double e = 2.71828182846;
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Doiraning radiusini kiriting: ");
        double r = scanner.nextDouble();
        System.out.println("Doiraning yuzi: " + PI * r * r);

        System.out.print("e ning qanday darajaga oshirmoqchisiz: ");
        double n = scanner.nextDouble();
        System.out.println("e^n ning qiymati: " + Math.pow(e,n));

        System.out.println("Uchburchakningtomonlarini kiriting");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2;
        double SU = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Uchburchakning yuzasi: " + SU);



    }
}