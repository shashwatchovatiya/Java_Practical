// ! Create class calculation with an abstract method area( ). Create Rectangle and Triangle subclasses of calculation and find area of rectangle and triangle.

// ! this is Simplest method without user input we giving number by default

// Abstract class Calculation
abstract class Calculation {
    // Abstract method area()
    public abstract double area();
}

// Rectangle subclass
class Rectangle extends Calculation {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of area() method for Rectangle
    @Override
    public double area() {
        return length * width;
    }
}

// Triangle subclass
class Triangle extends Calculation {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of area() method for Triangle
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Main class to test the implementation
public class Practical_9 {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Create a Triangle object
        Triangle triangle = new Triangle(4, 6);
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
// ! this is user input number method   
// import java.util.Scanner;

// // Abstract class Calculation
// abstract class Calculation {
//     // Abstract method area()
//     public abstract double area();
// }

// // Rectangle subclass
// class Rectangle extends Calculation {
//     private double length;
//     private double width;

//     // Constructor
//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     // Implementation of area() method for Rectangle
//     @Override
//     public double area() {
//         return length * width;
//     }
// }

// // Triangle subclass
// class Triangle extends Calculation {
//     private double base;
//     private double height;

//     // Constructor
//     public Triangle(double base, double height) {
//         this.base = base;
//         this.height = height;
//     }

//     // Implementation of area() method for Triangle
//     @Override
//     public double area() {
//         return 0.5 * base * height;
//     }
// }

// // Main class to test the implementation
// public class Practical_9 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get input for Rectangle
//         System.out.println("Enter dimensions for Rectangle:");
//         System.out.print("Length: ");
//         double length = scanner.nextDouble();
//         System.out.print("Width: ");
//         double width = scanner.nextDouble();

//         // Create a Rectangle object
//         Rectangle rectangle = new Rectangle(length, width);
//         System.out.println("Area of Rectangle: " + rectangle.area());

//         // Get input for Triangle
//         System.out.println("\nEnter dimensions for Triangle:");
//         System.out.print("Base: ");
//         double base = scanner.nextDouble();
//         System.out.print("Height: ");
//         double height = scanner.nextDouble();

//         // Create a Triangle object
//         Triangle triangle = new Triangle(base, height);
//         System.out.println("Area of Triangle: " + triangle.area());

//         scanner.close();
//     }
// }