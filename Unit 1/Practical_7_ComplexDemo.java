// Renamed class Complex
class Complex {
    int real, img;

    // Default constructor
    Complex() {
        real = img = 0;
    }

    // Constructor for equal real and imaginary parts
    Complex(int x) {
        real = img = x;
    }

    // Constructor for different real and imaginary parts
    Complex(int x, int y) {
        real = x;
        img = y;
    }

    // Method to add two complex numbers
    Complex add(Complex b) {
        Complex temp = new Complex();
        temp.real = this.real + b.real;
        temp.img = this.img + b.img;
        return temp;
    }

    // Method to subtract two complex numbers
    Complex sub(Complex b) {
        Complex temp = new Complex();
        temp.real = this.real - b.real;
        temp.img = this.img - b.img;
        return temp;
    }

    // Method to multiply two complex numbers using the correct formula
    Complex multi(Complex b) {
        Complex temp = new Complex();
        temp.real = (this.real * b.real) - (this.img * b.img);  // Real part
        temp.img = (this.real * b.img) + (this.img * b.real);   // Imaginary part
        return temp;
    }

    // Method to display the complex number
    void display() {
        System.out.println("Real = " + real + ", Imaginary = " + img);
    }
}

// Demo class to test the Complex class
public class Practical_7_ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(10);        // Complex number 10 + 10i
        Complex c2 = new Complex(20, 30);    // Complex number 20 + 30i
        Complex c3;                          // Placeholder for result complex number

        // Adding two complex numbers
        c3 = c1.add(c2);
        System.out.print("After addition: ");
        c3.display();

        // Subtracting two complex numbers
        c3 = c1.sub(c2);
        System.out.print("After subtraction: ");
        c3.display();

        // Multiplying two complex numbers
        c3 = c1.multi(c2);
        System.out.print("After multiplication: ");
        c3.display();

        
    }
}
