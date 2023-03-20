package oop.labor06.lab6_2;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private final int rows;
    private final int columns;
    private double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%6.2f", data[i][j]);
            }
            System.out.println("\n");
        }
    }

    public void fillValues(double value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = value;
            }
        }
    }

    public void fillRandom(double lower, double upper) {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = random.nextDouble(lower, upper);
            }
        }
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows && m1.columns != m2.columns) {
            System.out.println("Matrix is not addable!\n");
            return null;
        }
        Matrix sum = new Matrix(m1); //m1-et hozom letre s ehhez adom hozza az m2 erteketet
        for (int i = 0; i < sum.rows; i++) {
            for (int j = 0; j < sum.columns; j++) {
                sum.data[i][j] += m2.data[i][j];
            }
        }
        return sum;
    }

    //2 sor x 3 oszlop
    //3 sor x 2 oszlop
    //==> 2 sor x 2 oszlop
    //if matrix1.columns != matrix2.rows ==> cant multiply
    public static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1.columns != m2.rows) {
            System.out.println("Matrix can not be multiplied!\n");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m2.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.columns; j++) {
                double sum = 0;
                for (int k = 0; k < m1.columns; k++) {
                    sum += m1.data[i][k] * m2.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    public static Matrix transpose(Matrix m) {
        int newRows = m.columns;
        int newColumns = m.rows;
        Matrix transpose = new Matrix(newRows, newColumns);

        for (int i = 0; i < newRows; i++) {
            for (int j = 0; j < newColumns; j++) {
                transpose.data[i][j] = m.data[j][i];
            }
        }
        return transpose;
    }

    public Matrix(Matrix matrix) {
        this.rows = matrix.rows;
        this.columns = matrix.columns;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = matrix.data[i][j];
            }
        }
    }
}
