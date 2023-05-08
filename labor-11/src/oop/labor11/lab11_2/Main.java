package oop.labor11.lab11_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Sapientia");
        company.hireAll("employees.csv");
        company.printAll(System.out);
        company.sortByComparator((e1, e2) -> {
            if (e1.getFirstNanme().equals(e2.getFirstNanme())) {
                return e1.getLastName().compareTo(e2.getLastName());
            }
            return e1.getFirstNanme().compareTo(e2.getFirstNanme());
        });
        System.out.println("\n\tABC sorrendben: ");
        company.printAll(System.out);


        //csokkeno sorrend fizetes szerint
        company.sortByComparator(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("\n\tFizetes szerinti csokkeno: ");
        company.printAll(System.out);

    }
}
