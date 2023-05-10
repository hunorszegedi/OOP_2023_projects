package oop.labor11.lab11_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products;

    public Storage(String filename) throws FileNotFoundException {
        this.products = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            int identifier = Integer.parseInt(parts[0]);
            String name = parts[1];
            int amount = Integer.parseInt(parts[2]);
            int price = Integer.parseInt(parts[3]);
            this.products.add(new Product(identifier, name, amount, price));
        }
        scanner.close();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getIdentifier() == id) {
                return product;
            }
        }
        return null;
    }

    public void updateProductAmount(int id, int newAmount) {
        Product product = getProductById(id);
        if (product != null) {
            product.increaseAmount(newAmount);
        }
    }

    public int update(String fileName) throws FileNotFoundException {
        int updatedCount = 0;
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            int identifier = Integer.parseInt(parts[0]);
            int newAmount = Integer.parseInt(parts[1]);
            Product product = getProductById(identifier);
            if (product != null) {
                product.increaseAmount(newAmount);
                updatedCount++;
            }
        }
        scanner.close();
        System.out.println(updatedCount + "products were succesfully updated.");
        return updatedCount;
    }
}
