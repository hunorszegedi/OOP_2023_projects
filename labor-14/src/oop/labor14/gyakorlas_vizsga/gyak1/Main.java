package oop.labor14.gyakorlas_vizsga.gyak1;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println(Product.getCounter());
        Product p2 = new Product();
        System.out.println(Product.getCounter());
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(InstanceCounter.getCounter());
        InstanceCounter ic = new InstanceCounter();
        System.out.println(InstanceCounter.getCounter());

        for(GestureType type: GestureType.values()){
            System.out.println(type.name()+", "+
                    type.getName()+", "+ type.getValue());
        }

        PeldanySzamlalo sz1 = new PeldanySzamlalo();
        System.out.println(sz1);
        System.out.println( (new PeldanySzamlalo()).getPeldanySzam());
        System.out.println(PeldanySzamlalo.getPeldanySzam());

        Employee employee = new Employee("Attila", 10000, 2000);
        System.out.println(employee.toString());

        employee = new Manager("Jozska", 8000, 2000, 3);
        System.out.println(employee.toString());

        Employee e1 = new Employee("Endre",8000, 2000);
        Manager m1 = new Manager("Johanna",3000, 2001, 3);
        System.out.println(e1.createMessage(e1));
        System.out.println(m1.createMessage(m1));

        Employee emps[] = new Employee[ 100 ];
        emps[ 0 ] = new Employee("Ati", 3000, 2000);
        emps[ 1 ] = new Manager("Laci", 51000, 20001, 2);
        emps[ 2 ] = new Employee("Joska", 170000, 2000);
        int counter = 0;
        for( Employee e: emps ){
            if( e instanceof Manager ){
                ++counter;
            }
        }
        System.out.println(counter);

        Employee emp1 = new Employee("Johny", 10000, 2001);
        Employee emp2 = new Employee("Alice", 6000, 2000);

        int comparisonResult = emp1.compareTo(emp2);

        if (comparisonResult < 0) {
            System.out.println(emp1.getName() + " has a lower salary than " + emp2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(emp1.getName() + " has a higher salary than " + emp2.getName());
        } else {
            System.out.println(emp1.getName() + " has the same salary as " + emp2.getName());
        }
    }
}
