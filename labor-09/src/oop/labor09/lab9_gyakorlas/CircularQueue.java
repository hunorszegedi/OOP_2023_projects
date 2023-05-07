package oop.labor09.lab9_gyakorlas;

public class CircularQueue implements IQueue {
    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int capacity) {
        CAPACITY = capacity;
        items = new Object[CAPACITY];
        front = -1;
        rear = -1;
    }


    @Override
    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else return false;
    }

    @Override
    public boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object item) {
        if (isFull()) {
            System.out.println("Queue is full!\n");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % CAPACITY;
            items[rear] = item;
            System.out.println("Inserted: " + item);
        }
    }

    @Override
    public Object deQueue() {
        Object item;
        if (isEmpty()) {
            System.out.println("Queue is empty!\n");
            return (-1);
        } else {
            item = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Queue has only 1 element, so we reset the queue after deleting it*/ else {
                front = (front + 1) % CAPACITY;
            }
            return item;
        }
    }

    //Function to display status of Circular Queue
    @Override
    public void printQueue() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % CAPACITY)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    public int size() {
        if (front == -1) {
            return 0;
        } else if (front <= rear) {
            return rear - front + 1;
        } else {
            return CAPACITY - front + rear + 1;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        if (this.size() != that.size()) return false;

        int thisIndex = front;
        int thatIndex = that.front;

        for (int i = 0; i < size(); i++) {
            Object thisElem = items[thisIndex];
            Object thatElem = that.items[thatIndex];

            if (thisElem == null && thatElem == null) {
                continue;
            }
            if (thisElem == null || thatElem == null) {
                return false;
            }
            if (!thisElem.equals(thatElem)) {
                return false;
            }

            thisIndex = (thisIndex + 1) % CAPACITY;
            thatIndex = (thatIndex + 1) % that.CAPACITY;
        }

        return true;
    }


}
