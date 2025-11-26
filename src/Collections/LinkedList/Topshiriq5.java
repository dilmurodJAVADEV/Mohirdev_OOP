package Collections.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.WeakHashMap;

public class Topshiriq5 {
    public static void main(String[] args) {
        // a) LinkedList to’plam elementlari o’rnini aralashtirib yuboruvchi metod yozing.
        System.out.println("A");
        LinkedList<String> boyName = new LinkedList<>();
        boyName.add("Dilshod");
        boyName.add("Dilmurod");
        boyName.add("Otamurod");
        boyName.add("Bobomurod");
        boyName.add("Elmurod");
        System.out.println(boyName);
        Collections.shuffle(boyName);
        System.out.println(boyName);

        // b) LinkedList to’plam elementlarini ArrayList to’plamiga ko’chirib o’tkazing.
        System.out.println("B");
        ArrayList<String> copyArrayList = new ArrayList<>(boyName);
        System.out.println(copyArrayList);


        // c) LinkedList to’plam elementlarini o’sish tartibida saralang,
        // hamda ichidan biror element bor yoki yo’qligini aniqla
        System.out.println("C");
        System.out.println(boyName);
        Collections.sort(boyName);
        System.out.println(boyName);

        String search = "Bobomurod";
        if(boyName.contains(search)){
            System.out.println(search + " bor!");
        } else {
            System.out.println(search + " yoq!");
        }
    }
}
