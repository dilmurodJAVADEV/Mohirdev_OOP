package Task4.Sxema_B;

public class Laptop extends Computers {
    private double ogirligi;

    public Laptop(String brend, String model, int quvvati, String protsesorTur, double ogirligi) {
        super(brend, model, quvvati, protsesorTur);
        this.ogirligi = ogirligi;
    }

    public double getOgirligi() {
        return ogirligi;
    }

    public void setOgirligi(double ogirligi) {
        this.ogirligi = ogirligi;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("O`g`irligi: " + ogirligi);
    }
}
