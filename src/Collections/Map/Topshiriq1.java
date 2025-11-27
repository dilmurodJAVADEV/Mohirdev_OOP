package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Topshiriq1 {
    public static void main(String[] args) {
        // a) HashMap to’plam yarating, hamda qiymatlar bilan to’ldiring.
        System.out.println("A");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Dilmurod");
        map.put(2,"Elmurod");
        map.put(3, "Otamurod");
        map.put(4,"Rajabboy");
        map.put(5,"Murod");
        map.put(6, "Azamat");
        System.out.println(map);

        // b) Ushbu to’plamni elementlarini key -> value sifatida chop eting.
        System.out.println("B");
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // c) To’plam hajmini chop eting.
        System.out.println("C");
        System.out.println("Size: -> " + map.size());
    }

}
