package Collections.Map;

import javax.management.ObjectName;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Topshirq5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1,"Dilmurod");
        map.put(2,"Elmurod");
        map.put(3, "Otamurod");
        map.put(4,"Rajabboy");
        map.put(5,"Murod");
        map.put(6, "Azamat");
        System.out.println(map);
        // a) TreeMap to’plami ichidan kalitlari parametrda (int key)
        // berilgan kalit qiymatlaridan kichik bo’lgan kalit -> value juftliklarini chop eting.
        System.out.println("A");
        printKeyValue(map,4);

        // b) TreeMap kalitlarini TreeSet orqali ifodalang, hamda ekranga chop eting.
        System.out.println("B");
        TreeSet<Integer> treeSet = new TreeSet<>(map.keySet());
        System.out.println(treeSet);


        // c) TreeMap elementlarini barchasini o’chirib yuboring.
        System.out.println("C");
        map.clear();
        System.out.println(map);

    }

    public static void printKeyValue(TreeMap<Integer, String> maps, int key){
        for (Integer k: maps.keySet()) {
            if (k < key) {
                System.out.println(k + " -> " + maps.get(k));
            }
        }
    }
}
