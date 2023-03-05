package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    //konstruktor
    public Customer(String pFirstName, String pLastName) {
        firstName = pFirstName;
        lastName = pLastName;
    }

    //metodusok
    //1
    public void addAccount(BankAccount account) {
        if (numAccounts == MAX_ACCOUNTS) {
            System.out.println("LIMIT REACHED!\n");
        } else {
            accounts[numAccounts] = account;
            numAccounts++;
        }
    }

    //2
    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    //3
    public Integer getNumAccounts() {
        return numAccounts;
    }

    //4
    public String getFirstName() {
        return firstName;
    }

    //5
    public String getLastName() {
        return lastName;
    }

    //6
    public void setLastName(String pLastName) {
        lastName = pLastName;
    }

    //7
    public void closeAccount(String accountNumber) {
        int original = numAccounts;
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i] = accounts[numAccounts - 1];
                accounts[numAccounts - 1] = null;
                numAccounts--;
                break;
            }
        }
        if(original == numAccounts){
            System.out.println("Doesn't exist!\n");
        }
    }

    //8
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i] + "\n");
        }
        return result.toString();
    }
}
