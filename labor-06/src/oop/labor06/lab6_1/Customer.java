package oop.labor06.lab6_1;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private final int ID; //amint inicializalva lett, utana nem lehet megvaltoztatni
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    private static int nextID = 1;

    //constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = nextID;
        nextID++;
    }

    //methods
    public int getID() {
        return ID;
    }

    //1.
    public int getNumAccounts() {
        int counter = 0;
        for (BankAccount item : accounts) {
            counter++;
        }
        return counter;
    }

    //2.
    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    //3. //atirni BankAccount-ra
    public BankAccount getAccounts(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
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
    public void closeAccount(String accountNumber) {
        int original = getNumAccounts();
        int temp = getNumAccounts();
        for (int i = 0; i < temp; i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
                accounts.set(i, accounts.get(temp - 1));
                accounts.set(temp - 1, null);
                temp--;
                break;
            }
        }
        if (original == temp) {
            System.out.println("Doesn't exist!\n");
        }
    }

    //8.
//    @Override
//    public String toString() {
//        return firstName + " " + lastName + " accounts\n\n" + accounts +
//                "\n\n";
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                ", accounts=" + accounts +
                '}';
    }
}
