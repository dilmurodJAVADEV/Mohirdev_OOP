package Collections.LinkedList;

import javax.swing.*;
import java.util.LinkedList;

public class Topshiriq3 {
    public static void main(String[] args) {
        //a) LinkedList to’plamidan ma’lum bir indexdagi qiymatni o’chiruvchi metod yozing.
        System.out.println('A');
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        System.out.println(integers);
        removeAtIndex(integers,4);
        System.out.println(integers);

        //b) LinkedList to’plamidan birinchi va oxirgi elementni o’chirib, so’ng, shu o’chgan elementlarni ekranga chiqaruvchi metod yozing.
        System.out.println("B");
        Integer first = integers.removeFirst();
        Integer last = integers.removeLast();
        System.out.println("O`chirilgan birinchi element: " + first);
        System.out.println("O`chirilgan oxirgi element: " + last);

        //c) LinkedList to’plamining barcha elementlarini o’chirib yuboring.
        System.out.println("C");
        integers.clear();
        System.out.println("integers size: " + integers.size());
    }

    public static void removeAtIndex(LinkedList<Integer> integers, int index){
        integers.remove(index);
    }

}
