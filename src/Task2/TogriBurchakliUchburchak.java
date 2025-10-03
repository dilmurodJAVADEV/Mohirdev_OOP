package Task2;

public class TogriBurchakliUchburchak {
    private double a;   // katet a
    private double b;   // katet b
    private double c;   // gipotenuza c

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void yuzasi(int a, int b){
        double S =(double) 1/2 *a*b;
        System.out.println("To`g`ri burchakli uchburchakning Yuzasi: " + S);
    }

    public void yuzasi(double a, double b) {
        double S =(double) 1/2 *a*b;
        System.out.println("To`g`ri burchakli uchburchakning Yuzasi: " + S);
    }

    public void perimetri(long a, long b, long c){
        long P = a+b+c;
        System.out.println("To`g`ri burchakli uchburchakning Perimetri: " + P);
    }

    public void perimetri(float a, float b, float c){
        float P = a+b+c;
        System.out.println("To`g`ri burchakli uchburchakning Perimetri: " + P);

    }



}
