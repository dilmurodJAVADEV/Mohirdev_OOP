package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Topshiriq1 {
    public static void main(String[] args) {
        // a) LinkedList to’plam yarating, uni qiymatlar bilan to’ldiring.
        System.out.println("A");
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        System.out.println(integers);

        // b) Ushbu to’plam elementlarini iterator orqali ekranga chiqaruvchi method yozing.
        System.out.println("B");
        printWithItarator(integers);

        // c) Ushbu to’plamning hajmini ekranga chiqarib, to’plamni elementlardan tozalab yuvoring.
        System.out.println();
        System.out.println("C");
        System.out.println("Hajmi: " + integers.size());
        integers.clear();
        System.out.println("Hajmi: " + integers.size());
    }

    public static void printWithItarator(LinkedList<Integer> integers){
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }

}
