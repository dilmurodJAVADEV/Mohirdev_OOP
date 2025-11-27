package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Topshiriq3 {
    public static void main(String[] args) {
        // a) HashMap to’plamini klonini yarating.
        System.out.println("A");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"Dilmurod");
        map1.put(2, "Jahongir");
        map1.put(3, "Akbarshox");
        map1.put(4, "Bobomurod");
        map1.put(5, "Jumanazar");
        map1.put(6, "Yoqub");
        System.out.println(map1);
        HashMap<Integer, String> mapClone = (HashMap<Integer, String>) map1.clone();

        // b) Klon qilingan to’plam elementlarini arrayList sifatida qaytaruvchi metod yozing.
        System.out.println("B");
        System.out.println(arrayList(map1));

    }

    public static ArrayList<String> arrayList(HashMap<Integer, String> map){
        //ArrayList<String> mapList = (ArrayList<String>) map.values();
        //return mapList;

        return new ArrayList<>(map.values());
    }
}
