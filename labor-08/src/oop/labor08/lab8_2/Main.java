package oop.labor08.lab8_2;

public class Main {
    public static void main(String[] args) {

        StackAggregation stack1 = new StackAggregation(5);
        for (int i = 0; i < 10; ++i) {
// boxing: int --> Integer
            stack1.push(i);
        }
        System.out.print("StackAggregation : ");
        while (!stack1.isEmpty()) {
            System.out.print(stack1.top() + " ");
            stack1.pop();
        }
        System.out.println();
        StackInheritance stack2 = new StackInheritance(5);
        for (int i = 0; i < 10; ++i) {
            stack2.push(i);
        }
        stack2.remove(1);
        System.out.print("StackInheritance : ");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.top() + " ");
            stack2.pop();
        }
        System.out.println();
    }
}
//push betesz
//pop torol
//top csak visszateriti, hogy mi van a tetejen
//csak lekerdezest vegez
//inmutable
//! ha üres
//null-t adjon vissza, ha üres
