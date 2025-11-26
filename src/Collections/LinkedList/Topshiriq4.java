package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Topshiriq4 {
    public static void main(String[] args) {
        // a) Ikkita LinkedList to’plamini birlashtiruvchi, hamda birlashgan to’plamni qaytaruvchi metod yozing.
        System.out.println("A");
        LinkedList<String> boyName = new LinkedList<>();
        boyName.add("Dilshod");
        boyName.add("Dilmurod");
        boyName.add("Otamurod");
        boyName.add("Bobomurod");
        boyName.add("Elmurod");
        LinkedList<String> grilName = new LinkedList<>();
        grilName.add("Dilnoza");
        grilName.add("Gulnoza");
        grilName.add("Shohnoza");
        grilName.add("Zarnigor");
        grilName.add("Diyor");
        System.out.println(result(boyName, grilName));

        // b) LinkedList to’plamini nusxasini yarating.
        System.out.println("B");
        LinkedList<String> copy = new LinkedList<>(boyName);
        System.out.println(copy);

        // c) LinkedList to’plamining birinchi elementini o’chiruvchi,
        // hamda qolgan elementlarini ekranga chiqaruvchi metod yozing
        System.out.println("C");
        System.out.println(grilName);
        print(grilName);


    }

    public static LinkedList<String> result(LinkedList<String> list1, LinkedList<String> list2){
        LinkedList<String> result = new LinkedList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static void print(LinkedList<String> list){
        list.removeFirst();
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
