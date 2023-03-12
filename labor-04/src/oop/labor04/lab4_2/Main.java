package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readFromCSVFile("lab4_2_input.csv");
        System.out.println(customers);
    }

    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String type = items[0].trim();
                if (type.equals("Customer")) {
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    customers.add(new Customer(firstName, lastName));
                } else if (type.equals("Account")) {
                    String accountNumber = items[1].trim();
                    double balance = Double.parseDouble(items[2].trim());
                    BankAccount account = new BankAccount(accountNumber);
                    account.deposit(balance);
                    Customer customer = customers.get(customers.size() - 1);
                    customer.addAccount(account);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error message!\n");
        }
        return customers;
    }
}

