package Task4.Sxema_B;

public class Electronics {
    private String brend;
    private String model;
    private int quvvati;

    public Electronics(String brend, String model, int quvvati) {
        this.brend = brend;
        this.model = model;
        this.quvvati = quvvati;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuvvati() {
        return quvvati;
    }

    public void setQuvvati(int quvvati) {
        this.quvvati = quvvati;
    }

    public void show(){
        System.out.println("Brend: " + brend);
        System.out.println("Model: " + model);
        System.out.println("Quvvati: " + quvvati);
    }
}