package Collections.LinkedList;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class Topshiriq2 {
    public static void main(String[] args) {
        // a) LinkedList to’plamini teskari tartibda ekranga chiqaruvchi metod yozing.
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
        printReverse(integers);
        System.out.println();

        // b) LinkedList to’plamini boshiga hamda oxiriga element qo’shing.
        System.out.println("B");
        integers.addFirst(0);
        integers.addLast(11);
        System.out.println(integers);

        //c) LinkedList to’plamini boshidagi hamda oxiridagi elementlarni ekranga chiqaring.
        System.out.println("C");
        System.out.println("Birinchi: " + integers.getFirst());
        System.out.println("Oxirgi: " + integers.getLast());
    }

    public static void printReverse(LinkedList<Integer> integers){
        Iterator<Integer> it = integers.descendingIterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
