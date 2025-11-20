package Task4.Sxema_B;

public class Computers extends Electronics{
    private String protsesorTur;

    public Computers(String brend, String model, int quvvati, String protsesorTur) {
        super(brend, model, quvvati);
        this.protsesorTur = protsesorTur;
    }

    public String getProtsesorTur() {
        return protsesorTur;
    }

    public void setProtsesorTur(String protsesorTur) {
        this.protsesorTur = protsesorTur;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Protsessor turi: " + protsesorTur);
    }
}
