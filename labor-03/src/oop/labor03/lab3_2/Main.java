package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;
import oop.labor03.lab3_2.Customer;

public class Main {
    public static void main(String[] args) {

        //creating customer
        Customer customer1 = new Customer("Szegedi", "Hunor");
        customer1.addAccount(new BankAccount("OTP001"));
        //add account
        System.out.println(customer1);


    }
}
