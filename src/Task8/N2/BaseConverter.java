package Task8.N2;

public abstract class BaseConverter {
    private double selsi;

    public BaseConverter(double selsi) {
        this.selsi = selsi;
    }

    public double getSelsi() {
        return selsi;
    }

    public void setSelsi(double selsi) {
        this.selsi = selsi;
    }

    public abstract double convertatsiyaQilish();
}
