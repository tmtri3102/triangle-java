public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Default constructor
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Constructor with parameters for the sides
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter methods for side1, side2, and side3
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Method to calculate area of the triangle using Heron's formula
    public double getArea() {
        double s = getPerimeter() / 2;  // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // toString method
    @Override
    public String toString() {
        return "A Triangle with sides " + side1 + ", " + side2 + ", " + side3 + " which is a subclass of " + super.toString();
    }
}

