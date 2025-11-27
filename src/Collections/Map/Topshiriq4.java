package Collections.Map;

import java.util.TreeMap;

public class Topshiriq4 {
    public static void main(String[] args) {
        // a) TreeMap to’plam yarating, hamda qiymatlar bilan to’ldiring.
        System.out.println("A");
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(1,"Dilmurod");
        map1.put(2, "Jahongir");
        map1.put(3, "Akbarshox");
        map1.put(4, "Bobomurod");
        map1.put(5, "Jumanazar");
        map1.put(6, "Yoqub");
        System.out.println(map1);

        // b) TreeMap to’plamning birinchi va oxirig elementlarini ekranga chiqaring.
        System.out.println("B");
        System.out.println("First value -> " + map1.firstEntry());
        System.out.println("Last value -> " + map1.lastEntry());

        // c) Ushbu to’plamning kalitlarini teskari tartibda ekranga chiqaring.
        for (Integer key: map1.descendingKeySet()){
            System.out.print(key + " ");
        }


    }
}
