package oop.labor11.lab11_2;

import oop.labor11.lab11_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void hireAll(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(",");
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                Double salary = Double.parseDouble(items[2].trim());
                int year = Integer.parseInt(items[3].trim());
                int month = Integer.parseInt(items[4].trim());
                int day = Integer.parseInt(items[5].trim());
                Employee emp = null;
                if (items.length == 6) {
                    emp = new Employee(firstName, lastName, salary, new MyDate(year, month, day));
                } else {
                    emp = new Manager(firstName, lastName, salary, new MyDate(year, month, day), items[6].trim());
                }
                this.hire(emp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found \n" + fileName + "!\n");
        }
    }

    public void fire(int ID) {
        for (Employee employee : employees) {
            if (ID == employee.getID()) {
                employees.remove(employee);
                break;
            }
        }
    }

    public void printAll(PrintStream ps) {
        employees.forEach(ps::println);
    }

    public void printManagers(PrintStream ps) {
        //megirhatjuk foreach-el is
        for (Employee employee : employees) {
            if (employee.getClass() == Manager.class) {
                ps.println(employee);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> employeeComparator) {
        Collections.sort(employees, employeeComparator);
    }

    public void printDepartments() {
        for (Employee employee : employees) {
            if (employee.getClass() == Manager.class){
                System.out.println(((Manager) employee).getDepratment());
            }
        }
    }

}
