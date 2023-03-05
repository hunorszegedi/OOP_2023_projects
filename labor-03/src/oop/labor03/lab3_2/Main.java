package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;


public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Szegedi", "Hunor");
        Customer customer2 = new Customer("Nagy", "Janos");

        BankAccount account1 = new BankAccount("IBAN0001");
        BankAccount account2 = new BankAccount("IBAN0002");
        BankAccount account3 = new BankAccount("IBAN0003");
        BankAccount account4 = new BankAccount("IBAN0004");
        BankAccount account5 = new BankAccount("IBAN0005");
        BankAccount account6 = new BankAccount("IBAN0006");
        BankAccount account7 = new BankAccount("IBAN0007");
        BankAccount account8 = new BankAccount("IBAN0008");
        BankAccount account9 = new BankAccount("IBAN0009");

        //customer1 -- 5 accounts
        customer1.addAccount(account9);
        customer1.addAccount(account8);
        customer1.addAccount(account7);
        customer1.addAccount(account6);
        customer1.addAccount(account5);

        //customer2 -- 9 accounts
        customer2.addAccount(account1);
        customer2.addAccount(account2);
        customer2.addAccount(account3);
        customer2.addAccount(account4);
        customer2.addAccount(account5);
        customer2.addAccount(account6);
        customer2.addAccount(account7);
        customer2.addAccount(account8);
        customer2.addAccount(account9);

        //print the customers
        System.out.println(customer1);
        System.out.println(customer2);

        //deposit in each account
        account1.deposit(11);
        account2.deposit(230);
        account3.deposit(9123);
        account4.deposit(123);
        account5.deposit(30);
        account6.deposit(990);
        account7.deposit(540);
        account8.deposit(650);
        account9.deposit(80);

        //close the first account of the first customer
        customer1.closeAccount("IBAN0009");
        //close the last account of the second customer
        customer2.closeAccount("IBAN0009");

        //print the customers
        System.out.println(customer1);
        System.out.println(customer2);

    }
}
