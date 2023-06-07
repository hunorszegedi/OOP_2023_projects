package oop.labor14.gyakorlas_vizsga.gyak1;

public class Product {
    private int serialNumer;
    private static int counter = 0;

    public Product() {
        counter++;
        serialNumer = counter;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumer=" + serialNumer +
                '}';
    }
}
