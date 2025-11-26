package Collections.Set;

import java.util.HashSet;

public class Topshiriq2 {
    public static void main(String[] args) {
        // a) HashSet to’plamini o’lchamini ekranga chiqaring.
        System.out.println("A");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        System.out.println("hashSet size: " + hashSet.size());

        //b) Ushbu to’plamni bo’sh yoki bo’sh emasligi haqida ma’lumot chop eting.
        System.out.println("B");
        System.out.println(hashSet.isEmpty() ? "Bo`sh" : "Bo`sh emas");

        //c) Ushbu to’plamning barcha elementlarini o’chirib yuboring.
        System.out.println("C");
        hashSet.clear();
        System.out.println("size: " + hashSet.size());


    }
}
