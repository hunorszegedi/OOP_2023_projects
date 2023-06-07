package oop.labor14.gyakorlas_vizsga.gyak2;

import java.util.*;

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
//        Map<String, Integer> nameToAgeMap = new HashMap<>();
//        nameToAgeMap.put("Attila", 20);
//        nameToAgeMap.put("Janos", 32);
//        nameToAgeMap.put("Reka", 45);
//        System.out.println(nameToAgeMap);
//        Integer ageOf = nameToAgeMap.get("Janos");
//        System.out.println(ageOf);
//        Integer value = nameToAgeMap.remove("Reka");
//        System.out.println(value);
//        System.out.println(nameToAgeMap);
        Map<String, String> initialsToNameMap = new TreeMap<>();
        initialsToNameMap.put("SZH", "Szegedi Hunor");
        initialsToNameMap.put("KI", "Kovacs Ilona");
        initialsToNameMap.put("TE", "Teszt Elek");
        initialsToNameMap.put("GJ", "Gipsz Jakab");
        initialsToNameMap.put("TG", "Toth Geza");
        initialsToNameMap.put("DV", "Dora Virag");
        System.out.println(initialsToNameMap);

        Map <Person, Integer> personToAgeMap = new TreeMap<>(new PersonFirstNameComparator());
        personToAgeMap.put(new Person("Elek", "Almasi"), 30);
        personToAgeMap.put(new Person("Antal", "Toth"), 32);
        personToAgeMap.put(new Person("Peter", "Kis"), 15);
        personToAgeMap.put(new Person("Joska", "Szegedi"), 44);
        System.out.println(personToAgeMap);

    }
}
