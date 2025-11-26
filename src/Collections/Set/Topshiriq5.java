package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class Topshiriq5 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);
        hashSet1.add(6);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(7);
        hashSet2.add(3);
        hashSet2.add(9);
        hashSet2.add(5);
        hashSet2.add(0);

        // a) Ikkita HashSet to’plamlarining birinchisida mavjud bo’lib,
        // ikkinchisida mavjud bo’lmagan elementlarni arrayList sifatida qaytaruvchi metod yozing.
        // Namuna: [1,2,3] & [3,4,5] -> result: [1,2]
        System.out.println("A");
        System.out.println(birinchisidaBor(hashSet1, hashSet2));

        // b) Ikkita HashSet to’plamlarining ikkinchisida mavjud bo’lib,
        // birinchisida mavjud bo’lmagan elementlarni arrayList sifatida qaytaruvchi metod yozing.
        // Namuna: [1,2,3] & [3,4,5] -> result: [4,5]
        System.out.println("B");
        System.out.println(ikkinchisdaBor(hashSet1,hashSet2));


        // c) Ikkita HashSet to’plamlarining faqat juft elementlaridan tashkil topgan
        // arrayList to’plam yaratib qaytaruvchi metod yozing.
        // Namuna: [1,2,3] & [3,4,5] -> result: [2,4]
        System.out.println("C");
        System.out.println(juftElementlar(hashSet1,hashSet2));

    }

    public static ArrayList<Integer> birinchisidaBor(HashSet<Integer> set1, HashSet<Integer> set2){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer x: set1){
            if (!set2.contains(x)){
                list.add(x);
            }
        }
        return list;
    }

    public static ArrayList<Integer> ikkinchisdaBor(HashSet<Integer> set1, HashSet<Integer> set2){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer x: set2){
            if (!set1.contains(x)){
                list.add(x);
            }
        }
        return list;
    }

    public static ArrayList<Integer> juftElementlar(HashSet<Integer>set1, HashSet<Integer> set2){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer x: set1){
            if (x % 2 == 0){
                list.add(x);
            }
        }

        for (Integer x:set2){
            if (x % 2 == 0 && !list.contains(x)){
                list.add(x);
            }
        }

        return list;
    }
}
