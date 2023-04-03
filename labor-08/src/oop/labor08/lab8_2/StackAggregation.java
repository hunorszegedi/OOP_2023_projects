package oop.labor08.lab8_2;

import java.util.ArrayList;
import java.util.Objects;

public class StackAggregation {
    private final int capacity;
    ArrayList<Object> items = new ArrayList<>();

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public void push(Object item) {
        if (items.size() == capacity) {
            System.out.println("Stack is FULL!\n");
            return;
        }
        items.add(item);
    }

    public void pop() {
        if (items.size() == 0) {
            return;
        }
        items.remove(items.size() - 1);
    }

    public Object top() {
        if (items.isEmpty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return items.size() == capacity;
    }

    public int getSize() {
        return items.size();
    }

}
