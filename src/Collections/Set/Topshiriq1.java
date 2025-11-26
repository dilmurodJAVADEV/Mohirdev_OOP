package Collections.Set;

import java.util.*;

public class Topshiriq1 {
    public static void main(String[] args) {
        // a) HashSet to’plamini yarating, elementlar qo’shing.
        System.out.println("A");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        System.out.println(hashSet);

        // b) To’plam elementlarini iterator orqali ekranga chiqaring.
        System.out.println("B");
        itaratorPrint(hashSet);

        // c) To’plam elementlarini teskari tartibda ekranga chiqaring.
        System.out.println("C");
        printReverse(hashSet);
    }

    public static void itaratorPrint(HashSet<Integer> hashSet){
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void printReverse(HashSet<Integer> integers){
        List<Integer> list = new ArrayList<>(integers);
        Collections.reverse(list);
        System.out.println(list);
    }

}
