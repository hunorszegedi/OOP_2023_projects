package oop.labor11.lab11_3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Storage storage = new Storage("data.txt");
        System.out.println(storage);
        Product product = storage.getProductById(1);
        if (product != null) {
            System.out.println(product);
            storage.updateProductAmount(1, 10);
            System.out.println(storage.getProductById(1));
        }
        int updatedCount = storage.update("update.txt");
        System.out.println(updatedCount + " products were successfully updated.");
        System.out.println(storage);
    }
}

