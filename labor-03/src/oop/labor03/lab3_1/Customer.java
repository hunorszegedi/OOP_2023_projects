package oop.labor03.lab3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String pFirstName, String pLastName) {
        firstName = pFirstName;
        lastName = pLastName;
    }

    public void setAccount(BankAccount pAccount) {
        account = pAccount;
    }

    public void closeAccount() {
        account = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setLastName(String pLastName) {
        lastName = pLastName;
    }

    //minden
    @Override
    public String toString() {
        return "Customer\n" +
                "\tFirst Name: " + firstName + '\n' +
                "\tLast Name: " + lastName + '\n' +
                "\tAccount: " + account +
                '\n';
    }

}
