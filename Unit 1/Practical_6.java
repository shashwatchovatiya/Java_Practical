//! Write a program to calculate the area of square and rectangle by over loading the area method.
public class Practical_6{

    // Method to calculate the area of a square (side * side)
    public double area(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle (length * width)
    public double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        // Create an instance of AreaCalculator
        Practical_6 calculator = new Practical_6();

        // Calculate the area of a square
        double side = 5.0;  // Example side length
        double squareArea = calculator.area(side);
        System.out.printf("The area of the square with side %.2f is: %.2f%n", side, squareArea);

        // Calculate the area of a rectangle
        double length = 7.0;  // Example length
        double width = 4.0;   // Example width
        double rectangleArea = calculator.area(length, width);
        System.out.printf("The area of the rectangle with length %.2f and width %.2f is: %.2f%n", length, width, rectangleArea);
    }
}
