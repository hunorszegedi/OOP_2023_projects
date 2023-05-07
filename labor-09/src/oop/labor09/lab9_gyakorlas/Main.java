package oop.labor09.lab9_gyakorlas;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IQueue queue = new ArrayListQueue(5); // new CircularQueue( 5 );
        Random rnd = new Random();
        for (int i = 0; i < 100; ++i) {
            int value = rnd.nextInt(100);
            if (value < 50) {
                System.out.println("Add: " + i);
                queue.enQueue(i);
            } else {
                if (queue.isEmpty()) {
                    System.out.println("Cannot delete from an empty queue");
                } else {
                    int element = (Integer) queue.deQueue();
                    System.out.println("Deleted: " + element);
                }
            }
            queue.printQueue();
        }
        System.out.println();
        IQueue q1 = new ArrayListQueue(5);
        IQueue q2 = new ArrayListQueue(10);
        for (int i = 0; i < 5; ++i) {
            q1.enQueue(i);
            q2.enQueue(i);
        }
        System.out.println(q1.equals(q2));

        IQueue q3 = new CircularQueue(5);
        IQueue q4 = new CircularQueue(5);
        for (int i = 1; i < 6; ++i) {
            q3.enQueue(i);
        }
        q4.enQueue(1);
        q4.enQueue(1);
        for (int i = 1; i < 4; ++i) {
            q4.enQueue(i);
        }
        q4.deQueue();
        q4.deQueue();
        q4.enQueue(4);
        q4.enQueue(5);
        System.out.println(q3.equals(q4));
    }
}

