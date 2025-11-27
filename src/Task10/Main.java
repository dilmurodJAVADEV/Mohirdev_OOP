package Task10;

public class Main {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(23, 59, 58);

        System.out.println("Boshlanish: " + t1);

        t1.nextSecond();
        System.out.println("nextSecond: " + t1);

        t1.nextSecond();
        System.out.println("nextSecond: " + t1);

        t1.previousSecond();
        System.out.println("previousSecond: " + t1);

        t1.nextMinute();
        System.out.println("nextMinute: " + t1);

        t1.previousMinute();
        System.out.println("previousMinute: " + t1);

        t1.nextHour();
        System.out.println("nextHour: " + t1);

        t1.previousHour();
        System.out.println("previousHour: " + t1);
    }
}
