package oop.labor14.gyakorlas_vizsga.gyak1;

public enum GestureType {
    UP(0, "fel"),
    RIGHT(1, "jobb"),
    DOWN(2, "le"),
    LEFT(3, "bal");

    GestureType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    private int value;
    private String name;

}
