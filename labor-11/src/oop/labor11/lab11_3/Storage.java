package oop.labor11.lab11_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    private final ArrayList<Product> products = new ArrayList<>();


    public Storage(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                int identifier = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                int amount = Integer.parseInt(parts[2].trim());
                int price = Integer.parseInt(parts[3].trim());
                if (parts.length == 4) {
                    this.products.add(new Product(identifier, name, amount, price));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found \n" + fileName + "!\n");
        }
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
            int identifier = Integer.parseInt(parts[0].trim());
            int newAmount = Integer.parseInt(parts[1].trim());
            Product product = getProductById(identifier);
            if (product != null) {
                product.increaseAmount(newAmount);
                updatedCount++;
            }
        }
        scanner.close();
        System.out.println(updatedCount + " products were succesfully updated.");
        return updatedCount;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "products=" + products +
                '}';
    }


}
