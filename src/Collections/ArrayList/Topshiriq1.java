package Collections.ArrayList;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class Topshiriq1 {
    public static void main(String[] args) {

        ArrayList <String> collor = new ArrayList<>();
        // a) a) ArrayList klasidan foydalanib, 7 ta ranglarni to’plamga qo’shib, uni ekranga chop eting.
        collor.add("Red");
        collor.add("Green");
        collor.add("Blue");
        collor.add("Yellow");
        collor.add("Black");
        collor.add("White");
        collor.add("Purple");

        System.out.println(collor);

        // b) Yaratilgan to’plamning birinchi elementini boshqa qiymatga o’zgartiring.
        System.out.println();
        collor.set(0,"Orange");
        System.out.println(collor);

        // c) To’plamning elementlarini, o’lchamini ekranga chiqaruvchi dastur tuzing.
        System.out.println();
        System.out.println("Elementlar: "+ collor);
        System.out.println("O`lchami: " + collor.size());


    }
}
