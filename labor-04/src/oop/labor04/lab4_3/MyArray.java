package oop.labor04.lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double[] elements;

    // Constructor for creating a MyArray of a given size
    public MyArray(int length) {
        this.length = length;
        elements = new double[length];
    }

    // Constructor for creating a MyArray from a Java double[] array
    public MyArray(double[] arr) {
        length = arr.length;
        elements = new double[length];
        System.arraycopy(arr, 0, elements, 0, length);
    }

    // Constructor for creating a deep copy of an existing MyArray
    public MyArray(MyArray arr) {
        length = arr.length();
        elements = new double[length];
        System.arraycopy(arr.getArray(), 0, elements, 0, length);

    }

    // Constructor for creating a MyArray from a file that contains the size and the elements
    public MyArray(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        length = scanner.nextInt();
        elements = new double[length];

        for (int i = 0; i < length; i++) {
            elements[i] = scanner.nextDouble();
        }
    }

    // Returns the length of the MyArray
    public int length() {
        return length;
    }

    // Returns a reference to the underlying double[] array
    public double[] getArray() {
        return elements;
    }

    // Returns the element at the given index
    public double get(int index) {
        return elements[index];
    }

    // Sets the element at the given index to the given value
    public void set(int index, double value) {
        elements[index] = value;
    }

    // Fill the array with random numbers from [a,b)
    public void fillRandom(double a, double b) {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            elements[i] = a + (b - a) * random.nextDouble();
        }
    }

    // Calculate the mean of the array
    public double mean() {
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += elements[i];
        }
        return sum / length;
    }

    // Calculate the standard deviation of the array
    public double stddev() {
        double sum = 0;
        double mean = mean();
        for (int i = 0; i < length; i++) {
            sum += Math.pow(elements[i] - mean, 2);
        }
        return Math.sqrt(sum / length);
    }

    // Sort the elements of the array
    public void sort() {
        Arrays.sort(elements);
    }

    // Print the elements of the array
    public void print(String arrayName) {
        System.out.println(arrayName);
        System.out.print("[ ");
        for (int i = 0; i < length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("]");
    }
}

