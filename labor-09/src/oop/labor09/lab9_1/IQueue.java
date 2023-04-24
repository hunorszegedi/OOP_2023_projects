package oop.labor09.lab9_1;

public interface IQueue {

    boolean isEmpty();
    boolean isFull();
    void enQueue(Object item);
    Object deQueue();
    void printQueue();

}
