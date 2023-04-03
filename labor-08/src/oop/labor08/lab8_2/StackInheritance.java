package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private int capacity;

    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }

    public void push(Object item) {
        if (this.size() == capacity) {
            System.out.println("Stack is FULL!");
            return;
        }
        this.add(item);
    }

    public void pop() {
        if (this.isEmpty()) {
            return;
        }
        this.remove(this.size() - 1);
    }

    //orokolte az isEmpty-t, nem kell megirni
    public Object top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.get(this.size() - 1);
    }

    public boolean isFull() {
        return this.size() == capacity;
    }

    public int getSize() {
        return this.size();
    }
}
