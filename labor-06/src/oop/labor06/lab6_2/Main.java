package oop.labor06.lab6_2;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(3, 1);
//        m1.printMatrix();
//        System.out.println();
        Matrix m2 = new Matrix(1, 3);
//        m2.printMatrix();
//        m1.fillValues(1);
//        m2.fillValues(2);
        m1.fillRandom(1,10);
        m2.fillRandom(1, 10);
        System.out.println("\tMATRIX 1:");
        m1.printMatrix();
        System.out.println("\tMATRIX 2:");
        m2.printMatrix();

//        Matrix sum = Matrix.add(m1,m2);
//        System.out.println("\tSUM:");
//        sum.printMatrix();

        Matrix multiply = Matrix.multiply(m1,m2);
        System.out.println("\tMULTIPLY:");
        multiply.printMatrix();

    }
}
