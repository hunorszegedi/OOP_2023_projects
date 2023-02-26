package oop.labor02;

public class Rectangle {
    private double length;
    private double width;

    //konstruktor//nincs visszateritesi tipusa
    public Rectangle(double plength, double pwidth) {
        length = plength;
        width = pwidth;
    }

    //get metodus//soha nincs parameter
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return (length * width);
    }

    public double perimeter() {
        return (2 * length + 2 * width);
    }

    //mindent
    public String toString() {
        return "\tParameter\n\n" + "Hosszusag: " + length + "\nSzelesseg: " + width + "\nTerulet: " + area() + "\nKerulet: " + perimeter() + "\n";
    }

    //mindent2
    public String toString2(){
        System.out.printf(" Parameter:\nLength: %.2f\nWidth: %.2f\nArea: %.2f\nPerimeter: %.2f\n", length, width, area(), perimeter());
        return "";
    }

}
