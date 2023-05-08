package oop.labor11.lab11_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates = new ArrayList<>();
        Random random = new Random();
        while (dates.size() != 10) {
            int year = random.nextInt(2050);
            int month = random.nextInt(13);
            int day = random.nextInt(32);
            if (DateUtil.isValidDate(year, month, day)) {
                dates.add(new MyDate(year, month, day));
            }
        }
        //meg kell adni ennek egy fuggveny
        //e, mint elem
        //nyil
        //kapcsos zarojel -- ide teszem a fuggveny utasitasait
//        dates.forEach((e) ->{
//            System.out.println();
//        });
        dates.forEach(System.out::println);
    }
}
