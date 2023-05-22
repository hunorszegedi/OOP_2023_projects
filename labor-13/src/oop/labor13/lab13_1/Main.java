package oop.labor13.lab13_1;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        register.readFile("input.txt");
//        System.out.println(register);
        register.printData();
        System.out.println("\n");
        register.sortPersons();
    }
}
