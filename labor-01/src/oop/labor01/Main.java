package oop.labor01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Labor 1 - I.1 feladat");
        System.out.println("Szegedi Hunor");

        System.out.println("Labor 1 - I.2 feladat");
        String name = "Szegedi Hunor";

        //name.length() string hossza
        //name.charAt(i)-ik pozicion levo char-t kiirja
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }


        System.out.println("Labor 1 - I.3 feladat");
        String name2 = "Joe Donald Biden";
        String[] newStr = name2.split(" ");
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);

        }


        System.out.println("Labor 1 - I.4 feladat");
        String name3 = "TREE";
        int length = name3.length();
        for (int i = 0; i <= length; i++) {
            System.out.println(name3.substring(0, i));
        }

        System.out.println("\n\tLabor 1 - II. Static Functions:\n");
        System.out.println("\t\nExercise numero 1.");
        System.out.printf("Write some test code for the maxElement function. For example");
        System.out.println("MAX CALCULATOR:");
        double x[] = {7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement(x));

        System.out.println("\t\nExercise numero 2.");
        System.out.printf("Write a function that returns the value of a given bit in a number. The bits are numbered from\n" +
                "right to left, starting from 0. Use bit operations (loops are forbidden!).");
        System.out.println("BITS:");
        int n = 23;
        int order = 2;
        byte bitValue = getBit(n, order);
        System.out.println(bitValue);

        System.out.println("\t\nExercise numero 3.");
        System.out.printf("Write a function that counts the number of ‘1’ bits. Use bit operations:\n");
        System.out.printf("%d", countBits(n));

        System.out.println("\t\nExercise numero 4.");
        System.out.printf("Write a function that computes the mean of an array. In case of an empty array, return\n" +
                "Double.NaN. Test your function!\n");
        double array[] = {1.1, 1.1, 1.1, 9.1, 1.1};
        System.out.printf("Mean equals: %.2f", mean(array));

        System.out.println("\t\nExercise numero 5.");
        System.out.printf("Write a function that computes the standard deviation of an array of real numbers. In case of\n" +
                "an empty array returns Double.NaN. Test your function!\n");

        System.out.println("\t\nExercise numero 6.");
        System.out.printf("Compute the two largest elements of an array using a single loop.\n");
        double array2[] = {1.1, 9, 8.8, 3, 2.1};
        double maxx[] = max2(array2);
        for (int i = 0; i < maxx.length; i++) {
            System.out.printf("%.2f ", maxx[i]);
        }

        System.out.println("\t\n\nExercise numero 7.");
        System.out.printf("Create a function that populates an array of 1000000 integers with random values. Sort the\n" +
                "array (use Arrays.sort), then prints the number of duplicatesa\n");
        random(100);

    }

    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static byte getBit(int number, int order) {
        // Shift the number right by 'order' bits, so that the target bit is now in the rightmost position
        int shiftedNumber = number >> order;

        // AND the shifted number with 1, to get the value of the rightmost bit (the target bit)
        int bitValue = shiftedNumber & 1;

        // Cast the bit value to a byte and return it
        return (byte) bitValue;
    }

    public static int countBits(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static double mean(double array[]) {
        double sum = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum / array.length;
        } else return Double.NaN;
    }

    public static double[] max2(double array2[]) {
        double max[] = {Double.NEGATIVE_INFINITY,
                Double.NEGATIVE_INFINITY};
        if (array2.length == 0) {
            return max;
        } else {
            double maximum1 = array2[0];
            for (int i = 0; i < array2.length; i++) {
                if (array2[i] > maximum1) {
                    maximum1 = array2[i];
                }
            }
            max[0] = maximum1;
            double maximum2 = array2[0];
            for (int i = 0; i < array2.length; i++) {
                if (array2[i] > maximum2 && array2[i] < maximum1) {
                    maximum2 = array2[i];
                }
            }
            max[1] = maximum2;
        }
        return max;
    }

    public static void random(int n) {
        double[] array3 = new double[n];
        for (int i = 0; i < n; i++) {
            array3[i] = Math.random() * 49 + 1;
        }
        Arrays.sort(array3);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d: %.2f\n", i + 1, array3[i]);
        }
    }

}

