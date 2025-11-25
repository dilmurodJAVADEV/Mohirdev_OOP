package Collections.ArrayList;

import java.util.ArrayList;

public class Topshiriq4 {
    public static void main(String[] args) {

        // a) Ikkita ArrayList to’plamini mos elementlari bilan solishtiruvchi
        // va natijani boshqa to’plamga yozib ketuvchi metod yozing.
        //Namuna: [“Green”,”Red”] & [“Green”,”Black”] -> result: [“Yes”,”No”];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dilmurod");
        list1.add("Bekzod");
        list1.add("Shahlo");
        list1.add("Azamat");
        list1.add("Bobur");
        list1.add("Rano");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Dilmurod");
        list2.add("Davron");
        list2.add("Zebo");
        list2.add("Azamat");
        list2.add("Bobur");
        list2.add("Farida");
        System.out.println(list2);

        System.out.println(result(list1, list2));
    }

    public static ArrayList<String> result(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))){
                results.add("Yes");
            } else {
                results.add("No");
            }
        }
        return results;
    }
}