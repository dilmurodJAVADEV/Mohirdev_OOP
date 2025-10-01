package Task2;

public class Car {
    private String rangi;
    private String modeli;
    private double narxi;
    private boolean isAvtomatic;

    public String getRangi() {
        return rangi;
    }

    public void setRangi(String rangi) {
        this.rangi = rangi;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public double getNarxi() {
        return narxi;
    }

    public void setNarxi(double narxi) {
        this.narxi = narxi;
    }

    public boolean isAvtomatic() {
        return isAvtomatic;
    }

    public void setAvtomatic(boolean avtomatic) {
        isAvtomatic = avtomatic;
    }

    public void print(){
        System.out.println("Rangi: " + rangi);
        System.out.println("Modeli: " + modeli);
        System.out.println("Narxi: " + narxi);
        System.out.println("Avtomat yoki mexanik: " + (isAvtomatic ? "Avtomatik" : "Mexanik"));
    }
}
