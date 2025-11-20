package Task4.Sxema_B;

public class PC extends Computers{
    private boolean videoKartasiBor;

    public PC(String brend, String model, int quvvati, String protsesorTur, boolean videoKartasiBor) {
        super(brend, model, quvvati, protsesorTur);
        this.videoKartasiBor = videoKartasiBor;
    }

    public boolean isVideoKartasiBor() {
        return videoKartasiBor;
    }

    public void setVideoKartasiBor(boolean videoKartasiBor) {
        this.videoKartasiBor = videoKartasiBor;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Video kartasi mavjud: " + (videoKartasiBor? " Ha" : "Yo`q"));
    }
}
