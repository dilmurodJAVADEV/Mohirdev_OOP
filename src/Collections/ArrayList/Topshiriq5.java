package Collections.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Topshiriq5 {
    public static void main(String[] args) {
        // a) ArrayList to’plamini ikki elementini o’rnini almashtiruvchi metod yozing.
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("A");
        list1.add("Dilmurod");
        list1.add("Bekzod");
        list1.add("Shahlo");
        list1.add("Azamat");
        list1.add("Bobur");
        list1.add("Rano");
        System.out.println(list1);
        swapElements(list1,2,5);
        System.out.println(list1);

        // b) Ikkita ArrayList to’plamlarini birlashtiruvchi metod yozing.
        System.out.println("B");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Dilmurod");
        list2.add("Davron");
        list2.add("Zebo");
        list2.add("Azamat");
        list2.add("Bobur");
        list2.add("Farida");
        System.out.println(list2);
        System.out.println(merge(list1,list2));


        // c) ArrayList to’plamini faqat 3 ta element joylashadigan qilib yarating,
        // hamda 3 ta element joylaganizdan so’ng, ushbu to’plam o’lchamini 6 ta elementga oshiring.
        ArrayList<String> arr = new ArrayList<>(3);
        System.out.println("C");
        arr.add("A");
        arr.add("B");
        arr.add("C");

        System.out.println("Oldingi o‘lcham: " + arr.size());

        arr.ensureCapacity(6);

        System.out.println("6 ta elementga kengaytirildi!");
    }

    public static void swapElements(ArrayList<String> list, int i, int j){
        Collections.swap(list, i, j);
    }

    public static ArrayList<String> merge(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> marge = new ArrayList<>(list1);
        marge.addAll(list2);
        return marge;
    }
}