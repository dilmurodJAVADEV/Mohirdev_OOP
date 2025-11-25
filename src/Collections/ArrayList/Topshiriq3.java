package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Topshiriq3 {
    public static void main(String[] args) {
        // a) ArrayList to’plami elementlarini teskari tartibda joylashtiruvchi metod yozing.
        ArrayList<String> list = new ArrayList<>();
        list.add("olam");
        list.add("Behi");
        list.add("Shaftoli");
        list.add("Bannan");

        System.out.println(list);
        System.out.println(teskariTartib(list));

        // b) ArrayList to’plamini parametrida berilgan (int firstIndex, int lastIndex)
        // qiymatlar bo’yicha bo’lagini kesib oluvchi metod yozing.
        System.out.println();
        System.out.println(subList(list,1,4));

    }

    public static ArrayList<String> teskariTartib(ArrayList<String> list){
        ArrayList<String> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return new ArrayList<>(reversed);
    }

    public static ArrayList<String> subList(ArrayList<String> list, int first, int last){
        return new ArrayList<>(list.subList(first,last));
    }
}
