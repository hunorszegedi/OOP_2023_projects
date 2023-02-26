package oop.labor02;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("\n\tExercise 1:\n");

        //1. Create a bank account (accountNumber: OTP00001)
        BankAccount account1 = new BankAccount("OTP00001");

        //2. Print the bank account number and the balance
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        //3. Deposit 1000 EUR
        //4. Print the bank account number and the balance
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        //5. Withdraw 500 EUR
        //6. Print the bank account number and the balance
        boolean result = account1.withdraw(500);
        if (!result) {
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());


        //7. Withdraw 1000 EUR
        boolean result2 = account1.withdraw(1000);
        if (!result2) {
            System.out.println("You do not have sufficient funds for this operation!");
        }
        //8. Print the bank account number and the balance
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        //9. Create a second bank account (accountNumber: OTP00002)
        BankAccount account2 = new BankAccount("OTP00002");

        //10. Print the bank account number and the balance
        System.out.println("\n");
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());

        //11. Deposit 2000 EUR
        account2.deposit(2000);

        //12. Print the bank account number and the balance
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());

        //minden
        System.out.println("\n");
        System.out.println(account1.toString());
        System.out.println(account2.toString());


        //Exercise 2
        System.out.println("\n\tExercise 2:");

        //1. Create an array of 10 references of type Rectangle
        Rectangle[] rectangles = new Rectangle[10];

        //2. Initialize each element of the array with a new rectangle. Generate randomly the value
        //of the length and width attributes (1 <= length <= 10, 1 <= width <=10).

        //random generator
        Random rand = new Random();

        //generate positive random numbers less than a bound
        for (int i = 0; i < 10; i++) {
            double lengthR = 1 + rand.nextDouble(10);
            double widthR = 1 + rand.nextDouble(10);
            rectangles[i] = new Rectangle(lengthR, widthR);

        }

        //3.  Print the rectangles to the standard output. Print the following about a rectangle: length, width, perimeter, area
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("\n\t%d. Rectangle information\nLength: %.2f\nWidth: %.2f\n", i, rectangles[i].getLength(), rectangles[i].getWidth());
//        }

//        System.out.printf("\n\n");
//        for (int i = 0; i < 10 ; i++) {
//            System.out.printf("\t%d.", i);
//            System.out.println(rectangles[i].toString());
//        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("\t%d.", i + 1);
            System.out.println(rectangles[i].toString2());
        }

        //4. Calculate the total area of the generated rectangles
        double totalGeneratedArea = 0;
        for (int i = 0; i < 10; i++) {
            totalGeneratedArea += rectangles[i].area();
        }
        System.out.printf("Total area of the generated ractangles: %.3f", totalGeneratedArea);

        
        //Exercise 3
        System.out.println("\n\tExercise 3:\n");

    }
}

