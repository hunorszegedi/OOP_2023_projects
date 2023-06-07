package oop.labor13.lab13_1;

public class Person {
    private String name;
    private int byear = 0;
    private int dyear = 0;

    public Person(String name, int byear, int dyear) {
        this.name = name;
        this.byear = byear;
        this.dyear = dyear;
    }

    public Person(String name, int byear) {
        this.name = name;
        this.byear = byear;
    }

    public boolean hasCompleteData() {
        return dyear != 0;
    }

    public String getName() {
        return name;
    }

    public int getByear() {
        return byear;
    }

    public int getDyear() {
        return dyear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setByear(int byear) {
        this.byear = byear;
    }

    public void setDyear(int dyear) {
        this.dyear = dyear;
    }

    @Override
    public String toString() {
        return
                "name: " + name + "\n" +
                "byear: " + byear + "\n" +
                "dyear: " + dyear + "\n";
    }
}
