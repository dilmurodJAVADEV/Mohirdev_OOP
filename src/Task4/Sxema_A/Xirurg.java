package Task4.Sxema_A;

public class Xirurg extends Doctor {
    private String operatsiyaTuri;

    public Xirurg(String name, String surname, int age, String phone, String address, double maoshi, String operatsiyaTuri) {
        super(name, surname, age, phone, "Xirurg", address, maoshi);
        this.operatsiyaTuri = operatsiyaTuri;
    }

    @Override
    public void showInfo() {
         super.showInfo();
        System.out.println("operatsiyaTuri: " + operatsiyaTuri);
    }

    public String getOperatsiyaTuri() {
        return operatsiyaTuri;
    }

    public void setOperatsiyaTuri(String operatsiyaTuri) {
        this.operatsiyaTuri = operatsiyaTuri;
    }
}