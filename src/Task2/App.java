package Task2;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.setRangi("OQ");
        car.setModeli("Cobalt");
        car.setNarxi(155_000_000);
        car.setAvtomatic(true);
        System.out.println("Car classi");
        car.print();

        /////////////////////

        TogriBurchakliUchburchak togriBurchakliUchburchak = new TogriBurchakliUchburchak();
        System.out.println()
        ;System.out.println("TogriBurchakliUchburchak");
        togriBurchakliUchburchak.yuzasi(4,3);
        togriBurchakliUchburchak.yuzasi(4.2, 7.3);
        togriBurchakliUchburchak.perimetri(4, 3, 5);
        togriBurchakliUchburchak.perimetri(3.4f, 7.5f, 6.8f);

        /////////////////////

        Point point = new Point(15,25,17);
        System.out.println();
        System.out.println("Point");
        System.out.println(point.toString());

    }
}
