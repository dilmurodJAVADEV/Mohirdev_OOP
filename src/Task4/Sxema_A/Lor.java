package Task4.Sxema_A;

public class Lor extends Doctor{
    private String yonalishi;

    public Lor(String name, String surname, int age, String phone, String address, double maoshi, String yonalishi) {
        super(name, surname, age, phone, "Lor", address, maoshi);
        this.yonalishi = yonalishi;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Yo`alishi: " + yonalishi);
    }

    public String getYonalishi() {
        return yonalishi;
    }

    public void setYonalishi(String yonalishi) {
        this.yonalishi = yonalishi;
    }
}
