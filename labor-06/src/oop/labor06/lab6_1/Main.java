package oop.labor06.lab6_1;

import oop.labor06.lab6_1.BankAccount;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            BankAccount account = new BankAccount();
            accounts.add(account);
//            System.out.println(account);
        }

//        ArrayList<Customer> customers = new ArrayList<>();
//        Customer customer1 = new Customer("Kis", "Janos");
//        customers.add(customer1);
//        Customer customer2 = new Customer("Nagy", "Peter");
//        customers.add(customer2);
//        Customer customer3 = new Customer("Kover", "Almos");
//        customers.add(customer3);
//
//        customer1.addAccount(accounts.get(0));
//        customer2.addAccount(accounts.get(1));
//        customer3.addAccount(accounts.get(2));
//
//        System.out.println(customers);

//Create a bank with the name OTP
//        ArrayList<Customer> customersOTP = new ArrayList<>();
        Customer customerOTP1 = new Customer("Mike", "Tyson");
//        customersOTP.add(customerOTP1);
        Customer customerOTP2 = new Customer("Jonah", "Hill");
//        customersOTP.add(customerOTP2);
        Bank bank1 = new Bank("OTP");
//Add two accounts to each customer
        customerOTP1.addAccount(accounts.get(0));
        customerOTP1.addAccount(accounts.get(1));
        customerOTP2.addAccount(accounts.get(2));
        customerOTP2.addAccount(accounts.get(3));
//Add two customers to the bank
        bank1.addCustomer(customerOTP1);
        bank1.addCustomer(customerOTP2);
        System.out.println(customerOTP1);
        System.out.println(customerOTP2);
        System.out.println();
//Print the customer having id equal to 1 to the standard output
        System.out.println(bank1.getCustomer(1));

        bank1.getCustomer(1).getAccounts("OTP0000001").deposit(500);
        bank1.getCustomer(1).getAccounts("OTP0000002").deposit(5000);
        bank1.getCustomer(1).getAccounts(String.valueOf(accounts.get(0).getAccountNumber())).deposit(5000);
        bank1.getCustomer(2).getAccounts("OTP0000004").deposit(300);
        System.out.println(customerOTP1);
        System.out.println(customerOTP2);
        System.out.println();

        customerOTP1.getAccounts("OTP0000001").deposit(500);
        System.out.println(customerOTP1);
        System.out.println();
//Print the customer having id equal to 2 to the standard output
        System.out.println(bank1.getCustomer(2));
//Print the customers of the bank to a file (e.g. bank_customers.csv)
        bank1.printCustomersToFile("bank_customers.csv");

//        accounts.get(0).deposit(500);
//        System.out.println(customerOTP1);
//
//        BankAccount account = customerOTP1.getAccounts(accounts.get(0).getAccountNumber());
//        if (account != null) {
//            account.deposit(500);
//        }
//        System.out.println(customerOTP1);
    }
}
