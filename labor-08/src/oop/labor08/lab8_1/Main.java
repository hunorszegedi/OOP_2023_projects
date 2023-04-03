package oop.labor08.lab8_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //checking//balance-t elengedem egeszen a -hitelkeretig
        Customer customerOTP1 = new Customer("Mike", "Tyson");
        Customer customerOTP2 = new Customer("Jonah", "Hill");
        Bank bank1 = new Bank("OTP");

        SavingAccount saving1 = new SavingAccount(10);
        SavingAccount saving2 = new SavingAccount(9.5);
        CheckingAccount checking1 = new CheckingAccount(2000);
        CheckingAccount checking2 = new CheckingAccount(3000);
        customerOTP1.addAccount(saving1);
        customerOTP1.addAccount(checking1);
        customerOTP2.addAccount(saving2);
        customerOTP2.addAccount(checking2);

        System.out.println(customerOTP1);
        System.out.println(customerOTP2);

        bank1.addCustomer(customerOTP1);
        bank1.addCustomer(customerOTP2);

        System.out.println(bank1);

        saving1.deposit(500);
        saving2.deposit(2000);

        System.out.println(customerOTP1);
        System.out.println(customerOTP2);

        saving1.addInterest();
        System.out.println(customerOTP1);

        checking1.withdraw(100);
        checking2.withdraw(150);

        System.out.println(customerOTP1);
        System.out.println(customerOTP2);
    }
}
