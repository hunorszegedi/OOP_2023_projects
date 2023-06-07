package oop.labor14.gyakorlas_vizsga.gyak1;

public class InstanceCounter {
    private static int counter;

    public InstanceCounter() {
        ++counter;
    }

    public static int getCounter() {
        return counter;
    }
}
