package oop.labor11.lab11_2;

import oop.labor11.lab11_1.MyDate;

public class Employee {
    private final int ID;
    private String firstNanme;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private static int counter = 0;

    public Employee(String firstNanme, String lastName, double salary, MyDate birthDate) {
        this.ID = counter++;
        this.firstNanme = firstNanme;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getID() {
        return ID;
    }

    public String getFirstNanme() {
        return firstNanme;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstNanme='" + firstNanme + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
