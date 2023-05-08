package oop.labor11.lab11_2;

import oop.labor11.lab11_1.MyDate;

public class Manager extends Employee {
    private String depratment;

    public Manager(String firstNanme, String lastName, double salary, MyDate birthDate, String depratment) {
        super(firstNanme, lastName, salary, birthDate);
        this.depratment = depratment;
    }

    public void setDepratment(String depratment) {
        this.depratment = depratment;
    }

    public String getDepratment() {
        return depratment;
    }

    @Override
    public String toString() {
        return "Manager {" +
                super.toString() + ", " +
                depratment + "}";
    }
}
