package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

import java.util.Arrays;

public class Customer {
    private String firstName;
    private String lastName;
    // constant
    public static final int MAX_ACCOUNTS = 10;
    // number of accounts
    private int numAccounts;
    // an array for the accounts
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    public Customer(String pFirstName, String pLastName) {
        firstName = pFirstName;
        lastName = pLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(BankAccount pAccount) {
        if (numAccounts < MAX_ACCOUNTS) {
            for (int i = 0; i < numAccounts; i++) {
                if (accounts[i] != null) {
                    accounts[i] = pAccount;
                    break;
                }
            }
        }

    }

    public void setLastName(String pLastName) {
        lastName = pLastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numAccounts=" + numAccounts +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}