package Task4.Sxema_A;

public class Main {
    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg("Dilmurod", "Boyjonov", 25, "+998563214",
                "Toshkent shaxri mevazpr mahallasi 45 uy", 2563256, "yurak operatsiyasi");
        Lor lor = new Lor("Azamat", "Abdullarv", 35, "+998565741",
                "Xorajm viloyari Alpomish mahallasi 45 uy", 6541238, "Quloq, Burun");

        xirurg.showInfo();
        System.out.println();
        lor.showInfo();
    }
}
