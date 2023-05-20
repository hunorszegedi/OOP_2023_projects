package oop.labor12.lab12_2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Storage storage = new Storage("data10000.txt");
        System.out.println(storage);
        Product product = storage.getProductById(1);
        if (product != null) {
            System.out.println(product);
            storage.updateProductAmount(1, 10);
            System.out.println(storage.getProductById(1));
            System.out.println("\n\n");
        }
        int updatedCount = storage.update("update10000.txt");
        System.out.println(updatedCount + " products were successfully updated.");
        System.out.println(storage);
    }
}
