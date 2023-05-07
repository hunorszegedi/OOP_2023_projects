package oop.labor09.lab9_gyakorlas;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue {
    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        items = new ArrayList<>(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object item) {
        if (items.size() < CAPACITY) {
            items.add(item);
        }
    }

    @Override
    public Object deQueue() {
        return items.remove(0);
    }

    @Override
    public void printQueue() {
        System.out.println(items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }

    //
    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
