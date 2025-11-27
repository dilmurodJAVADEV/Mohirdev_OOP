package Collections.Map;

import java.util.HashMap;

public class Topshiriq2 {
    public static void main(String[] args) {
        // a) Ikkita HashMap to’plamlarini birlashtiring.
        System.out.println("A");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"Dilmurod");
        map1.put(2, "Jahongir");
        map1.put(3, "Akbarshox");
        map1.put(4, "Bobomurod");
        map1.put(5, "Jumanazar");
        map1.put(6, "Yoqub");
        System.out.println(map1);
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(7, "Zebo");
        map2.put(8, "Sanobar");
        map2.put(9, "Oybibi");
        map2.put(10, "Anajon");
        map2.put(11, "Anajon");
        map2.put(12, "Guli");
        System.out.println(map2);
        map1.putAll(map2);
        System.out.println(map1);

        // b) Birlashgan to’plamning faqat qiymatlarini ekranga chiqaruvchi metod yozing.
        System.out.println("B");
        printMap(map1);

        // c) Ushbu to’plamlarni hammasini tozalab yuboring.
        System.out.println("C");
        map1.clear();
        map2.clear();
        System.out.println("map1 -> " + map1);
        System.out.println("map2 -> " + map2);


    }

    public static void printMap(HashMap<Integer, String> maps){
        for (String s: maps.values()){
            System.out.println("Values -> " + s);
        }
    }
}
