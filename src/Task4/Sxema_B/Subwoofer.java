package Task4.Sxema_B;

public class Subwoofer extends Sounds{
    private boolean aktivmi;

    public Subwoofer(String brend, String model, int quvvati, int chastotalarOraligi, boolean aktivmi) {
        super(brend, model, quvvati, chastotalarOraligi);
        this.aktivmi = aktivmi;
    }

    public boolean isAktivmi() {
        return aktivmi;
    }

    public void setAktivmi(boolean aktivmi) {
        this.aktivmi = aktivmi;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Aktiv sabvufermi: " + (aktivmi ? "Ha" : "Yo`q"));
    }
}