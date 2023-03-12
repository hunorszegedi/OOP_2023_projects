package oop.labor04.lab4_3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MyArray a1 = new MyArray(5);
        a1.print();
        a1.fillRandom(0, 9);
        a1.print();
        a1.sort();
        a1.print();
        System.out.printf("\tMean: %10.2f Stddev: %10.2f\n",
                a1.mean(), a1.stddev());
        double t[] = {4, 9, 0, -34, 28, 76, 100, -1};
        MyArray a2 = new MyArray(t);
        a2.print();
        a2.sort();
        a2.print();
        System.out.printf("\tMean: %10.2f Stddev: %10.2f\n",
                a2.mean(), a2.stddev());
        MyArray a3 = new MyArray("data.txt");
        a3.print();
        MyArray a4 = new MyArray(a3);
        a3.sort();
        a3.print();
        System.out.printf("\tMean: %10.2f Stddev: %10.2f\n",
                a3.mean(), a3.stddev());
        a4.print();
    }
}
