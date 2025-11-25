package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Topshiriq2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // a) Ixtiyoriy ma’lumot bilan to’ldirilgan ArrayList yarating.
        // Hamda to’plamning ichidan elementlarni biror qiymat bo’yicha qidiring.
        // Qidirgan elementingiz topilgani yoki topilmagani haqida konsolga ma’lumot chiqaring.

        list.add("olam");
        list.add("Behi");
        list.add("Shaftoli");
        list.add("Bannan");

        String search = "Behi";

        if (list.contains(search)){
            System.out.println(search + " topildi!");
        } else {
            System.out.println(search + " topilmadi!");
        }

        // b) ArrayListdan nusxa oling.
        System.out.println();
        ArrayList<String> listCopy = new ArrayList<>(list);
        System.out.println(listCopy);

        // c) ArrayList elementlarni aralashtirish uchun dastur yozing.
        Collections.shuffle(list);
        System.out.println();
        System.out.println(list);
    }
}
