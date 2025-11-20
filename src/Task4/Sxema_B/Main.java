package Task4.Sxema_B;

public class Main {
    public static void main(String[] args) {

        PC ps = new PC("Dell", "Dell_4", 350, "Intrl i7", true);
        Laptop laptop = new Laptop("Lenovo", "lenovo thinkpad", 560, "Core I9", 1.8);

        Subwoofer subwoofer = new Subwoofer("JBL", "SubX", 150, 80, true);
        Loundspeaker loundspeaker = new Loundspeaker("Sony", "SoundMax", 120, 60, 2);

        System.out.println("-----Shaxshiy kopyute-----");
        ps.show();
        System.out.println("-----Noutbok-----");
        laptop.show();
        System.out.println("-----Subwoofer-----");
        subwoofer.show();
        System.out.println("-----Loundspeaker-----");
        loundspeaker.show();
    }
}
