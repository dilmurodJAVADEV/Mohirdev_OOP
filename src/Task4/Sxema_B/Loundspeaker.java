package Task4.Sxema_B;

public class Loundspeaker extends Sounds{
    private int driverlarSoni;

    public Loundspeaker(String brend, String model, int quvvati, int chastotalarOraligi, int driverlarSoni) {
        super(brend, model, quvvati, chastotalarOraligi);
        this.driverlarSoni = driverlarSoni;
    }

    public int getDriverlarSoni() {
        return driverlarSoni;
    }

    public void setDriverlarSoni(int driverlarSoni) {
        this.driverlarSoni = driverlarSoni;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Driverlar soni: " + driverlarSoni);
    }
}
