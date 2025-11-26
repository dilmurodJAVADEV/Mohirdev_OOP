package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class Topshiriq3 {
    public static void main(String[] args) {
        // a) HashSet to’plamini klonini yarating.
        System.out.println("A");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        HashSet<Integer> clonHashSet = (HashSet<Integer>) hashSet.clone();
        System.out.println(clonHashSet);

        // b) Hosil bo’lgan klonni ArrayList to’plamiga konvert qiling.
        System.out.println("B");
        ArrayList<Integer> konvert = new ArrayList<>(hashSet);
        System.out.println(konvert);

        // c) ArrayList to’plam elementlarini faqat juft o’rinda turganlarini ekranga chiqaring.
        System.out.println("C");
        for (int i = 0; i < konvert.size(); i += 2) {
            System.out.print(konvert.get(i) + " ");
        }
    }
}
