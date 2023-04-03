package oop.labor08.lab8_1;


public class BankAccount {
    protected final String accountNumber;
    protected double balance;
    public static final String PREFIX = "OTP";
    private static int numAccounts = 0;
    private static final int ACCOUNT_NUMBER_LENGTH = 10;

    protected BankAccount() {
        numAccounts++;
        this.accountNumber = createAccountNumber();
    }

    private static String createAccountNumber() {
        int numZeros = ACCOUNT_NUMBER_LENGTH - PREFIX.length() - ("" + numAccounts).length();
        return PREFIX + "0".repeat(numZeros) + numAccounts;
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

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
