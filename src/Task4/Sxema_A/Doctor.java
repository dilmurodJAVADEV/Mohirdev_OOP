package Task4.Sxema_A;

public class Doctor {
    private String name;
    private String surname;
    private int age;
    private String phone;
    private String mutaxasosligi;
    private String address;
    private double maoshi;

    public Doctor(String name, String surname, int age, String phone, String mutaxasosligi, String address, double maoshi) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.mutaxasosligi = mutaxasosligi;
        this.address = address;
        this.maoshi = maoshi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMutaxasosligi() {
        return mutaxasosligi;
    }

    public void setMutaxasosligi(String mutaxasosligi) {
        this.mutaxasosligi = mutaxasosligi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaoshi() {
        return maoshi;
    }

    public void setMaoshi(double maoshi) {
        this.maoshi = maoshi;
    }


    public void showInfo() {
        System.out.println( "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", mutaxasosligi='" + mutaxasosligi + '\'' +
                ", address='" + address + '\'' +
                ", maoshi=" + maoshi +
                '}');
    }
}
