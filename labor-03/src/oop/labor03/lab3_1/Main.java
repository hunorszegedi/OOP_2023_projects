package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {

        //creating customers
        Customer mary = new Customer("Mary", "Washington");
        Customer john = new Customer("John", "Black");
        //set acounts
        mary.setAccount(new BankAccount("OTP00001"));
        john.setAccount(new BankAccount("OTP00002"));
        //printing customer details
        System.out.println(mary); //recommended approach
        System.out.println(john);
        //set, print, deposit, withdraw
        mary.getAccount().deposit(10000);
        john.getAccount().deposit(25000);
        john.getAccount().deposit(1000000);
        mary.getAccount().withdraw(1200);
        mary.getAccount().deposit(3000);
        john.getAccount().withdraw(3000);
        System.out.println(mary);
        System.out.println(john);
        //closing mary's account
        mary.closeAccount();
        //print mary's details
        System.out.println(mary);
        //mary using john bank account
        mary.setAccount(john.getAccount());
        //print
        System.out.println(mary);
        System.out.println(john);

    }
}
