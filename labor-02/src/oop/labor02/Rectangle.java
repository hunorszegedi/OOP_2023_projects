package oop.labor02;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double plength, double pwidth) {
        length = plength;
        width = pwidth;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }

    //mindent
    public String toString() {
        return "\tParameter\n" + "Hosszusag: " + length + "\nSzelesseg: " + width + "\nTerulet: " + area() + "\nKerulet: " + perimeter();
    }
}
