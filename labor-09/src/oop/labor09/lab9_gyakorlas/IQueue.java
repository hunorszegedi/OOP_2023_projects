package oop.labor09.lab9_gyakorlas;

public interface IQueue {

    boolean isEmpty();

    boolean isFull();

    void enQueue(Object item);

    Object deQueue();

    void printQueue();
}
