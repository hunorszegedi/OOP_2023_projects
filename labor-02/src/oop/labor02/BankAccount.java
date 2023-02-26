package oop.labor02;

public class BankAccount {
    private String accountNumber;
    private double balance;

    //konstruktor//nincs visszateritesi tipusa
    public BankAccount(String pAccountNumber) {
        accountNumber = pAccountNumber;
    }

    //get metodus//soha nincs parameter
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    //mindent
    public String toString() {
        return "\tBankAccount\n" + "Szamlaszam: " + accountNumber + "\nEgyenleg: " + balance;
    }

}
