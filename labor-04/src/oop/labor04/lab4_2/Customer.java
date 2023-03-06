package oop.labor04.lab4_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    //constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods
    //1.

    //2.
    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    //3. //atirni BankAccount-ra
    public void getAccounts(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println(account);
            }
        }
    }


    //4.
    public String getFirstName() {
        return firstName;
    }

    //5.
    public String getLastName() {
        return lastName;
    }

    //6.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //7.

    //8.
}
