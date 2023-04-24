package oop.labor09.lab9_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IDictionary dictionary = ArrayListDictionary.newInstance();
       
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println(" Find(" + word + "): " + dictionary.find(word));
        }
        scanner.close();

    }
}
