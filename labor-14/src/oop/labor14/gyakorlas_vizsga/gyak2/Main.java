package oop.labor14.gyakorlas_vizsga.gyak2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Set<Integer> lotteryWinningNumbers = new HashSet<>();
//        System.out.println(lotteryWinningNumbers);
//        lotteryWinningNumbers.add(1);
//        lotteryWinningNumbers.add(4);
//        System.out.println(lotteryWinningNumbers);
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            lotteryWinningNumbers.add(random.nextInt());
//        }
//        System.out.println(lotteryWinningNumbers);
//        lotteryWinningNumbers.clear();
//
//        System.out.println(lotteryWinningNumbers);
//
//        TreeSet<Integer> szamok = new TreeSet<>();
//        szamok.add(2);
//        szamok.add(6);
//        szamok.add(3);
//        szamok.add(9);
//
//        System.out.println(szamok);
//        System.out.println(szamok.first());
//        szamok.remove(3);
//        System.out.println(szamok);
        Map<String, Integer> nameToAgeMap = new HashMap<>();
        nameToAgeMap.put("Attila", 20);
        nameToAgeMap.put("Janos", 32);
        System.out.println(nameToAgeMap);

    }
}
