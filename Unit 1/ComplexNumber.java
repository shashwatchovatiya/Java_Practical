// ! Practical-7
public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize a complex number
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Method to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Method to multiply two complex numbers
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Method to return the real part
    public double getReal() {
        return this.real;
    }

    // Method to return the imaginary part
    public double getImaginary() {
        return this.imaginary;
    }

    // Method to display the complex number in a+bi format
    @Override
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }

    // Main method for testing
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);

        // Adding two complex numbers
        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum);

        // Subtracting two complex numbers
        ComplexNumber difference = c1.subtract(c2);
        System.out.println("Difference: " + difference);

        // Multiplying two complex numbers
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Product: " + product);

        // Getting real and imaginary parts
        System.out.println("Real part of c1: " + c1.getReal());
        System.out.println("Imaginary part of c1: " + c1.getImaginary());
    }
}
// public class ComplexNumber {
//     private double real;
//     private double imag;

//     public ComplexNumber(double real, double imag) {
//         this.real = real;
//         this.imag = imag;
//     }

//     public double getReal() {
//         return real;
//     }

//     public double getImag() {
//         return imag;
//     }

//     public ComplexNumber add(ComplexNumber other) {
//         return new ComplexNumber(this.real + other.real, this.imag + other.imag);
//     }

//     public ComplexNumber subtract(ComplexNumber other) {
//         return new ComplexNumber(this.real - other.real, this.imag - other.imag);
//     }

//     public ComplexNumber multiply(ComplexNumber other) {
//         double newReal = this.real * other.real - this.imag * other.imag;
//         double newImag = this.real * other.imag + this.imag * other.real;
//         return new ComplexNumber(newReal, newImag);
//     }

//     @Override
//     public String toString() {
//         return real + " + " + imag + "i";
//     }

//     public static void main(String[] args) {
//         ComplexNumber c1 = new ComplexNumber(3, 2);
//         ComplexNumber c2 = new ComplexNumber(1, 7);

//         System.out.println("c1 = " + c1);
//         System.out.println("c2 = " + c2);

//         ComplexNumber sum = c1.add(c2);
//         System.out.println("c1 + c2 = " + sum);

//         ComplexNumber difference = c1.subtract(c2);
//         System.out.println("c1 - c2 = " + difference);

//         ComplexNumber product = c1.multiply(c2);
//         System.out.println("c1 * c2 = " + product);

//         System.out.println("Real part of c1: " + c1.getReal());
//         System.out.println("Imaginary part of c1: " + c1.getImag());
//     }
// }